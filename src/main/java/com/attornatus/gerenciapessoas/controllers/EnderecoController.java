package com.attornatus.gerenciapessoas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.gerenciapessoas.dto.EnderecoDto;
import com.attornatus.gerenciapessoas.entities.Endereco;
import com.attornatus.gerenciapessoas.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService service;
	
	
	@GetMapping
	public List<Endereco> findAll(){
		return service.findAll();
	}
	
	@GetMapping (value = "/user/{userId}")
	public List<Endereco> findById(@PathVariable(value = "userId") Long userId){
		return service.findByUserId(userId);
	}

}
