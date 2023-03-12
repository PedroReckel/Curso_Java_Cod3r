package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970); // Chamando um construtor
		
//		int a; // Toda variável criada dentro de um método não vai receber o valor padrão que para um tipo primitido é o 0
//		a = 0; // Posso atribuir o valor 0 a ela se eu quiser que ela receba o valor padrão
//		System.out.println(a);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;  // Usando o this para instaciar o objeto atual 
		this.mes = mes;
		this.ano = ano;
	}
	

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada()); // Usando this para acessar um método que pertence a uma instância'	}
	}
}