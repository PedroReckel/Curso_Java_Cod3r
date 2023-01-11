package desafios_controle;

import java.util.Scanner;

public class NumPositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		
		while (num >= 0) {
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();
			soma += num; 
			System.out.printf("A soma dos numeros digitados é %d\n", soma);
		}
		
		System.out.printf("O numero digitado %d é negativo.\n", num);
		System.out.println("Fim.");
		
		entrada.close();
		
	}
	
}
