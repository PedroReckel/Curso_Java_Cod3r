package br.com.epsilon.exerciciossb.model.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.epsilon.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    Optional<Produto> findByIdAndDeletedFalse(int id);
   
    // Aqui tenho que usar "Produto" (nome da minha classe) e não "produtos" (nome da minha tabela)
    @Query("SELECT p FROM Produto p WHERE p.deleted = false")
    Page<Produto> findAllNotDeleted(Pageable  pageble);
    
}