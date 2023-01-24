package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		
//		System.out.println(a1.area());
			
		System.out.println(AreaCirc.PI); // Para acessar um membro de uma classe eu preciso colocar o nome da classe antes do nome do membro
		System.out.println(a1.raio); // Para acessar um membro de um objeto eu preciso colocar o nome do objeto antes do nome do membro
		System.out.println(AreaCirc.area(a1.raio));
	}
	
}
