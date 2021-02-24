package com.cloud.mvc.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.mvc.modelo.entidad.Videojuego;
import com.cloud.mvc.modelo.persistencia.DaoVideojuego;

public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	//Esta capa se encarga de lógica de la app, de validaciones, de aplicar requisitos del cliente
		public boolean validarVideojuego(Videojuego v) {
		
		Videojuego videoAux = daoVideojuego.findById(v.getId());
	
		if(videoAux == null) {
			return false;
		} else {
			return true;
		}
	}

}
