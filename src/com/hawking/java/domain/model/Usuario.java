package com.hawking.java.domain.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	private String email;
	private String senha;
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}   
	public Integer getId() {
		return this.id;
	}
 
	public String getEmail() {
		return this.email;
	}

	public String getSenha() {
		return this.senha;
	} 
}
