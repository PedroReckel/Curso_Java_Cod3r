package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean comprouNada = tv50 || tv32;
		boolean sorvete = comprouNada;
		
		System.out.println("Comprou 50? " + tv50);
		System.out.println("Comprou 32? " + tv32);
		System.out.println("Comprou alguma TV? " + comprouNada);
		System.out.println("Tomou sorvete? " + sorvete);
		System.out.println("Mais saudável? " + !sorvete);
		
		/*if (tv50) {
			System.out.println("A TV comprada foi a de 50 polegadas");
			System.out.println("Vamos tomar sorvete");
		} else if (tv32) {
			System.out.println("A TV comprada foi a de 32 polegadas");
			System.out.println("Vamos tomar sorvete");
		} else {
			System.out.println("Nenhuma TV foi comprada e não tomamos sorvete");
		}*/
	}

}
