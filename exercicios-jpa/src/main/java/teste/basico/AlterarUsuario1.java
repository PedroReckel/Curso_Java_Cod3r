package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario1 = em.find(Usuario.class, 1L);
		usuario1.setEmail("elon.musk@gmail.com");
		em.merge(usuario1);
		
		Usuario usuario2 = em.find(Usuario.class, 2L);
		usuario2.setEmail("renato.cariani@gmail.com");
		em.merge(usuario2);
		em.getTransaction().commit();
		
		em.clear();
		emf.close();
		
	}

}