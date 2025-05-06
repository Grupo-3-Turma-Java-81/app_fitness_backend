package com.generation.app_fitness_backend.controller;

import java.util.List;
import java.util.Optional;

import javax.sound.midi.MetaMessage;

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
import com.generation.app_fitness_backend.model.Treino;
import com.generation.app_fitness_backend.repository.TreinoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/temas")
@CrossOrigin(origins = "*",  allowedHeaders = "*")
public class TemaController {
	
	@Autowired
	private TreinoRepository temaRepository;
	
	@GetMapping
	public ResponseEntity<List<Treino>> getAll() {
		return ResponseEntity.ok(temaRepository.findAll());
	}
    @GetMapping("/{id}")
    public ResponseEntity<Treino> getById(@PathVariable Long id){
        return temaRepository.findById(id)
            .map(resposta -> ResponseEntity.ok(resposta))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @GetMapping("/descricao/{descricao}")
    public ResponseEntity<List<Treino>> getByTitle(@PathVariable 
    String descricao){
        return ResponseEntity.ok(temaRepository
            .findAllByDescricaoContainingIgnoreCase(descricao));
    }
    
    @PostMapping
    public ResponseEntity<Treino> post(@Valid @RequestBody Treino tema){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(temaRepository.save(tema));
    }
    
    @PutMapping
    public ResponseEntity<Treino> put(@Valid @RequestBody Treino tema){
        return temaRepository.findById(tema.getId())
            .map(resposta -> ResponseEntity.status(HttpStatus.CREATED)
            .body(temaRepository.save(tema)))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Treino> tema = temaRepository.findById(id);
        
        if(tema.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        
        temaRepository.deleteById(id);              
    }


}
