package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class IncluirProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Iphone 15", 9984.65);
		
		DAO<Produto> dao = new DAO<>(Produto.class); // DAO generico
		dao.incluirAtomico(p1).fechar();
		
		System.out.println("Id do produto " + p1.getId());
		
	}
	
}