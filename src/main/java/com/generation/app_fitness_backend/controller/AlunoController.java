package com.generation.app_fitness_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.app_fitness_backend.model.Aluno;
import com.generation.app_fitness_backend.model.AlunoIMC;
import com.generation.app_fitness_backend.repository.AlunoRepository;
import com.generation.app_fitness_backend.repository.TreinoRepository;
import com.generation.app_fitness_backend.service.AlunoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private TreinoRepository treinoRepository;

	@GetMapping("/get-all")
	public ResponseEntity<List<Aluno>> getAll() {
		return ResponseEntity.ok(alunoRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Aluno> getByID(@PathVariable Long id) {
		return alunoRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@GetMapping("/procura-aluno/{nome}")
	public ResponseEntity<List<Aluno>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(alunoRepository.findByNomeContainingIgnoreCase(nome));
	}

	@PostMapping("/criar")
	public ResponseEntity<AlunoIMC> post(@Valid @RequestBody Aluno aluno) {
		if (!treinoRepository.existsById(aluno.getTreino().getId())){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O treino não existe!", null);
		}

		Aluno alunoSalvo = alunoRepository.save(aluno);
		AlunoIMC dto = alunoService.calculaImcAluno(alunoSalvo);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<AlunoIMC> put(@Valid @RequestBody Aluno aluno) {
		if (alunoRepository.existsById(aluno.getId())) {

			if (!treinoRepository.existsById(aluno.getTreino().getId())){
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O treino não existe!", null);
			}
			
			Aluno alunoSalvo = alunoRepository.save(aluno);
			AlunoIMC dto = alunoService.calculaImcAluno(alunoSalvo);
			return ResponseEntity.status(HttpStatus.OK).body(dto);
			
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/deletar/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);

		if (aluno.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);

		alunoRepository.deleteById(id);
	}
}
