package com.mvc.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.modelo.entidad.Usuario;

public interface DaoUsuario extends JpaRepository<Usuario, Integer>{


	//Con JPA se puede crear búsquedas usando convenciones de creación de métodos
	//Todo método que empiece con las palabras "findBy" + Atributo, JPADATA creará la consulta automáticamente.
	
	public Usuario findByNombre(String nombre);
	
	public Usuario findByNombreAndPassword(String nombre, String password);
	

}
