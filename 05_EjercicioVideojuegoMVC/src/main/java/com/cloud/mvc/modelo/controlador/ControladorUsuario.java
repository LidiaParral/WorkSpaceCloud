package com.cloud.mvc.modelo.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloud.mvc.modelo.entidad.Usuario;
import com.cloud.mvc.modelo.entidad.Videojuego;
import com.cloud.mvc.modelo.negocio.GestorUsuario;
import com.cloud.mvc.modelo.negocio.GestorVideojuego;


@Controller
public class ControladorUsuario {
	
	
	@Autowired
	private GestorUsuario gestUsuario;
	
	@Autowired
	private GestorVideojuego gestVideojuego;
	
	

	@PostMapping("Logged")
	public String logearse(@RequestParam("nombre_usuario") String nombre, @RequestParam("psswd") 
			String password, Model model) {
		
		//Pasar la información al GESTORUSUARIO
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setPassword(password);
		
		//Depende del resultado que devuelva, se retornará una u otra página
		 boolean validado = gestUsuario.validarUsuario(user);
		 
		 if(validado) {
			//El objeto model le podemos poner
				//todos los datos que queramos mandar a 
				//la vista
				model.addAttribute("nombreUsuario", nombre);
				
				List<Videojuego> listaVideojuego = gestVideojuego.obtenerListaVideojuegos();
				
				model.addAttribute("lista", listaVideojuego);
				
				
	
			 //Retorna inicio.xml
			 return "inicio";
		 } else {
			 //Retorna error.xml
			 return "error";
		 }
		 
	
		
	}
	

}
