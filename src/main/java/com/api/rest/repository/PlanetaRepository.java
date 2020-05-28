package com.api.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.rest.model.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Integer> {

	@Query(value = "select * from Planeta where nome ilike :nome", nativeQuery = true)
	List<Planeta> findByName(String nome);
	
	List<Planeta> save(List<Planeta> planeta);

}
