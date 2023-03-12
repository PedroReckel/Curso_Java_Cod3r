package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// Usando o SortedSet para ordenar o meu SET
		SortedSet<String> listaAprovados = new TreeSet<String>(); // Expecificamente essa lista só pode receber valores do tipo string
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
//		nums.get(1) Não é possível acessar pelo indice no SET
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
	
}