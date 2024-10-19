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
@Table(name="mascotas")
public class Mascotas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_mascota;
	@Column(name="nombre", length = 40, nullable = false)
	private String nombre;
	@Column(name="raza", length = 25, nullable = false)
	private String raza;
	@Column(name="genero", length = 30, nullable = false)
	private String genero;
	
	@ManyToOne
	@JoinColumn(name="cedula")
	private Profesor profesor;
}
