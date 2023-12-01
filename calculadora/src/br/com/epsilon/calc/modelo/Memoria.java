package br.com.epsilon.calc.modelo;

import java.util.ArrayList;
import java.util.List;

// Singleton é um padrão de projeto aonde pode-se ter uma unica instancia de uma determinada classe. 
// Controla-se uma classe para que ela tenha apenas uma unica instancia colocando o construtor dessa classe como privado

public class Memoria {

	private static final Memoria instancia = new Memoria();
	
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	private String textoAtual = "";
	
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

	public void processarComando(String valor) {
		if("AC".equals(valor)) {
			textoAtual = "";
		} else {
			textoAtual += valor;
		}
	
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}
	
}