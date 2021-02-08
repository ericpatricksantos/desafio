package com.orange.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.desafio.entities.User;
import com.orange.desafio.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	//EndPoint para buscar todas os Users
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	//EndPoint para buscar por id
	@GetMapping(value = "/{cpf}") 
	public ResponseEntity<User>  findById(@PathVariable String cpf) {
		User obj =  service.findById(cpf);
		return ResponseEntity.ok().body(obj);
	}

}
