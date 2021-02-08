package com.orange.desafio.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.orange.desafio.entities.Games;
import com.orange.desafio.entities.User;
import com.orange.desafio.repositories.GamesRepository;
import com.orange.desafio.repositories.UserRepository;

@Configuration
@Profile("dev")
public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private GamesRepository gamesRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User("joaquim", "00000000", "joaquim@gmail.com", "000000");
		Games g1 = new Games(null, null, u1);
		
		userRepository.save(u1);
		gamesRepository.save(g1);
	}

}
