package oo.heranca.desafio01;

public interface Luxo {

	void ligarAr();
	abstract void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
	
}