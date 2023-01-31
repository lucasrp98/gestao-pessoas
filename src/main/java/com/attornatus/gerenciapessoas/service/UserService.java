package com.attornatus.gerenciapessoas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attornatus.gerenciapessoas.dto.UserDto;
import com.attornatus.gerenciapessoas.entities.User;
import com.attornatus.gerenciapessoas.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional <User> result = repository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		throw new RuntimeException();
	}

	public User save(UserDto dto) {
		User entity = new User();
		entity.setName(dto.getName());
		entity.setData_nasc(dto.getData_nasc());
		return repository.save(entity);
	}

	public User update(User user, UserDto dto) {
		user.setName(dto.getName());
		user.setData_nasc(dto.getData_nasc());
		return repository.save(user);
	}

	
}
