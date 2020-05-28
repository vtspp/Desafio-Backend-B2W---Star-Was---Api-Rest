package com.api.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.model.Filmes;
import com.api.rest.repository.FilmesRepository;

@Service
public class FilmeService {
	
	@Autowired
	private FilmesRepository filmeRepository;
	
	public List<Filmes> findAll() {
		return filmeRepository.findAll();
	}
	
	public Optional<Filmes> findById(Integer id) {
		Optional<Filmes> obj = filmeRepository.findById(id);
		return obj;
	}
	
	public List<Filmes> findByName(String titulo) {
		return filmeRepository.findByTitulo(titulo);
	}
	
	public List<Filmes> save(List<Filmes> titulo) {
		return filmeRepository.saveAll(titulo);
	}
	
	public void delete(Filmes titulo) {
		filmeRepository.delete(titulo);
	}

}
