package com.primeit.digitalbank.api.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Imagem {

	private int idImg;
	private int idCad;
	private String tipo;
	private boolean frente; 
	private boolean verso;
	private Timestamp dtCriacao;
	
	public Imagem() {
	
	}

	public Imagem(int idImg, int idCad, String tipo, boolean frente, boolean verso, Timestamp dtCriacao) {
		this.idImg = idImg;
		this.idCad = idCad;
		this.tipo = tipo;
		this.frente = frente;
		this.verso = verso;
		this.dtCriacao = dtCriacao;
	}
	
	
	
}
