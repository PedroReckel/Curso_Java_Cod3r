package br.com.epsilon.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.epsilon.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
//	A ideia é dentro desse JPanel é colocar todos os botões que representam as linha e as colunas do jogo
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservadores(e -> {
			
//			Quando se tem um problema de ordem de algo para ser executado uma das estrategias é usar a classe 
//			SwingUtilities e o metodo invokeLater
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou =)");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu :(");
				}
				
				tabuleiro.reiniciar();
			});
		});
 		
	}
	
} 