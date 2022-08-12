package com.primeit.digitalbank.api.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imagem")
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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdImg() {
		return idImg;
	}

	public void setIdImg(int idImg) {
		this.idImg = idImg;
	}

	public int getIdCad() {
		return idCad;
	}

	public void setIdCad(int idCad) {
		this.idCad = idCad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isFrente() {
		return frente;
	}

	public void setFrente(boolean frente) {
		this.frente = frente;
	}

	public boolean isVerso() {
		return verso;
	}

	public void setVerso(boolean verso) {
		this.verso = verso;
	}

	public Timestamp getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Timestamp dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	
	
	
}
