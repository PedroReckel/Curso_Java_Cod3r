package desafios_controle;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int maiorNum = 0;
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();
			
			if (num > maiorNum) {
				maiorNum = num;
			}
		}
		
		System.out.printf("O maior numero digitado foi %d\n", maiorNum);
		
		entrada.close();
	}
	
}
