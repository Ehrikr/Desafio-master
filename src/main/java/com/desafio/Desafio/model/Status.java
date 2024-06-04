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
public class Status implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeStatus;
	@OneToMany(mappedBy = "status")
	@JsonIgnore
	private List<Usuario> usuarios = new ArrayList<>();
	public Status(Long id, String nomeStatus) {
		super();
		this.id = id;
		this.nomeStatus = nomeStatus;
	}

	public Status() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeStatus() {
		return nomeStatus;
	}

	public void setNomeStatus(String nomeStatus) {
		this.nomeStatus = nomeStatus;
	}
	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
