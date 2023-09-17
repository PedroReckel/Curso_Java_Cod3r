package generics;

public class CaixaObjetoTeste {

	// O Generics vai ajudar nesse caso pq dá para dizer expecificamente o tipo que eu quero trabalhar
	// Usando o Generics caso tenha algum erro vai ser em tempo de compilação (Evitando erros no cliente) e não em runtime
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.5); // double -> Double
		
		Double coisaA = (Double) caixaA.abrir(); // Convertendo de Object para algo mais expecifico
		System.out.println(coisaA);			     // Corre o risco de ter uma converção errada e ter um exceção 	
												 //	do tipo class.cast.exception 	
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá mundo");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}
	
}