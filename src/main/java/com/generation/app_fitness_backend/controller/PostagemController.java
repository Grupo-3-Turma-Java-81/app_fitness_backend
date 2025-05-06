package com.generation.app_fitness_backend.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.LongToDoubleFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
import com.generation.app_fitness_backend.repository.AlunoRepository;
import com.generation.app_fitness_backend.repository.TreinoRepository;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/postagem")
@CrossOrigin(origins = "*",  allowedHeaders = "*")
public class PostagemController {
	

	@Autowired
	private AlunoRepository postagemRepository;
	
	@Autowired
	private TreinoRepository temaRepository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> getAll() {
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> getByID(@PathVariable Long id){
		return postagemRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Aluno>> getByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	@PostMapping
	public ResponseEntity<Aluno> post(@Valid @RequestBody Aluno postagem) {
	  if (temaRepository.existsById(postagem.getTema().getId()))
	    return ResponseEntity.status(HttpStatus.CREATED)
	            .body(postagemRepository.save(postagem));
	    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Tema não existe!", null);
	}
    @PutMapping
    public ResponseEntity<Aluno> put(@Valid @RequestBody Aluno postagem){
        if (postagemRepository.existsById(postagem.getId())){

            if (temaRepository.existsById(postagem.getTema().getId()))
                return ResponseEntity.status(HttpStatus.OK)
                    .body(postagemRepository.save(postagem));

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Tema não existe!", null);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Aluno> postagem = postagemRepository.findById(id);

        if (postagem.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        postagemRepository.deleteById(id);
    }
}
