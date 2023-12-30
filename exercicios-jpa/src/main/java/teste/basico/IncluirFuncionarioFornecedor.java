package teste.basico;

import infra.DAO;
import modelo.composicao.Endereco;
import modelo.composicao.Fornecedor;
import modelo.composicao.Funcionario;

public class IncluirFuncionarioFornecedor {

	public static void main(String[] args) {
		
		Endereco enderco1 = new Endereco("Rua Izaque Newton 20", "Apartamento");
		Endereco enderco2 = new Endereco("Rua dos Ipés", "Casa");
		
		Funcionario func1 = new Funcionario("João da Silva", enderco1);

		Fornecedor forn1 = new Fornecedor("Grupo Não SEI", enderco2);

		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(forn1)
			.incluir(func1)
			.fecharT()
			.fechar();
			
	}
	
}