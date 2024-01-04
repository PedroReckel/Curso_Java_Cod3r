package br.com.epsilon.app.calculo;

import br.com.epsilon.app.calculo.interno.OperacoesAritmeticas;
import br.com.epsilon.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}