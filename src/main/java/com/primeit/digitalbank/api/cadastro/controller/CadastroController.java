package com.primeit.digitalbank.api.cadastro.controller;

import com.primeit.digitalbank.api.cadastro.repository.CadastroRepository;
import com.primeit.digitalbank.api.cadastro.model.Cadastro;
import com.primeit.digitalbank.api.cadastro.service.CadastroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	@Autowired
	CadastroService cadastroService;
	
	@GetMapping("/{idCad}")
	public ResponseEntity<Cadastro> get(@PathVariable Integer idCad) {
		try {
			Cadastro cadastro = cadastroService.getCadastro(idCad);
			return new ResponseEntity<Cadastro>(cadastro, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Cadastro>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Cadastro cadastro) {
		cadastroService.saveCadastro(cadastro);
	}
	
	@PutMapping("/{idCad}")
	public ResponseEntity<?> update(@RequestBody Cadastro cadastro, @PathVariable Integer idCad) {
		try {
			Cadastro existCadastro = cadastroService.getCadastro(idCad);
			cadastro.setId(idCad);
			cadastroService.saveCadastro(cadastro);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
