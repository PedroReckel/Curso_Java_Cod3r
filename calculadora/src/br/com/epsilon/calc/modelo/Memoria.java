package br.com.epsilon.calc.modelo;

import java.util.ArrayList;
import java.util.List;

// Singleton é um padrão de projeto aonde pode-se ter uma unica instancia de uma determinada classe. 
// Controla-se uma classe para que ela tenha apenas uma unica instancia colocando o construtor dessa classe como privado

public class Memoria {
	
	private enum TipoComando {
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, MUDASINA;
	};

	private static final Memoria instancia = new Memoria();
	
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	private TipoComando ultimaOperacao = null;
	private Boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
	
	private Memoria() {
		
	}
	
	public static Memoria getInstancia() {
		return instancia;
	}

	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public void processarComando(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto);
		System.out.println(tipoComando);
		
		if(tipoComando == null) {
			return;
		} else if(tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		} else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
		} else {
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
	
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultadoOperacao() {
		return textoAtual;
	}

	private TipoComando detectarTipoComando(String texto) {
		
		if(textoAtual.isEmpty() && texto == "0") {
			return null;
		}
		
		try {
			Integer.parseInt(texto); // Validar se o texto passado é um valor numerido
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			// Quando não for numerico
			if("AC".equals(texto)) {
				return TipoComando.ZERAR;
			} else if("/".equals(texto)) {
				return TipoComando.DIV;
			} else if("*".equals(texto)) {
				return TipoComando.MULT;
			} else if("+".equals(texto)) {
				return TipoComando.SOMA;
			} else if("-".equals(texto)) {
				return TipoComando.SUB;
			} else if("=".equals(texto)) {
				return TipoComando.IGUAL;
			} else if(",".equals(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			} else if("+/-".equals(texto)) {
				return TipoComando.MUDASINA;
			}
		}

		return null;
	}
	
}