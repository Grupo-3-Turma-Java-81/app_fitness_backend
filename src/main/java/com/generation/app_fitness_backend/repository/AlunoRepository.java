package com.generation.app_fitness_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.app_fitness_backend.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {	
	public List<Aluno> findByNomeContainingIgnoreCase(@Param("nome") String nome);
}