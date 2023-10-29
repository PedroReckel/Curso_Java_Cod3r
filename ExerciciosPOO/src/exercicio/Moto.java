package exercicio;

public class Moto {

	String marca;
	String modelo;
	int ano;
	
	public Moto(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void empinar() {
		System.out.println("A moto " + modelo + " está empinando");
	}
	
}