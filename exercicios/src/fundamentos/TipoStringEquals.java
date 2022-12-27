package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // O equals() é a melhor forma de fazer comparações entre strings
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); // O nextLine() não tira os espaços, já o next() sim
 		System.out.println(s2);
		System.out.println("2" == s2.trim()); // O trim() ele tira os espaços da string
		System.out.println("2".equals(s2.trim()));
 		
		entrada.close();
	}
	
}
