package desafios_controle;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digire a nota da AV1:");
		double notaAv1 = entrada.nextDouble();
		
		System.out.println("Digire a nota da AV2:");
		double notaAv2 = entrada.nextDouble();
		
		double media = (notaAv1 + notaAv2) / 2 ;
		
		if(media >= 7) {
			System.out.println("A média final do aluno é: " + media + " e ele(a) está "
					+ "aprovado(a).");
		} else if (media < 7 && media >= 4) {
			System.out.println("A média final do aluno é: " + media + " e ele(a) está "
					+ "de recuperação.");
		} else {
			System.out.println("A média final do aluno é: " + media + " e ele(a) está "
					+ "reprovado.");
		}
		
		entrada.close();
	}
	
}
