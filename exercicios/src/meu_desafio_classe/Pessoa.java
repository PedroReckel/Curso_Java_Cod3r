package meu_desafio_classe;

public class Pessoa {

	String nomePessoa = "";
	double pesoPessoa;
	
	void comer(Comida comida) {
		double pesoTotal = comida.pesoComida + pesoPessoa;
		System.out.println("O peso do " + nomePessoa + " mais o da comida que ele "
				+ "comeu é " + pesoTotal);
	}

}
