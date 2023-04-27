package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class DesafioFeitoPorMim {

	/*
	 * 1. A partir do produto calcular o preco real (com desconto)
	 * 2. Imposto municipal: >= 2500 (8,5%)/ < 2500 (Isento)
	 * 3. Frete: >= 3000 (100)/ < 3000 (50)
	 * 4. Arrendondar: Deixar duas casas decimais
	 * 5. Formatar: R$1234,56
	 * */
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		BinaryOperator<Double> precoComDesconto = (x, y) -> x * (1 - y);
		
		Function<Double, Double> precoComImposto = x -> (x >= 2500) ? x += (x * 8.5) / 100 : x;		
		
		Function<Double, Double> precoComFrete = x -> (x >= 3000) ? (x += 100) : (x += 50);
		
		double valorFinal = precoComDesconto.andThen(precoComImposto).andThen(precoComFrete).apply(p.preco, p.desconto);
		BigDecimal arredondado = new BigDecimal(valorFinal).setScale(2, RoundingMode.HALF_EVEN);
		
		System.out.println("O preço do " + p.nome + " com o desconto, imposto e frete é: R$" + arredondado);
		
	}
	
}