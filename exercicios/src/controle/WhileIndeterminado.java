package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String text = "";
		double nota;
		double contaNota = 0;
		
		while (!text.equalsIgnoreCase("Sair")) {
			System.out.println("Digite alguma coisa: ");
			text = entrada.nextLine();
			
			System.out.println("Digite uma nota");
			nota = entrada.nextDouble();
			contaNota = nota++;
		}
		
		System.out.println(contaNota);
		entrada.close();
	}
	
}
