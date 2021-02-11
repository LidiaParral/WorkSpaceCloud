package com.mvc.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.persistencia.DaoUsuario;

//Hay que dar de alta este objeto en el contexto SPRING

/*Con la anotación @Service se da de alta un objeto en contexto de SPRING,
*es equivalente a la anotación @Component
*
*/
@Service
public class GestorUsuario {
	
	@Autowired
	private DaoUsuario daoUsuario;
	
	//Esta capa se encarga de lógica de la app, de validaciones, de aplicar requisitos del cliente
	
	public boolean validarUsuario(Usuario user) {
		Usuario userAux = 
		daoUsuario.findByNombreAndPassword(user.getNombre(), user.getPassword());
		
		
		//Si UserAux es NULL, entonces no está en la BBDD. Si UserAux tiene otro valor, quiere decir que el usuario existe
		
		if(userAux == null) {
			return false;
		} else {
			return true;
		}
	}
}
