package desafios_fundamentos;

import java.util.Scanner;

public class ConverteCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius: ");
		double temCel = entrada.nextDouble();
		
		double temFah = (temCel * 9 / 5) + 32;
		System.out.println("A temperatura em fahrenheit é: " + temFah);
		
		entrada.close();
		
	}
	
}
