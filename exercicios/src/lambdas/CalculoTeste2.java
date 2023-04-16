package lambdas;
import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
//		 O tipo do BinaryOperator deve ser sempre um tipo classe
//		 Eu não posso fazer:
//		 int -> Double
//		 Double a = 1;
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));

//		System.out.println(calc.legal());
//		System.out.println(Calculo.muitoLegal());
		
	}
	
}