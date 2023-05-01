package streamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {
	// Definindo o contrutor dessa classe como privado para que não seja possivel instaciar uma classe do tipo Utilitarios
	// (Uma opção é usar uma interface!!!)
	}
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLentra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> grito() {
		return n -> n + "!!!";
	}
	
}