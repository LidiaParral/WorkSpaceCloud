package com.cloud.mvc.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.mvc.modelo.entidad.Videojuego;


@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{


	//Con JPA se puede crear búsquedas usando convenciones de creación de métodos
	//Todo método que empiece con las palabras "findBy" + Atributo, JPADATA creará la consulta automáticamente.


	
	
	

}
