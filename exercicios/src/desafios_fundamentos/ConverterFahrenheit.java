package desafios_fundamentos;

import java.util.Scanner;

;

public class ConverterFahrenheit {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		double fahTemp = entrada.nextDouble();
		
		double celTemp = ((fahTemp - 32) * 5 / 9);
		System.out.println("A temperatura em celsius é: " + celTemp);
		
		entrada.close();
		
	}
	
}
