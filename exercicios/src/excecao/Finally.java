package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally { // Caso dê um erro o finally fecha os recursos que estão rodando de fundo.
			System.out.println("Finally...");
			entrada.close();
		}
		
		System.out.println("Fim!");
	}
	
}