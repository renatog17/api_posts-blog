package com.renato.apicriticas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renato.apicriticas.domain.Filme;
import com.renato.apicriticas.repository.FilmeRepository;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Filme>> getFilmes(){
		System.out.println("aqui");
		List<Filme> filmes = filmeRepository.findAll();
		return ResponseEntity.ok(filmes);
	}
}
