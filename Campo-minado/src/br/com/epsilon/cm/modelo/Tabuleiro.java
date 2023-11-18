package br.com.epsilon.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void registrarObservadores(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	public void notificarObservadores(boolean resultado) {
		observadores.stream()
			.forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}
	
	public void abrir(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.abrir());
	}
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alternarMarcacao());
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			int aleatorio = (int)(Math.random() * campos.size()); // Casting da multiplicação de double para int.
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while(minasArmadas < minas);
	}

	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void gerarCampos() {
		for(int l = 0; l < linhas; l++) {
			for(int c = 0; c < colunas; c++) {
				Campo campo = new Campo(l,c);
				campo.registrarObservadores(this);
				campos.add(campo);
			}
		}
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado()); // Se todos os campos tem o objetivo alcançado significa que vc venceu	
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if(evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		} else if(objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}
	
	private void mostrarMinas() {
		campos.stream()
			.filter(c -> c.isMinado())
			.forEach(c -> c.setAberto(true));
	}
	
}