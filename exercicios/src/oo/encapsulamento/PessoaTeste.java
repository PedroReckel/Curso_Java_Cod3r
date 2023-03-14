package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Reckel", -21);
		p1.setIdade(230); // Alterar o valor da variavel
		
		System.out.println(p1.getIdade()); // Ler o valor da variavel
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		
	}
	
}