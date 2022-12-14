package fundamentos;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		/*
		 * double media = 7.6; String resultadoFinal = media >= 7.0 ? "Aprovado" :
		 * "Recuperação"; System.out.println(resultadoFinal);
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = entrada.nextLine();

		System.out.println("Digite a nota do aluno: ");
		double nota = entrada.nextDouble();
		
		System.out.println("O aluno " + nome + " tem bom comportamento? ");
		boolean bomComportamento = entrada.nextBoolean();
		
		boolean passouNaMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouNaMedia;
		String resultado = temDesconto ? "teve desconto" : "não teve desconto";

		System.out.println("O Aluno " + nome + " teve nota " + nota + " e " + resultado);

		entrada.close();
	}
}
