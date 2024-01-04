module app.calculo {
	
	requires transitive app.logging; // Uso o transiteve para ter problemas ao passar uma dependencia de outro módulo para terceiros
	exports br.com.epsilon.app.calculo;
	
}