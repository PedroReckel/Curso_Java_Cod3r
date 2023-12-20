package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 6L);	
		em.detach(usuario); // Tirar o objeto do modo gerenciavel -> Garente que ele só irá ser alterado e persistido se qual for colocado
		
		usuario.setNome("Ducth Van Der Linde");
		usuario.setEmail("ducth.linde@gmail.com");
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.clear();
		emf.close();
	}
	
}