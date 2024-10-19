package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="regions")

public class Region {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int region_id;
	@Column(name="region_name", length = 40, nullable = true)
	private String region_name;

}
