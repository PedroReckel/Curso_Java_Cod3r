package padroes.observer;

// Como ele tem apenas uma unico metodo que recebe o evento como parametro eu posso não precisar criar a classe namorada
@FunctionalInterface
public interface ObeservadorChegadaAniversariante {

	// Dentro de uma interface todo metodo é abstrato e quem for implementar essa interface vai ter que implementar 
	// esse metodo
	public void chegou(EventoChegadaAniversariante evento);
	
}