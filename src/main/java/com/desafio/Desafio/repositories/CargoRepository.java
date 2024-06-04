package com.desafio.Desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.Desafio.model.Cargo;


public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
