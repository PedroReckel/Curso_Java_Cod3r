package exercicio;

public class CarroEletrico extends Carro {

	int autonomiaBateria = 350;
	
	public CarroEletrico(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	public void carregarBateria() {
		System.out.println("A autonomia da bateria é de: " + autonomiaBateria + "Km");
	}
	
}