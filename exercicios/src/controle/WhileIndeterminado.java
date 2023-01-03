package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String text = "";
		
		while (!text.equalsIgnoreCase("Sair")) {
			System.out.println("Digite alguma coisa: ");
			text = entrada.nextLine();
		}
		
		entrada.close();
		
	}
	
}
