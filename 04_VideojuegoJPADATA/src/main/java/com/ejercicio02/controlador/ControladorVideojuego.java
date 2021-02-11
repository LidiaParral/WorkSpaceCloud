package com.ejercicio02.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio02.modelo.entidad.Videojuego;
import com.ejercicio02.modelo.persistencia.DaoVideojuego;

@RestController
public class ControladorVideojuego {

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	
	@GetMapping("videojuegos")
	public ResponseEntity<List<Videojuego>> listar(){
		List<Videojuego> lista = daoVideojuego.listado();
		
		ResponseEntity<List<Videojuego>> re = new ResponseEntity<List<Videojuego>>(lista, HttpStatus.NOT_FOUND);
		
		
		return re;
	}
	
	

}
