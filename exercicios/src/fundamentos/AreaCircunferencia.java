package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double pi = 3.14159; // Eu coloco o "final" no começo da variavel pra definir que ela é uma constante
		double area = pi * raio * raio;
		
		raio = 10;
		area = pi * raio * raio;
		
		System.out.println("Área da circunferência: " + area + " M²");
		
	}
	
}
