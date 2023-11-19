package br.com.epsilon.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.epsilon.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	// A ideia é dentro desse JPanel é colocar todos os botões que representam as linha e as colunas do jogo
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservadores(e -> {
			// TODO mostrar resultado para o usuário
		});
 		
	}
	
} 