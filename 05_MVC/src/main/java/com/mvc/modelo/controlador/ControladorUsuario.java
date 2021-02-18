package com.mvc.modelo.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
				List<Usuario> listaUsuario = new ArrayList<>();
				Usuario usuario1 = new Usuario();
				usuario1.setNombre("Goku");
				usuario1.setPassword("654321");
				
				listaUsuario.add(usuario1);
				
				usuario1 = new Usuario();
				usuario1.setNombre("Steve Rogers");
				usuario1.setPassword("987654");
				
				listaUsuario.add(usuario1);
				
				//Metemos la lista de usuarios en el modelo
				model.addAttribute("lista", listaUsuario);
			 //Retorna inicio.xml
			 return "inicio";
		 } else {
			 //Retorna error.xml
			 return "error";
		 }
	}
}
