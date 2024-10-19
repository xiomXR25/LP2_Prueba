package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usurio_id;
	@Column(name="userName", length = 45, nullable = false)
	private String userName;
	@Column(name="password", length = 45, nullable = false)
	private String password;

	public Usuarios() {
		
	}

	public Usuarios(Integer usurio_id, String userName, String password) {
		super();
		this.usurio_id = usurio_id;
		this.userName = userName;
		this.password = password;
	}

	public Integer getUsurio_id() {
		return usurio_id;
	}

	public void setUsurio_id(Integer usurio_id) {
		this.usurio_id = usurio_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
