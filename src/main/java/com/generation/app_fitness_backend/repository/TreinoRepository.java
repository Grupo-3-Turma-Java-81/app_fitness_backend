package com.generation.app_fitness_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.app_fitness_backend.model.Treino;

public interface TreinoRepository extends JpaRepository<Treino, Long>{
	public List<Treino> findByTipoTreinoContainingIgnoreCase(@Param("tipoTreino") String tipoTreino);
}
