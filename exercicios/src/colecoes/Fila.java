package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana"); // Lançará uma exceção caso a fila esteja cheia
		fila.offer("Bia"); // Retorna falso caso a fila esteja cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Remove -> Obter o próximo elemento da fila (sem remover)
		
		// A diferença é o comportamento ocorre quando a fila estiver vazia !
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.peek()); // Lança uma exceção
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Poll e remove -> Obter o próximo elemento da fila e remove!
		
//		// A diferença é o comportamento quando a fila estiver vazia!
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//System.out.println(fila.size());
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
		
	}
	
}
