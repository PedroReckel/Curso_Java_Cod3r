package oo.heranca;

public class Heroi extends Jogador {

	public Heroi(int x, int y) {
		super(x, y);
	}
	
	public boolean atacar(Jogador oponete) {
		boolean ataque1 = super.atacar(oponete);
		boolean ataque2 = super.atacar(oponete);
		boolean ataque3 = super.atacar(oponete);
		return ataque1 || ataque2 || ataque3;
	}
}