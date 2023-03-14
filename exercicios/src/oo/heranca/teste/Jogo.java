package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro mostro = new Monstro();
		mostro.x = 10;
		mostro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("Mostro tem " + mostro.vida + " de vida");		
		System.out.println("Heroi tem " + heroi.vida + " de vida");		
		
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
//		heroi.andar(Direcao.NORTE);
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		heroi.atacar(mostro);
		
		System.out.println("Mostro tem " + mostro.vida + " de vida");		
		System.out.println("Heroi tem " + heroi.vida + " de vida");		
		
	}
	
}