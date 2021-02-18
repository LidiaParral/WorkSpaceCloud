package com.mvc.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.modelo.entidad.Usuario;

//Se esta creando un objeto de tipo DAOUsuario dentro del contexto de spring con el nombre de la clase y sera el encargado de hacer todas la fucniones de la base de datos 
@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer>{


	//Con JPA se puede crear búsquedas usando convenciones de creación de métodos
	//Todo método que empiece con las palabras "findBy" + Atributo, JPADATA creará la consulta automáticamente.
	
	public Usuario findByNombre(String nombre);
	
	public Usuario findByNombreAndPassword(String nombre, String password);
	
	

}
