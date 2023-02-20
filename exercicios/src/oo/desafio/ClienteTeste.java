package oo.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Pedro");
		Cliente cliente2 = new Cliente("João");
		Cliente cliente3 = new Cliente("Maria");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Notebook", 4800.99), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Celular", 1500), 1);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.obterValorTotal());
		
	}
	
}