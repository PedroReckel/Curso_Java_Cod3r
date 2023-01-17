package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 1;
		mes = 10;
		ano = 1970;
	}
	
	Data(int diaAtual, int mesAtual, int anoAtual) {
		dia = diaAtual;
		mes = mesAtual;
		ano = anoAtual;
	}
	
	String diaDeHoje() {
		return "O dia de hoje é " + dia + "/" + mes + "/" + ano;
	}
	
	String diaAniversario() {
		return String.format("O dia em que eu nasci foi %d/%d/%d", dia, mes, ano);
	}
	
	
}
