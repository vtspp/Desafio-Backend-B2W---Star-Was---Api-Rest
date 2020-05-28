package com.api.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.rest.model.Filmes;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Integer>{
	
	@Query(value = "select * from Planeta where nome ilike :titulo", nativeQuery = true)
	List<Filmes> findByTitulo(String titulo);
	
	List<Filmes> save(List<Filmes> filme);

}
