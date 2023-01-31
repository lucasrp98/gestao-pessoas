package com.attornatus.gerenciapessoas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attornatus.gerenciapessoas.entities.Endereco;
import com.attornatus.gerenciapessoas.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
	private EnderecoRepository repository;

    public List<Endereco> findAll() {
        return repository.findAll();
    }

    public List<Endereco> findByUserId(Long userId) {
        List<Endereco> result = repository.findByUserId(userId);
		return result;
    }

}
