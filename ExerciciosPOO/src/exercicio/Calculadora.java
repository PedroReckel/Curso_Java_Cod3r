package exercicio;

public class Calculadora {

	int a;
	int b;
	double resultado;
	
	public Calculadora(int i, int j) {
		this.a = i;
		this.b = j;
		
	}

	public double dividir() {
		try {
			resultado = a / b;
		} catch (Exception e) {
			System.out.println("Divisão por zero!!!");
		}
		return resultado;
	}
	
}