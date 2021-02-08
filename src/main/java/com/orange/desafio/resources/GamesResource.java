package com.orange.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.desafio.entities.Games;
import com.orange.desafio.services.GamesService;

@RestController
@RequestMapping(value = "/gamers")
public class GamesResource {

	@Autowired
	private GamesService service;

	@GetMapping
	// EndPoint para buscar todas os Gamess
	public ResponseEntity<List<Games>> findAll() {
		List<Games> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}

	// EndPoint para buscar por id
	@GetMapping(value = "/{cpf}")
	public ResponseEntity<Games> findById(@PathVariable Long id) {
		Games obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
