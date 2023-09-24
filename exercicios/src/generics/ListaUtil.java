package generics;

import java.util.List;

// Tipos genericos em metodos

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) { // Essa lista pode ser de qualquer coisa
		return lista.get(lista.size() - 1); // Pegando o ultimo elemento de uma lista
	}
	
	public static <T> T getUltimo2(List<T> lista) { // Usando o generics
		return lista.get(lista.size() - 1);
	}
	
	// Eu posso ter mais de uma parametro generico por método
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
	
}