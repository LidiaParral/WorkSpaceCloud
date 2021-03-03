package com.cloud.mvc.modelo.controlador;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloud.mvc.modelo.entidad.Videojuego;
import com.cloud.mvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {
	
	
	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@GetMapping("consultaVideojuegoID")
	public String consultarVideojuegoId(@RequestParam("id_videojuego") int id, Model model) throws NoSuchAlgorithmException{
		Videojuego v = gestorVideojuego.buscarVideojuego(id);
		
		
		model.addAttribute("videojuego", v);
		
		return "juego";
	}
	
	@GetMapping("listadoVideojuegos")
	public String regresar(Model model) {
		List<Videojuego> listaVideojuegos = gestorVideojuego.obtenerListaVideojuegos();
		
		model.addAttribute("lista_videojuegos", listaVideojuegos);
		
		return "inicio";
	}

}
