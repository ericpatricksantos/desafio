package com.orange.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orange.desafio.entities.Games;
import com.orange.desafio.repositories.GamesRepository;

@Service
public class GamesService {


	@Autowired
	private GamesRepository repository;

	public List<Games> findAll() {
		return repository.findAll();
	}

	public Games findById(Long id) {
		Optional<Games> obj = repository.findById(id);
		return obj.get();
	}

}
