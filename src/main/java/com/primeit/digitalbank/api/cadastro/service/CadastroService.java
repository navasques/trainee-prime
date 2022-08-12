package com.primeit.digitalbank.api.cadastro.service;

import com.primeit.digitalbank.api.cadastro.repository.CadastroRepository;
import com.primeit.digitalbank.api.cadastro.model.Cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CadastroService {
	
	@Autowired(required = true)
	private CadastroRepository cadastroRepository;
	
	public void saveCadastro(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
	}
	
	public Cadastro getCadastro(Integer idcad) {
		return cadastroRepository.findById(idcad).get();
	}

	public List<Cadastro> getAll() {
		return cadastroRepository.findAll();
	}
}
