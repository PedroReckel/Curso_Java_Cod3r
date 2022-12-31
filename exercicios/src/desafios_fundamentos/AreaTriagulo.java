package desafios_fundamentos;

import java.util.Scanner;

public class AreaTriagulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite a largura do triângulo: ");
		double base = entrada.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("A área do triangulo é: " + area);
		
		entrada.close();
		
	}
	
}
