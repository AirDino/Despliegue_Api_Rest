package com.m5a.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m5a.crud.models.Persona;
import com.m5a.crud.repositories.IPersonaDAO;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/persona")
public class PersonaController {

	@Autowired
	private IPersonaDAO repository;

	@PostMapping("/publicar")
	public Persona create(@Validated @RequestBody Persona p) {
		return repository.insert(p);
	}

	@GetMapping("/listar")
	public List<Persona> readAll() {
		return repository.findAll();
	}

	@PutMapping("/Actualizar/{id}")
	public Persona update(@PathVariable String id, @Validated @RequestBody Persona p) {
		return repository.save(p);
	}

	@DeleteMapping("/borrar/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}
