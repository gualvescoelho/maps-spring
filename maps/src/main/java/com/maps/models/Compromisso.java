package com.maps.models;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Compromissos")
public class Compromisso implements Serializable{

	private static final long serialVersionUID = -7452954603443054695L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String titulo;
	
	private String hora;
	
	private String minuto;

	private String origem;

	private String destino;


	public Compromisso() {
		super();
	}

	public Compromisso(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Compromisso(String titulo, String hora, String minuto, String origem, String destino) {
		super();
		this.titulo = titulo;
		this.hora = hora;
		this.minuto = minuto;		
		this.origem = origem;
		this.destino = destino;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public String getOrigem(){
		return origem;
	}

	public void setOrigem(String origem){
		this.origem = origem;
	}

	public String getDestino(){
		return this.destino;
	}

	public void setDestino(String destino){
		this.destino = destino;
	}
}
