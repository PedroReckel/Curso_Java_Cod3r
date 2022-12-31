package desafios_fundamentos;

public class Bhaskara {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 12;
		double c = -13;
		
		double delta = Math.pow(b, b) - 4 * a * c;
		
		System.out.println("O valor do Delta é: " + delta);
		
		if (delta < 0) {
			System.out.println("Não existem raízes reais");
		} else {
			double x1 = -b + Math.sqrt(delta) / 2 * a;
			double x2 = -b - Math.sqrt(delta) / 2 * a;
			System.out.println("O valor de x1 é: " + x1 + " e o valor de x2 é: " + x2);
		}
		
	}
	
}
