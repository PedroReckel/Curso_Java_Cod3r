package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		double tempFahr = 100;
		final double num0 = 32;
		final double num1 = 5;
		final double num2 = 9;
		double tempCel = 0;
		
		tempCel = ((tempFahr - num0) * 5/9);
		System.out.println("A temperatura em celsius é: " + tempCel);
		
	}
	
}
