package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao() {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String diretorioHome = System.getProperty("user.home");
		String caminhoArquivo = diretorioHome + File.separator + "conexao.properties";
		File arquivo = new File(caminhoArquivo);
		
	    try (FileInputStream input = new FileInputStream(arquivo)) {
	        prop.load(input);
	    }

	    return prop;
	}
	
}