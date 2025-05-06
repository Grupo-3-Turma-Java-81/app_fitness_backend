package com.generation.app_fitness_backend.model;

import java.time.LocalDate;

public class AlunoIMC{
	
	private Long id;
	private String nome;
	private String endereco;
	private String telefone;
	private LocalDate dataMatricula;
	private double peso;
	private double altura;
	private double imc;
	private String classificacaoImc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public LocalDate getDataMatricula() {
		return dataMatricula;
	}
	
	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getImc() {
		return imc;
	}
	
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public String getClassificacaoImc() {
		return classificacaoImc;
	}
	
	public void setClassificacaoImc(String classificacaoImc) {
		this.classificacaoImc = classificacaoImc;
	}
}
