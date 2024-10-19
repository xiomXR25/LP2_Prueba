package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departaments")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deparment_id;
	@Column(name="departament_name", length = 30, nullable = false)
	private String departament_name;
	@Column(name="locatio_id", nullable = false)
	private int location_id;
}
