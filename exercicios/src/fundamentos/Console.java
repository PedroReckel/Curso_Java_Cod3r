package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.2f%n", 12934.5463); // Duas casas decimais
		System.out.printf("Nome: %s%n", "Pedro");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); // Coloquei essa nextLine para "pegar" o "\n" que o nextInt() não lê.
		
		System.out.printf("%s %s tem %d anos de idade", nome, sobrenome, idade);
		
		entrada.close(); // Sempre que eu abro um scanner eu tenho que fechar ele para não consumir recurso da minha maquina
		
	}
	
}
