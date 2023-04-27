package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioFeitoPeloProfessor {

	/*
	 * 1. A partir do produto calcular o preco real (com desconto)
	 * 2. Imposto municipal: >= 2500 (8,5%)/ < 2500 (Isento)
	 * 3. Frete: >= 3000 (100)/ < 3000 (50)
	 * 4. Arrendondar: Deixar duas casas decimais
	 * 5. Formatar: R$1234,56
	 * */
	
	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("Ipad", 3235.89, 0.13); // O Java não permite que você tenha uma variavel já definida
														// dentro do seu algoritimo que tem exatamente o mesmo nome do
														// parametro de uma lambda function
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O Preço final é " + preco);
		
	}
	
}