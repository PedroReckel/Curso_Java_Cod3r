package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		
		System.out.println(dao.incluir(sql, "Joao da Silva", 18));
		System.err.println(dao.incluir(sql, "Maria da Silva", 19));
		System.out.println(dao.incluir(sql, "Djalma Pereira", 20));
		
		 dao.close();
		
	}
	
}