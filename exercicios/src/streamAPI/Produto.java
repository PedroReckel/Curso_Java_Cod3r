package streamAPI;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	final double valorFrete;
	
	public Produto(String nome, double preco, double desconto, double valorFrete) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
	}
	
}