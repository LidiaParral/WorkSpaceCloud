package com.cloud.mvc.modelo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloud.mvc.modelo.entidad.Usuario;
import com.cloud.mvc.modelo.negocio.GestorUsuario;


@Controller
public class ControladorUsuario {
	
	
	@Autowired
	private GestorUsuario gestUsuario;
	
	
	@PostMapping("Logged")
	public String logearse(@RequestParam("nombre_usuario") String nombre, @RequestParam("psswd") 
			String password) {
		
		//Pasar la información al GESTORUSUARIO
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setPassword(password);
		
		//Depende del resultado que devuelva, se retornará una u otra página
		 boolean validado = gestUsuario.validarUsuario(user);
		 
		 if(validado) {
			 //Retorna inicio.xml
			 return "inicio";
		 } else {
			 //Retorna error.xml
			 return "error";
		 }
	}
}
