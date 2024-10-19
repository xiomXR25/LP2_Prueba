package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ciudad")
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_ciudad;
	@Column(name="nombre", length = 30, nullable = false)
	private String nombre;
	
	public Ciudad() {
		
	}

	public Ciudad(Integer codigo_ciudad, String nombre) {
		super();
		this.codigo_ciudad = codigo_ciudad;
		this.nombre = nombre;
	}

	public Integer getCodigo_ciudad() {
		return codigo_ciudad;
	}

	public void setCodigo_ciudad(Integer codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
