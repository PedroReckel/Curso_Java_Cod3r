package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((" " + num1).length());
		System.out.println((" " + num2).length());
		
		float num3 = 1.2222F;
		System.out.println(Float.toString(num3));
		
		double num4 = 1.2342;
		
		System.out.println(Double.toString(num4));
		
		// double num4 = 1.2342;
		// System.out.println(num4.toString().length()); // Aqui vai dar erro porque eu não posso invocar o toString() em um tipo primitivo double
		
	}
	
}
