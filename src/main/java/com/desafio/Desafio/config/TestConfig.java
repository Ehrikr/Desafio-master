package com.desafio.Desafio.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.desafio.Desafio.model.Cargo;
import com.desafio.Desafio.model.Perfil;
import com.desafio.Desafio.model.Status;
import com.desafio.Desafio.model.Usuario;
import com.desafio.Desafio.repositories.CargoRepository;
import com.desafio.Desafio.repositories.PerfilRepository;
import com.desafio.Desafio.repositories.StatusRepository;
import com.desafio.Desafio.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CargoRepository cargoRepository;

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cargo cg1 = new Cargo(null,"Gerente");
		Cargo cg2 = new Cargo(null,"Supervisor");
		Cargo cg3 = new Cargo(null,"Administrativo");
		
		Perfil p1 = new Perfil(null, "Administrador");
		Perfil p2 = new Perfil(null, "Comum");
		
		Status s1 = new Status(null, "Ativo");
		Status s2 = new Status(null, "Inativo");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse("16/10/2020");
		Long cpf = 15612118775L;
		Usuario us = new Usuario("jonathan", cpf , 'm', date, cg1, p1,s1);
		cargoRepository.saveAll(Arrays.asList(cg1,cg2,cg3));
		perfilRepository.saveAll(Arrays.asList(p1,p2));
		statusRepository.saveAll(Arrays.asList(s1,s2));
		usuarioRepository.saveAll(Arrays.asList(us));
	}
}
