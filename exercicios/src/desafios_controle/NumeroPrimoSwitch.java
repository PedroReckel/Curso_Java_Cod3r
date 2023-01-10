package desafios_controle;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	public static void main(String[] args) {
		
		int contDiv = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num = entrada.nextInt();
		
		for(int i = 0; i > num; i++) {
			if(num % i == 0) {
				contDiv++;
			}
		}
		
		switch(contDiv) {
		case 0:
			System.out.printf("O numero %d é primo", num);
			break;
		default: 
			System.out.printf("O numero %d não é primo", num);

		} 
		
		entrada.close();
		
	}
	
}
