package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Lancer evo", 200000, false);
		Carro c2 = new Carro("Toyota Supra", 1000000, false);
		Carro c3 = new Carro("Civic SI", 70000, false);
		Carro c4 = new Carro("Corsa Wind", 7000, true);
		Carro c5 = new Carro("Fiat Uno", 7500, true);
		Carro c6 = new Carro("Chevette", 15000, true);
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6);
		
		Predicate<Carro> barato = c -> c.preco <= 80000;
		Predicate<Carro> economico = c -> c.economico;
		Function<Carro, String> bomPreco = a -> "O " + a.modelo + " tem um bom preço de " + " R$" + a.preco;
		Function<String, String> primeiroCarro = a -> a + " e ele é um bom primeiro carro!!";
		
		carros.stream()
			.filter(barato)
			.filter(economico)
			.map(bomPreco)
			.map(primeiroCarro)
			.forEach(System.out::println);
		
	}
	
}

// Criar duas funções lambdas;
// Fazer dois filtros diferentes;
// Usar um map no final;