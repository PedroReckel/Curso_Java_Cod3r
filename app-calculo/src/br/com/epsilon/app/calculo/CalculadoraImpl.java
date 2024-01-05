package br.com.epsilon.app.calculo;

import br.com.epsilon.app.Calculadora;
import br.com.epsilon.app.calculo.interno.OperacoesAritmeticas;
import br.com.epsilon.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private String id = "abc";
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}

}