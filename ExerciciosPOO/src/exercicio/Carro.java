package exercicio;

public class Carro {

	String marca;
	String modelo;
	int ano;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void acelerar() {
		System.out.println("O carro " + modelo + " está acelerando!");
	}

	public void frear() {
		System.out.println("O carro " + modelo + " está freando!");
	}
	
}