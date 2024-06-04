package com.desafio.Desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.Desafio.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
