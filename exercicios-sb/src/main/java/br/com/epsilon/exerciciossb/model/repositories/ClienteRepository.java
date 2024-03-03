package br.com.epsilon.exerciciossb.model.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.ResponseEntity;

import br.com.epsilon.exerciciossb.model.entities.Assento;
import br.com.epsilon.exerciciossb.model.entities.Cliente;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

	public Iterable<Cliente> findByNomeContainingIgnoreCase(String parteNome);
	
	// Aqui tenho que usar "Cliente" (nome da minha classe) e não "clientes" (nome da minha tabela)
	@Query("SELECT c FROM Cliente c WHERE c.deleted = false") 
	Page<Cliente> findAllClienteNotDeleted(Pageable  pageble);

	@Query("SELECT a FROM Assento a WHERE a.deleted = false") 
	Page<Cliente> findAllAssentoNotDeleted(Pageable  pageble);

	Optional<Cliente> findClienteByIdAndDeletedFalse(Long id);
	
	ResponseEntity<Cliente> findClienteById(Long id);

	public void save(Assento assento);
	
}