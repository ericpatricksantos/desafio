package com.orange.desafio.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.desafio.entities.Games;

public interface GamesRepository extends JpaRepository<Games, Long>{

}
