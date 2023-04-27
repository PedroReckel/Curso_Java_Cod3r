package oo.heranca.teste;

import oo.heranca.desafio01.Ferrari;
import oo.heranca.desafio01.Mazda;

public class Pista {

	public static void main(String[] args) {
		
		Mazda mazda = new Mazda();
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
		
		Ferrari ferrari = new Ferrari();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		System.out.println(ferrari.velocidadeDoAr());
		
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