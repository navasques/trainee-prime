package com.primeit.digitalbank.api.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Banco {
	
	private int idBc;
	private String banco;
	private String codigo;
	private int visivel;
	
	public Banco() {
		
	}
	
	public Banco(int idBc, String banco, String codigo, int visivel) {
		super();
		this.idBc = idBc;
		this.banco = banco;
		this.codigo = codigo;
		this.visivel = visivel;
	}
	
	
	
}
