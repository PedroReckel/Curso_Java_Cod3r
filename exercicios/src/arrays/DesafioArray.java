package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas que o aluno tem: ");
		int qtdNotas = entrada.nextInt();
		
		double notas [] = new double [qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "° nota: ");
			notas[i]= entrada.nextDouble();
		}
		
		System.out.println("As notas do aluno são: " + Arrays.toString(notas));
		
		double totalNotas = 0;
		for(double nota: notas) {
			totalNotas += nota;
		}
		
		System.out.println("O total de notas do aluno foi: " + totalNotas);
		System.out.println("A média de notas do aluno foi: " + totalNotas / notas.length);
		
		entrada.close();
		
	}
	
}