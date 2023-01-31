package com.attornatus.gerenciapessoas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attornatus.gerenciapessoas.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    List<Endereco> findByUserId(Long userId);
}
