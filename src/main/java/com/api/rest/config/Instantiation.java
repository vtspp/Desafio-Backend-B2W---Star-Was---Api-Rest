package com.api.rest.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.api.rest.model.Filmes;
import com.api.rest.model.Planeta;
import com.api.rest.service.FilmeService;
import com.api.rest.service.PlanetaService;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	PlanetaService planetaService;
	
	@Autowired
	FilmeService filmeService;

	@Override
	public void run(String... args) throws Exception {
		
		Planeta p1 = new Planeta(null, "Tatooine", "arid", "desert");
		Planeta p2 = new Planeta(null, "Alderaan", "temperate", "grasslands, mountains");
		Planeta p3 = new Planeta(null, "Yavin IV", "temperate, tropical", "jungle, rainforests");
		Planeta p4 = new Planeta(null, "Hoth", "frozen", "tundra, ice caves, mountain ranges");
		Planeta p5 = new Planeta(null, "Dagobah", "murky", "swamp, jungles");
		Planeta p6 = new Planeta(null, "Bespin", "temperate", "gas giant");
		Planeta p7 = new Planeta(null, "Endor", "temperate", "forests, mountains, lakes");
		Planeta p8 = new Planeta(null, "Naboo", "temperate", "grassy hills, swamps, forests, mountains");
		Planeta p9 = new Planeta(null, "Coruscant", "temperate", "cityscape, mountains");
		Planeta p10 = new Planeta(null, "Kamino", "temperate", "ocean");
		
		Filmes f1 = new Filmes(null, "A New Hope", "George Lucas");
		Filmes f2 = new Filmes(null, "The Empire Strikes Back", "Irvin Kershner");
		Filmes f3 = new Filmes(null, "Attack of the Clones", "George Lucas");
		Filmes f4 = new Filmes(null, "Revenge of the Sith", "George Lucas");
		Filmes f5 = new Filmes(null, "The Phantom Menace", "George Lucas");
		Filmes f6 = new Filmes(null, "Return of the Jedi", "Richard Marquand");
		
		planetaService.save(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		filmeService.save(Arrays.asList(f1, f2, f3, f4, f5, f6));
		
		p1.getFilmes().add(f1);
		p1.getFilmes().add(f6);
		p1.getFilmes().add(f5);
		p1.getFilmes().add(f3);
		p1.getFilmes().add(f4);
		p2.getFilmes().add(f1);
		p2.getFilmes().add(f4);
		p3.getFilmes().add(f1);
		p4.getFilmes().add(f2);
		p5.getFilmes().add(f2);
		p5.getFilmes().add(f6);
		p5.getFilmes().add(f4);
		p6.getFilmes().add(f2);
		p7.getFilmes().add(f6);
		p8.getFilmes().add(f6);
		p8.getFilmes().add(f5);
		p8.getFilmes().add(f3);
		p8.getFilmes().add(f4);
		p9.getFilmes().add(f6);
		p9.getFilmes().add(f5);
		p9.getFilmes().add(f3);
		p9.getFilmes().add(f4);
		p10.getFilmes().add(f3);
		
		planetaService.save(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		
	}

}
