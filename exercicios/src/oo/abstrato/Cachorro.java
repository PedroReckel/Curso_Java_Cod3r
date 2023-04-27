package oo.abstrato;

public class Cachorro extends Mamifero {

	// Nesse caso eu não sou obrigado a sobrescrever o metodo abstrato mover, pois ele já foi sobrescrito no classe mamifero
	@Override
	public String mover() {
		return "Usando as patas";
	}

	// Já nesse caso eu sou obrigado a sobrescrever, pois ele é um metodo abstrato não foi sobrescrito em nenhum lugar
	@Override
	public String mamar() {
		return "Com leite";
	}

}