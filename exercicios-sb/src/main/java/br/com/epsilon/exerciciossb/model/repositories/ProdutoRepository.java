package br.com.epsilon.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.epsilon.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	
	
}