package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) throws SQLException {
		
		String nomeObtido = null;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome atual da pessoa que você quer mudar o nome:");
		String valorAtual = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql1 = "SELECT nome FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt1 = conexao.prepareStatement(sql1);
		stmt1.setString(1, "%" + valorAtual + "%");
		ResultSet resultado1 = stmt1.executeQuery();
		
		while(resultado1.next()) {
			 nomeObtido = resultado1.getString("nome");
		}
		
		System.out.println("Digite o novo nome da pessoa:");
		String novoValor = entrada.nextLine();
		
		String sql2 = "UPDATE pessoas SET nome = ? WHERE nome LIKE ?";
		PreparedStatement stmt2 = conexao.prepareStatement(sql2);
		stmt2.setString(1,novoValor);
		stmt2.setString(2, "%" + nomeObtido + "%" );
		stmt2.execute();
		
		System.out.println("Nome alterado com sucesso!");
		stmt1.close();
		stmt2.close();
		conexao.close();
		entrada.close();
	}
	
}