package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data day1 = new Data();
		
		System.out.println(day1.diaDeHoje());
		
		var birthday = new Data();
		birthday.dia = 15;
		birthday.mes = 10;
		birthday.ano = 2001;
		
		System.out.printf(birthday.diaAniversario());
		
	}
	
}
