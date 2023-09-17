package generics;

public class Caixa<T> {

	// Aqui posso definir um tipo generico e quando for instanciar a classe eu instancio com o tipo mais generico
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
}


// Generics in Java is a powerful feature that allows you to write classes, interfaces, and methods that operate on 
// typed parameters. It adds a layer of abstraction over data types, making your code more flexible, reusable, and 
// type-safe.