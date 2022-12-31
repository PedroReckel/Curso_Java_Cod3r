package desafios_fundamentos;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu peso? ");
		double peso = entrada.nextDouble();
		
		System.out.println("Qual a sua altura? ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("O seu IMC é " + imc);

		entrada.close();
		
	}
	
}
