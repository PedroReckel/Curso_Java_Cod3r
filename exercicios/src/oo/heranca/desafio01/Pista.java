package oo.heranca.desafio01;

public class Pista {

	public static void main(String[] args) {
		
		Carro mazda = new Mazda();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		mazda.acelerar();
		
		System.out.println("A velocidade do Mazda Mx-5 Miata é de " + mazda.velocidadeAtual + " KM/H");
		
		mazda.frear();
		mazda.frear();
		mazda.frear();
		mazda.frear();
		mazda.frear();
		mazda.frear();
		
		System.out.println("A velocidade do Mazda Mx-5 Miata é de " + mazda.velocidadeAtual + " KM/H");
		
		Carro ferrari = new Ferrari();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println("A velocidade da Ferrar F40 é de " + ferrari.velocidadeAtual + " KM/H");
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println("A velocidade da Ferrar F40 é de " + ferrari.velocidadeAtual + " KM/H");
		
	}
	
}