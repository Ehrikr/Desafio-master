package com.desafio.Desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.Desafio.model.Status;
import com.desafio.Desafio.repositories.StatusRepository;

@Service
public class StatusService {
	@Autowired
	private StatusRepository repository;
	
	public List<Status> findAll(){
		return repository.findAll();
	}
	
	public Status findById(Long id) {
		Optional<Status> obj = repository.findById(id);
		return obj.get();
	}
}
