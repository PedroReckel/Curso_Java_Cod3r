package br.com.epsilon.erp.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;

import br.com.epsilon.erp.model.Empresa;

public class SchemaGeneration {

	public static void main(String[] args) throws HibernateException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso_JSF_PrimeFaces");
		
		EntityManager em = emf.createEntityManager();
		
		List<Empresa> lista = em.createQuery("from Empresa", Empresa.class)
				.getResultList();
		
		System.out.println(lista);
		
		em.close();
		emf.close();
	}
	
}