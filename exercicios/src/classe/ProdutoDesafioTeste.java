package classe;

public class ProdutoDesafioTeste {

	public static void main(String[] args) {
		
		DesafioProduto p1 = new DesafioProduto("Notebook", 4899.99);
		
		var p2 = new DesafioProduto();
		p2.nome = "Galaxy S22 Ultra";
		p2.preco = 7550.99;
		
//		DesafioProduto.desconto = 0.30; 
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2  .precoComDesconto());
		
	}
	
}