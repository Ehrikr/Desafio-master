package com.desafio.Desafio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomePerfil;
	@JsonIgnore
	@OneToMany(mappedBy = "perfil")
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Perfil(Long id, String nomePerfil) {
		super();
		this.id = id;
		this.nomePerfil = nomePerfil;
	}

	public Perfil() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePerfil() {
		return nomePerfil;
	}

	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	
}
