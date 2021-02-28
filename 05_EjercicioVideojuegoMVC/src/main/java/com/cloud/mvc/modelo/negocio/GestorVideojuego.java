package com.cloud.mvc.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.mvc.modelo.entidad.Videojuego;
import com.cloud.mvc.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	//Esta capa se encarga de lógica de la app, de validaciones, de aplicar requisitos del cliente
	
		public List<Videojuego> obtenerListaVideojuegos() {
			// Retornar la lista de videojuegos
			return daoVideojuego.findAll();
		}

		public Videojuego buscarVideojuego(int id) {
			
			
			Optional<Videojuego> videojuego = daoVideojuego.findById(id);
			
			if(videojuego.isEmpty()) {
				return null;
			} else {
				return videojuego.get();
			}
			
			
			
			
			
		}

	
		

}
