package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
		// System.out.println(mae.segredo);
		// System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar); // Atributos recebidos por herança são acessar dos sem precisar instaciar uma novo objeto
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
	}
	
}