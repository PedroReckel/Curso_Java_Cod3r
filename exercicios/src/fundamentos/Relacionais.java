package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // Aqui foi true pq A em decimal é 97
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouNaMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouNaMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
	}
	
}