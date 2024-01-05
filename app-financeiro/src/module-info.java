module app.financeiro {
	
	requires java.base; // Por padrão já é importado
//	requires app.calculo;
	requires app.api;
	uses br.com.epsilon.app.Calculadora;
	
}