package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14; // Esse "final" é para dizer que a que a variável é do tipo estática.
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
