package com.cloud.mvc.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	//ID es la clave primaria
	@Id
	//GeneratedValue = permite que autoincremente en la BBDD
	@GeneratedValue
	private int id;
	private String nombre;
	private String password;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Usuario - id:" + id + ", nombre:" + nombre + ", password:" + password;
	}
	
	
	

}
