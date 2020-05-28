package com.api.rest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Filmes;
import com.api.rest.model.Planeta;
import com.api.rest.service.FilmeService;

@RestController
@RequestMapping(value = "/api")
public class FilmesResources {

	@Autowired
	private FilmeService filmeService;

	@RequestMapping(value = "/filmes/search", method = RequestMethod.GET)
	public ResponseEntity<List<Filmes>> listarFilmes() {
		return ResponseEntity.ok().body(filmeService.findAll());
	}

	@RequestMapping(value = "/filme/search/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Filmes>> listarFilmesId(@PathVariable(value = "id") Integer id) {
		return ResponseEntity.ok().body(filmeService.findById(id));
	}

	@RequestMapping(value = "/filme/search/titulo/{titulo}", method = RequestMethod.GET)
	public ResponseEntity<List<Filmes>> listarFilmesByTitulo(@PathVariable(value = "titulo") String titulo) {
		return ResponseEntity.ok().body(filmeService.findByName(titulo));
	}

	@RequestMapping(value = "/post/filme", method = RequestMethod.POST)
	public ResponseEntity<List<Filmes>> criarFilmes(@RequestBody List<Filmes> filme) {
		return ResponseEntity.ok().body(filmeService.save(filme));

	}

	@RequestMapping(value = "/delete/filme", method = RequestMethod.DELETE)
	public void deletarFilme(@RequestBody Filmes filme) {
		filmeService.delete(filme);
	}
	
}
