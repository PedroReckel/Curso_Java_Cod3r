package teste.basico;

import infra.DAO;
import modelo.heranca.Pet;

public class IncluirAnimalPet {

	public static void main(String[] args) {
		
		Pet pet1 = new Pet("Mingau", "Cat");
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(pet1)
			.fecharT()
			.fechar();
		
	}
	
}