package desafios_controle;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.printf("O ano %d\n é bissexto!", ano);
		} else {
			System.out.printf("O ano %d\n não é bissexto!", ano);
		}
		
		entrada.close();
		
	}
	
}
