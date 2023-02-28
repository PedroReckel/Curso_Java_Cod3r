package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 11;
		
		Monstro j3 = new Monstro();
		j3.x = 11;
		j3.y = 10;
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);		
		System.out.println(j3.vida);		
		
		j1.atacar(j2);
		j2.atacar(j1);
		j2.atacar(j3);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		System.out.println(j3.vida);
		
	}
	
}