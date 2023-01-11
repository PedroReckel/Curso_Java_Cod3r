package desafios_controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdinvinhacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random generator = new Random();
		
		for(int i = 10; i >= 0; i--) {
			int random = generator.nextInt(11);
			System.out.println("Digite um numero: ");
			int num = entrada.nextInt();
			if(num == random) {
				System.out.printf("Você tirou o numero %d e o numero que você "
						+ "escolheu é: %d\n", random, num);
				System.out.println("Meus parabéns!!!");
			} else {
				System.out.printf("Você tirou o numero %d e o numero que você "
						+ "escolheu é: %d\n", random, num);
				System.out.println("Não foi dessa vez...");
			}
			
			System.out.printf("você só tem mais %d tentativas\n", i);
		}
		 
		entrada.close();
		
	}
	
}
