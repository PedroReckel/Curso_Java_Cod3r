package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler o numero1
		// Ler o numero2
		// + - * /
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador: ");
		String operador = entrada.next();
		
		/*double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.println(resultado);*/
		
		if ("+".equals(operador)) {
			
			double soma = num1 + num2;
			System.out.println(soma);
			
		} else if ("-".equals(operador)) {
			
			double subtracao = num1 - num2;
			System.out.println(subtracao);
			
		} else if ("*".equals(operador)) {
			
			double multiplicacao = num1 * num2;
			System.out.println(multiplicacao);
			
		} else if ("/".equals(operador)) {
			
			double divisao = num1 / num2;
			System.out.println(divisao);
			
		} else if ("%".equals(operador)) {
			
			double resto = num1 % num2;
			System.out.println(resto);
		}

		entrada.close();
	
	}
	
}
