package desafios_controle;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.printf("O numero %d é par\n", i);
			} else {
				System.out.printf("O numero %d é impar\n", i);
			}
		}
		
	}
	
}
