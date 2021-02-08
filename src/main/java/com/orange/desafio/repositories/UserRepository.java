package com.orange.desafio.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.desafio.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
