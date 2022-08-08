package com.primeit.digitalbank.api.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "cadastro")
public class Imagem {
	
	private int idImg;
	private int idCad;
	private String tipo;
	private boolean frente;
	private boolean verso;
	private Timestamp dtCriacao;
	
	
	
}
