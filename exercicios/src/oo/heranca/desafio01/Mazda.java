package oo.heranca.desafio01;

public class Mazda extends Carro {
	
	public Mazda() {
		super(180);
		delta = 15;
	}
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	@Override
	public void frear() {
		if (velocidadeAtual >= 10) {
			velocidadeAtual -= 10;
		} else {
			velocidadeAtual = 0;
		}
	}
	
}
