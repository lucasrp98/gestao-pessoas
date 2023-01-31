package com.attornatus.gerenciapessoas.dto;

import java.util.List;

import com.attornatus.gerenciapessoas.entities.Endereco;

public class UserDto {
	private String name;
	private String data_nasc;
	
	public UserDto() {
		
	}
	
	public UserDto(String name, String data_nasc, List<Endereco> endereco) {
		this.name = name;
		this.data_nasc = data_nasc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
}
