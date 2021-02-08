package com.orange.desafio.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.orange.desafio.entities.User;
import com.orange.desafio.repositories.UserRepository;

public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User("Eric", "12345678912", "eric@gmail.com", "96953625");
		
		userRepository.save(u1);
	}

}
