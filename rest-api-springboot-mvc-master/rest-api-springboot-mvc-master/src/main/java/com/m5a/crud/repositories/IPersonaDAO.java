package com.m5a.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.m5a.crud.models.Persona;

@Repository
public interface IPersonaDAO extends MongoRepository<Persona, String> {
	
	
}
