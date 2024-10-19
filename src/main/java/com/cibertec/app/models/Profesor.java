package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cedula;
	@Column(name="nombres", length = 50, nullable = false)
	private String nombres;
	@Column(name="apellido", length = 45, nullable = false)
	private String apellido;
	@Column(name="genero", length = 25, nullable = false)
	private String genero;
	
}
