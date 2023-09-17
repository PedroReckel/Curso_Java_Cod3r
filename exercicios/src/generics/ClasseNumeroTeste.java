package generics;

public class ClasseNumeroTeste {

	public static void main(String[] args) {
		
		// Posso usar qualquer tipo que extends a Number
		// String por exemplo daria erro, pq não extends Number
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(3.1415);
		
		Double coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(123);
		
		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}
	
}