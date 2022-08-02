package com.primeit.digitalbank.api.cadastro.repository;

import com.primeit.digitalbank.api.cadastro.model.Cadastro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

}
