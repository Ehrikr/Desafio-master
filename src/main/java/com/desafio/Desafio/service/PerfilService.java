package com.desafio.Desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.Desafio.model.Perfil;
import com.desafio.Desafio.repositories.PerfilRepository;

@Service
public class PerfilService {
	@Autowired
	private PerfilRepository repository;
	
	public List<Perfil> findAll(){
		return repository.findAll();
	}
	
	public Perfil findById(Long id) {
		Optional<Perfil> obj = repository.findById(id);
		return obj.get();
	}
	
	public Perfil insert(Perfil obj) {
		return	repository.save(obj);
	}
	
}
