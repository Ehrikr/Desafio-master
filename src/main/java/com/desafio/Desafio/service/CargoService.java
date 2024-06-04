package com.desafio.Desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.Desafio.model.Cargo;
import com.desafio.Desafio.repositories.CargoRepository;

@Service
public class CargoService {
	@Autowired
	private CargoRepository repository;
	
	public List<Cargo> findAll(){
		return repository.findAll();
	}
	
	public Cargo findById(Long id) {
		Optional<Cargo> obj = repository.findById(id);
		return obj.get();
	}
	
	public Cargo insert(Cargo obj) {
		return	repository.save(obj);
	}
	
}
