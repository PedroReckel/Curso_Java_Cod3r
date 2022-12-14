package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionamento
		
		// Tipos numéricos
		byte anosDeEmpresa = 2;
		short numeroDeVoos= 543;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Quando eu coloco o "L" no final do numero significa que o mesmo é um literal long, ou seja, quando eu vou definir um literal e eu passo da capacidade do inteiro eu obrigatoriamente preciso colocar um L

		// Tipos númericos reais
		float salario = 11_445.44F; // Quando eu coloco o "F" no final do numero significa que eu estou escrevendo um literal float e não double que é o padrão
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleando
		boolean estaDeFerias = true; // True
		
		// Tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " Dias de empresa");
		
		// Numero de viagens
		System.out.println(numeroDeVoos /  2 + " voos");
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + "pontos acumulados");
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
	
}
