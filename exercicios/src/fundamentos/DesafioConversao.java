package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner salarios = new Scanner(System.in);

		System.out.println("Digite seu primeiro salário: ");
		String salario1 = salarios.nextLine().replace(",", ".");
		double dsalario1 = Double.parseDouble(salario1);
		
		System.out.println("Digite seu segundo salário: ");
		String salario2 = salarios.nextLine().replace(",", ".");
		double dsalario2 = Double.parseDouble(salario2);
		
		System.out.println("Digite seu terceiro salário: ");
		String salario3 = salarios.nextLine().replace(",", "."); 
		double dsalario3 = Double.parseDouble(salario3);
		
		double media = (dsalario1 + dsalario2 + dsalario3) / 3;
		System.out.println("A média salarial desse funcionário é: " + media);

		salarios.close();

	}

}
