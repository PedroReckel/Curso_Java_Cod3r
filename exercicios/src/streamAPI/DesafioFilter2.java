package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Galaxy S23", 8000, 60, 0);
		Produto p2 = new Produto("Notebook Gamer", 5000, 50, 0);
		Produto p3 = new Produto("Xiaomi Mi12T", 2000, 30, 10);
		Produto p4 = new Produto("Iphone 14 pro", 9000, 40, 10);
		Produto p5 = new Produto("GoPro Hero 10", 4000, 30, 0);
		Produto p6 = new Produto("Teclado Mecanico", 600, 30, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> superPromocao = p -> p.desconto > 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 300;
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;		
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
	}
	
}

// Mostrar todos os produtos que estão com desconto maior que 30% (Super promossão) -> Filtro 1
// E os produtos que tem frete gratis -> Filtro 2