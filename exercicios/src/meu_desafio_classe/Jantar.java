package meu_desafio_classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida comida1 = new Comida();
		comida1.nomeComida = "Pizza";
		comida1.pesoComida = 0.4;
		
		var comida2 = new Comida();
		comida2.nomeComida = "Picanha";
		comida2.pesoComida = 0.5;
		
		Pessoa p1 = new Pessoa();
		p1.nomePessoa = "Pedro";
		p1.pesoPessoa = 65;
		
		p1.comer(comida2);
		
	}
	
}