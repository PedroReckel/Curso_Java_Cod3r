package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		System.out.println(media);
		
		if (media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		} else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
	
}
