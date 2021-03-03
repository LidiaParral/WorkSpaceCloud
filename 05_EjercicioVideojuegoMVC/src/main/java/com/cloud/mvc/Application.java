package com.cloud.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cloud.mvc.modelo.entidad.Usuario;
import com.cloud.mvc.modelo.entidad.Videojuego;
import com.cloud.mvc.modelo.persistencia.DaoUsuario;
import com.cloud.mvc.modelo.persistencia.DaoVideojuego;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoUsuario daoUser = context.getBean("daoUsuario", DaoUsuario.class);

		DaoVideojuego daoVideojuego = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Usuario u = new Usuario();
		u.setNombre("Lidia");
		u.setPassword("123456");
		
		daoUser.save(u);
		
		
		ArrayList<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
		Videojuego v1 = new Videojuego();
		v1.setNombre("Sony");
		v1.setMarca("Sega");
		v1.setPrecio(10.98);
		listaVideojuegos.add(v1);
		
		daoVideojuego.save(v1);
		
		Videojuego v2 = new Videojuego();
		v2.setNombre("Fornite");
		v2.setMarca("Epic Games");
		v2.setPrecio(45.50);
		listaVideojuegos.add(v2);
		daoVideojuego.save(v2);
		
		Videojuego v3 = new Videojuego();
		v3.setNombre("Grand Theft Auto V");
		v3.setMarca("Rockstars Games");
		v3.setPrecio(47.50);
		listaVideojuegos.add(v3);
		daoVideojuego.save(v3);
		
		Videojuego v4 = new Videojuego();
		v4.setNombre("Cyberpunk 2077");
		v4.setMarca("CD Prokekt");
		v4.setPrecio(52.50);
		listaVideojuegos.add(v4);
		daoVideojuego.save(v4);
		
		Videojuego v5 = new Videojuego();
		v5.setId(5);
		v5.setNombre("Minecraft");
		v5.setMarca("Mojang Studios");
		v5.setPrecio(25.50);
		listaVideojuegos.add(v5);
		
		daoVideojuego.save(v5);
		
		daoVideojuego.findAll();
		
		
		
		
	}

}
