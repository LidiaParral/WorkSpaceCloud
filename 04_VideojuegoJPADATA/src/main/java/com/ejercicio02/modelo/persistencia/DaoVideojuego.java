package com.ejercicio02.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ejercicio02.modelo.entidad.Videojuego;

@Component
public class DaoVideojuego {
	
	private List<Videojuego> listaVideojuegos;

	public DaoVideojuego() {
		
		Videojuego v1 = new Videojuego();
		v1.setId(1);
		v1.setNombre("Grand Theft Auto V");
		v1.setPrecio(10.00);
		v1.setCompania("Rockstar North");
		v1.setPuntuacion(8.9);
		
		Videojuego v2 = new Videojuego();
		v2.setId(2);
		v2.setNombre("Final Fantasy VII");
		v2.setPrecio(44.95);
		v2.setCompania("Square");
		v2.setPuntuacion(7.4);
		
		listaVideojuegos = new ArrayList<Videojuego>();
		listaVideojuegos.add(v1);
		listaVideojuegos.add(v2);
		
		
	}

	public List<Videojuego> listado() {
		return listaVideojuegos;
	}
	
	
	
	
	

}
