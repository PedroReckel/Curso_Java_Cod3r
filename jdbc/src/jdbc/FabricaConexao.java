package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() {
		try {
			final String url = "jdbc:postgresql://localhost:5432/curso_java";
			final String usuario = "postgres";
			final String senha = "";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}