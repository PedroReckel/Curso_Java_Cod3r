package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Essa constante tem um valor que faz com que a operação padrão de fechamento da janela seja matar a aplicação
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // Centralizar na tela!
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu");
			}
			  
		});
		
		janela.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				
			}
			
			public void focusGained(FocusEvent e) {
				
			}
		});
		
		janela.setVisible(true);
		
	}
	
}