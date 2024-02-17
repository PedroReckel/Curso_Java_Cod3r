package br.com.epsilon.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.epsilon.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
}