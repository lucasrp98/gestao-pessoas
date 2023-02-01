package com.attornatus.gerenciapessoas.dto;

import com.attornatus.gerenciapessoas.entities.User;

public class EnderecoDto {
	
	private String rua;
	private User user;
	private Long cep;
	private Long num_casa;
	private String cidade;
	
	public EnderecoDto() {
		
	}
	
	public EnderecoDto(String rua, User user, Long cep, Long num_casa, String cidade) {
		this.rua = rua;
		this.user = user;
		this.cep = cep;
		this.cidade = cidade;
		this.num_casa = num_casa;
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

	public Long getCep() {
		return cep;
	}

	public Long getNum_casa() {
		return num_casa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public void setNum_casa(Long num_casa) {
		this.num_casa = num_casa;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	

}
