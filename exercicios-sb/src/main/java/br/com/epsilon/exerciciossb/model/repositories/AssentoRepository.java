package br.com.epsilon.exerciciossb.model.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.epsilon.exerciciossb.model.entities.Assento;

public interface AssentoRepository extends PagingAndSortingRepository<Assento, Long> {

    @Query("SELECT a FROM Assento a WHERE a.deleted = false")
    Page<Assento> findAllAssentoNotDeleted(Pageable pageable);

    Optional<Assento> findAssentoByIdAndDeletedFalse(Long id);
    	
}