package oo.heranca.desafio01;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(300);
		delta = 50;
	}
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 50;
//	}
//	
	@Override
	void frear() {
		if (velocidadeAtual >= 35) {
			velocidadeAtual -= 35;
		} else {
			velocidadeAtual = 0;
		}
	}
}