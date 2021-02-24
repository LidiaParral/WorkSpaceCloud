package com.cloud.mvc.modelo.controlador;

import java.util.ArrayList;
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
	//private GestorVideojuego gestVideojuego;
	
	
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
				
				
				//Este ejemplo de meter un lista habria que hacerlo
				//llamando al modelo, este no esta bien pero para el 
				//ejemplo vale
				List<Videojuego> listaVideojuego = new ArrayList<>();
				Videojuego v1 = new Videojuego();
				v1.setId(1);
				v1.setNombre("Sony");
				v1.setMarca("Sega");
				v1.setPrecio(10.98);
				
				listaVideojuego.add(v1);
				
				Videojuego v2 = new Videojuego();
				v2.setId(2);
				v2.setNombre("Fornite");
				v2.setMarca("Epic Games");
				v2.setPrecio(45.50);
				
				listaVideojuego.add(v2);
				
				Videojuego v3 = new Videojuego();
				v3.setId(3);
				v3.setNombre("Grand Theft Auto V");
				v3.setMarca("Rockstars Games");
				v3.setPrecio(47.50);
				
				listaVideojuego.add(v3);
				
				Videojuego v4 = new Videojuego();
				v4.setId(4);
				v4.setNombre("Cyberpunk 2077");
				v4.setMarca("CD Prokekt");
				v4.setPrecio(52.50);
				
				listaVideojuego.add(v4);
				
				Videojuego v5 = new Videojuego();
				v5.setId(5);
				v5.setNombre("Minecraft");
				v5.setMarca("Mojang Studios");
				v5.setPrecio(25.50);
				
				listaVideojuego.add(v5);
			
				//Metemos la lista de videojuegos en el modelo
				model.addAttribute("lista", listaVideojuego);
				
	
			 //Retorna inicio.xml
			 return "inicio";
		 } else {
			 //Retorna error.xml
			 return "error";
		 }
		 
		 
		
		
	}
}
