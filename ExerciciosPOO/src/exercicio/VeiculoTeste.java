package exercicio;

public class VeiculoTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Porsche", "Carrera GT", 2005);
		c1.acelerar();
		c1.frear();
		System.out.println("A marca do carro é " + c1.getMarca());
		
		CarroEletrico c2 = new CarroEletrico("Porsche", "Taycan", 2023);
		c2.acelerar();
		c2.frear();
		c2.carregarBateria();
		
		Moto m1 = new Moto("BMW", "S1000rr", 2023);
		m1.empinar();
		
	}
	
}