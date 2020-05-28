package com.api.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.model.Planeta;
import com.api.rest.repository.PlanetaRepository;

@Service
public class PlanetaService{
	
	@Autowired
	PlanetaRepository planetaRepository;
	
	public List<Planeta> findAll() {
		return planetaRepository.findAll();
	}
	
	public Optional<Planeta> findById(Integer id) {
		Optional<Planeta> obj = planetaRepository.findById(id);
		return obj;
	}
	
	public List<Planeta> findByName(String nome) {
		return planetaRepository.findByName(nome);
	}
	
	public List<Planeta> save(List<Planeta> planeta) {
		return planetaRepository.saveAll(planeta);
	}
	
	public void delete(Planeta planeta) {
		planetaRepository.delete(planeta);
	}
	

}
