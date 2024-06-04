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
public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeCargo;
	@JsonIgnore
	@OneToMany(mappedBy = "cargo")
	private List<Usuario> usuarios = new ArrayList<>();
	public Cargo() {
		
	}

	public Cargo(Long id, String nomeCargo) {
		super();
		this.id = id;
		this.nomeCargo = nomeCargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	



	

	
}
