package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="publicaciones")
public class Publicaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer publicacion_id;
	@Column(name="titulo", length = 45, nullable = false)
	private String titulo;
	@Column(name="cuerpo", length = 45, nullable = false)
	private String cuerpo;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuarios usuarios;
	

	public Publicaciones () {
		
	}


	public Publicaciones(Integer publicacion_id, String titulo, String cuerpo, Usuarios usuarios) {
		super();
		this.publicacion_id = publicacion_id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.usuarios = usuarios;
	}


	public Integer getPublicacion_id() {
		return publicacion_id;
	}


	public void setPublicacion_id(Integer publicacion_id) {
		this.publicacion_id = publicacion_id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}


	public Usuarios getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	
}
