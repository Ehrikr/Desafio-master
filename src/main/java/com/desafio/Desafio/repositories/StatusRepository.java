package com.desafio.Desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.Desafio.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
