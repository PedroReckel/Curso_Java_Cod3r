package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		double expr1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double expr2 = Math.pow((1 - 5) * (2 - 7) / (2), 2);
		double expr3 = (expr1 - expr2);
		double expr4 = Math.pow(expr3, 3);
		double expr5 = Math.pow(10, 3);
		
		System.out.println(expr4 / expr5);
		
	}
	
}
