package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data day1 = new Data();
		day1.dia = 15;
		day1.mes = 1;
		day1.ano = 2023;
		
		System.out.println("A data exata de hoje é " + day1.dia + "/" + day1.mes + "/" + day1.ano);
		
		var birthday = new Data();
		birthday.dia = 15;
		birthday.mes = 10;
		birthday.ano = 2001;
		
		System.out.printf("\nO ano de nascimento do Pedro é %d/%d/%d", birthday.dia, 
				birthday.mes, birthday.ano);
		
	}
	
}
