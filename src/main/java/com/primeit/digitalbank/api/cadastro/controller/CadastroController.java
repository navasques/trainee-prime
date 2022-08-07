package com.primeit.digitalbank.api.cadastro.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeit.digitalbank.api.cadastro.model.Cadastro;
import com.primeit.digitalbank.api.cadastro.service.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	@Autowired
	CadastroService cadastroService;

	@GetMapping("/{cpf}")
	public ResponseEntity<Cadastro> get(@PathVariable String cpf) {
		try {
			Cadastro cadastro = cadastroService.getCadastro(cpf);
			return new ResponseEntity<Cadastro>(cadastro, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Cadastro>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/todos")
	public ResponseEntity<List<Cadastro>> getAll() {
		try {
			List<Cadastro> todosCadastros = cadastroService.getAll();
			return new ResponseEntity<List<Cadastro>>(todosCadastros, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Cadastro>>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/")
	public void add(@RequestBody Cadastro cadastro) {
		cadastroService.saveCadastro(cadastro);
	}

	@PutMapping("/{idCad}")
	public ResponseEntity<?> update(@RequestBody Cadastro cadastro, @PathVariable String cpf) {
		try {
			Cadastro existCadastro = cadastroService.getCadastro(cpf);
			cadastro.setCpf(cpf);
			cadastroService.saveCadastro(cadastro);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
