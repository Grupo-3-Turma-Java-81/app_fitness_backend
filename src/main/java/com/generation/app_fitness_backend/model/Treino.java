package com.generation.app_fitness_backend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_treinos")
public class Treino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min= 5, max = 200)
	private String descricao;
	
	@NotBlank
	private String diaSemanaTreino;
	
	@NotBlank
	private String tipoTreino;
	
	@NotBlank
	private String status;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "treino", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("treino")
	private List<Aluno> aluno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDiaSemanaTreino() {
		return diaSemanaTreino;
	}

	public void setDiaSemanaTreino(String diaSemanaTreino) {
		this.diaSemanaTreino = diaSemanaTreino;
	}

	public String getTipoTreino() {
		return tipoTreino;
	}

	public void setTipoTreino(String tipoTreino) {
		this.tipoTreino = tipoTreino;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	


}
