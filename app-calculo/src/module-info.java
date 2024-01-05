import br.com.epsilon.app.Calculadora;
import br.com.epsilon.app.calculo.CalculadoraImpl;

module app.calculo {
	
	requires transitive app.logging; // Uso o transiteve para não ter problemas ao passar uma dependencia de outro módulo para terceiros
	exports br.com.epsilon.app.calculo;
	
	exports br.com.epsilon.app.calculo.interno
		to app.financeiro, app.logging;
	
	opens br.com.epsilon.app.calculo to app.logging, app.financeiro;
	
	requires app.api;
	provides Calculadora with CalculadoraImpl;
	
}