package com.attornatus.gerenciapessoas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attornatus.gerenciapessoas.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
