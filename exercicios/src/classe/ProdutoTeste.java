package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4899.99, 0.25);
		
		var p2 = new Produto();
		p2.nome = "Galaxy S22 Ultra";
		p2.preco = 7550.99;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		System.out.println();
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2.desconto);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2)  / 2;
		
		System.out.println("\nO preço final para o produto " + p1.nome + " é " + precoFinal1);
		System.out.println("O preço final para o produto " + p2.nome + " é " + precoFinal2);
		System.out.printf("A média do carrinho de compras é: R$%.2f.", mediaCarrinho);	
		
	}
	
}
