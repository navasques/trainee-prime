package com.primeit.digitalbank.api.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banco")
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

	public int getIdBc() {
		return idBc;
	}

	public void setIdBc(int idBc) {
		this.idBc = idBc;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getVisivel() {
		return visivel;
	}

	public void setVisivel(int visivel) {
		this.visivel = visivel;
	}
	
	
	
}
