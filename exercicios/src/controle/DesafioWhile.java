package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota;
		double totalNotas = 0;
		double media = 0;
		int contaNotas = 0;
		String sair = "";
		
		do {
			System.out.println("Digite uma nota");
			nota = entrada.nextDouble();
			
			boolean minMax = nota >= 0 && nota <=10;
			
			if(!minMax) {
				System.out.println("Nota inválida!\nUma nota válida deve estar entre 0 e 10");
			} else {
				contaNotas++;
				totalNotas = totalNotas + nota;
				media = totalNotas/contaNotas;
			}
			
			System.out.println("Quer sair? S/N");
			sair = entrada.next();

		} while(!sair.equalsIgnoreCase("s"));
		
		entrada.close();
		System.out.println("Acabou!!");
		System.out.println("O total de notas válidas foi: " + contaNotas);
		System.out.println("O total da soma de notas foi: " + totalNotas);
		System.out.println("A média de notas foi: " + media);
	}
	
}
