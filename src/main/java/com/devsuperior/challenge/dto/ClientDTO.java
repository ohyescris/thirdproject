package com.devsuperior.challenge.dto;

import java.time.LocalDate;

import com.devsuperior.challenge.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public class ClientDTO {

	private Long id;

	@NotBlank(message = "Campo requerido")
	private String name;
	private String cpf;
	@Positive(message = "A renda deve ser positiva")
	private Double income;
	@PastOrPresent(message = "Data de nascimento inválida")
	private LocalDate birthDate;
	private Integer children;

	public ClientDTO() {
	}

	public ClientDTO(Long id, @NotBlank(message = "Campo requerido") String name, String cpf, @Positive Double income,
			@PastOrPresent(message = "Data de nascimento inválida") LocalDate birthDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client client) {
		id = client.getId();
		name = client.getName();
		cpf = client.getCpf();
		income = client.getIncome();
		birthDate = client.getBirthDate();
		children = client.getChildren();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
}
