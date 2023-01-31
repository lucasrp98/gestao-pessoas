package com.attornatus.gerenciapessoas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.gerenciapessoas.dto.UserDto;
import com.attornatus.gerenciapessoas.entities.User;
import com.attornatus.gerenciapessoas.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService service;
		
	@GetMapping
	public List<User> findAll(){
		return service.findAll();
	}
	
	@GetMapping (value = "/{id}")
	public User findById(@PathVariable Long id){
		return service.findById(id);
	}	

	@PutMapping(value = "/{id}")
	public User update(@RequestBody UserDto dto, @PathVariable Long id){
		User user = service.findById(id);
		return service.update(user, dto);
	}
		
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public User insert(@RequestBody UserDto dto){
		return service.save(dto);
	}

}
