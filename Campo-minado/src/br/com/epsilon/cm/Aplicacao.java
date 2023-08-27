package br.com.epsilon.cm;

import br.com.epsilon.cm.modelo.Tabuleiro;
import br.com.epsilon.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);		
	}
	
}