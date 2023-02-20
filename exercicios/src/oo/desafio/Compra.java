package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto prod, int qtd) {
		this.itens.add(new Item(prod, qtd));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item itemAtual: itens) {
			total += itemAtual.quatidade * itemAtual.produto.preco;
		}
		
		return total;
	}
		
}