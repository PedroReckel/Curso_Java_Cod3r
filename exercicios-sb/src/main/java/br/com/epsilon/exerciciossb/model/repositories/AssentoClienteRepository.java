package br.com.epsilon.exerciciossb.model.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.epsilon.exerciciossb.model.entities.Cliente;

public interface AssentoClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {

	public Iterable<Cliente> findByNomeContainingIgnoreCase(String parteNome);
	
	// Aqui tenho que usar "Cliente" (nome da minha classe) e não "clientes" (nome da minha tabela)
	@Query("SELECT c FROM Cliente c WHERE c.deleted = false") 
	Page<Cliente> findAllClienteNotDeleted(Pageable  pageble);

	@Query("SELECT a FROM Assento a WHERE a.deleted = false") 
	Page<Cliente> findAllAssentoNotDeleted(Pageable  pageble);
	
}