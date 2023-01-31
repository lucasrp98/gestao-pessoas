package com.attornatus.gerenciapessoas.dto;

import com.attornatus.gerenciapessoas.entities.User;

public class EnderecoDto {
	
	private String rua;
	private User user;
	
	public EnderecoDto() {
		
	}
	
	public EnderecoDto(String rua, User user) {
		this.rua = rua;
		this.user = user;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
