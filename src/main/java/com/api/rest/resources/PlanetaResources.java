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

import com.api.rest.model.Planeta;
import com.api.rest.service.FilmeService;
import com.api.rest.service.PlanetaService;

@RestController
@RequestMapping(value = "/api")
public class PlanetaResources {

	@Autowired
	private PlanetaService planetaService;
	
	@RequestMapping(value = "/planetas/search", method = RequestMethod.GET)
	public ResponseEntity<List<Planeta>> listarPlanetas() {
		return ResponseEntity.ok().body(planetaService.findAll());
	}

	@RequestMapping(value = "/planeta/search/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Planeta>> listarPlanetasById(@PathVariable(value = "id") Integer id) {
		return ResponseEntity.ok().body(planetaService.findById(id));
	}

	@RequestMapping(value = "/planeta/search/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<List<Planeta>> listarPlanetasByName(@PathVariable(value = "nome") String nome) {
		return ResponseEntity.ok().body(planetaService.findByName(nome));
	}

	@RequestMapping(value = "/post/planeta", method = RequestMethod.POST)
	public ResponseEntity<List<Planeta>> criarPlanetas(@RequestBody List<Planeta> planeta) {
		return ResponseEntity.ok().body(planetaService.save(planeta));

	}

	@RequestMapping(value = "/delete/planeta", method = RequestMethod.DELETE)
	public void deletarPlaneta(@RequestBody Planeta planeta) {
		planetaService.delete(planeta);
	}

}
