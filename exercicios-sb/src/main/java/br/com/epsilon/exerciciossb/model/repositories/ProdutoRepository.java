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
   
    @Query("SELECT p FROM Produto p WHERE p.deleted = false")
    Page<Produto> findAllNotDeleted(Pageable  pageble);
    
}