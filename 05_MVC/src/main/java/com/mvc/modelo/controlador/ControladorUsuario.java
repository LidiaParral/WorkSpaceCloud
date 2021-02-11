package com.mvc.modelo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.negocio.GestorUsuario;

/*
 * Esta anotación sirve para dar de alta un objeto controlador en nuestra app. Es parecida
 * a la anotación @RestController pero con diferencias.
 * 
 * 
 * Iguales:
 * Ambas anotaciones sirven para mapear URLs con métodos(o recursos) y ambas
 * procesan peticioes HTTP
 * 
 * 
 * Diferencias:
 * Cuando se hace un REST el intercambio de información en el BODY del HTTP
 * se hacia con JSON, en este caso lo que devolverán los métodos serán páginas web
 
 *
 * HTML:
 * GET - Se envían los datos(parámetros) como parte de la URL de petición 
 * POST - Se envían los datos(parámetros) que son pertenecientes al BODY del mensaje HTTP //(Ej:User, Password, Tarjeta de crédito)
 *
 *
 *Crea un método que mapee una URL por POST y lo que se devuelve es el nombre de una página web 
 *localizada en 'src/main/resources/templates' o 'src/main/resources/static'
 *
 *
 *-En la primera carpeta se pone aquellas páginas que sean dinámica, es decir, aquellas páginas web
 *que su información mostrada dependa de algún otro parámetros. Por ejemplo,la página web de una tienda depende de quien se conecte
 *
 *-En la segunda carpeta se pone aquellas páginas que sean estáticas, es decir, nunca cambian. Por ejemplo, como una página de LOGIN.
 *
 *
 *Recoger los parámetros que envía el cliente, y se hace por los parámetros de entrada de este método, anotados con @RequestParam("NOMBREDEL_PARAMETRO")
 *
 */
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
