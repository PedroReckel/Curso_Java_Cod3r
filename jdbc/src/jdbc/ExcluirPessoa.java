package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		// TODO Melhorar implementação da classe excluir pessoa		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate(); // Either (1) the row count for SQL Data Manipulation Language (DML) 
										     // statementsor (2) 0 for SQL statements that return nothing
		if(contador > 0) { 
			System.out.println("Pessoa excluida com sucesso!");
			System.out.println("Linhas afetadas: " + contador);
		} else {
			System.out.println("Nada feito!");
		}
		
		conexao.close();
		entrada.close();
	}
	
}