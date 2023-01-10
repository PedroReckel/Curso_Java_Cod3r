package desafios_controle;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		
		int contDiv = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = entrada.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				contDiv++;
			}
		}
		
		if(contDiv == 0) {
			System.out.println("O numero " + num + " é primo.");
		} else {
			System.out.println("O numero " + num + " não é primo.");
		}
		
		entrada.close();
	}
	
}
