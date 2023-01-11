package desafios_controle;

import java.util.Scanner;

public class ImprimirLetras {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite alguma palavra: ");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray(); // Transformar uma string em um array de caracteres
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();
		
	}
	
}
