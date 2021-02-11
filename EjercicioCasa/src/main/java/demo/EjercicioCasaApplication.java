package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Casa;
import demo.modelo.entidad.Direccion;
import demo.modelo.entidad.Habitacion;
import demo.modelo.entidad.Persona;

@SpringBootApplication
@ImportResource("classpath:casa.xml")
public class EjercicioCasaApplication {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioCasaApplication.class, args);
		
		context = SpringApplication.run(EjercicioCasaApplication.class, args);
		
		Direccion d1 = context.getBean("direccion1", Direccion.class);
		System.out.println(d1);
		
		
		Direccion d2 = context.getBean("direccion2", Direccion.class);
		System.out.println(d2);
		
		Persona p1 = context.getBean("persona1", Persona.class);
		System.out.println(p1);
		
		Persona p2 = context.getBean("persona2", Persona.class);
		System.out.println(p2);
		
		Habitacion h1 = context.getBean("habitacion1", Habitacion.class);
		System.out.println(h1);
		
		Habitacion h2 = context.getBean("habitacion2", Habitacion.class);
		System.out.println(h2);
		
		
		System.out.println("\nArrayList");
		List<Persona> listaInquilinos = context.getBean("listaInquilinos", List.class);
		for (Persona persona : listaInquilinos) {
			System.out.println(persona);
		}
		
		System.out.println("\nArrayList");
		List<Persona> listaInquilinos2 = context.getBean("listaInquilinos2", List.class);
		for (Persona persona2 : listaInquilinos2) {
			System.out.println(persona2);
		}
		
		System.out.println("\nArrayList");
		List<Habitacion> listaHabitaciones = context.getBean("listaHabitaciones", List.class);
		for (Habitacion habitacion : listaHabitaciones) {
			System.out.println(habitacion);
		}
		System.out.println("\nArrayList");
		List<Habitacion> listaHabitaciones2 = context.getBean("listaHabitaciones2", List.class);
		for (Habitacion habitacion2 : listaHabitaciones2) {
			System.out.println(habitacion2);
		}
		
		
		System.out.println("\nCASA");
		Casa c1 = context.getBean("casa", Casa.class);
		c1.setPrecio(15000);
		c1.setDireccion(d1);
		c1.setPropietario(p1);
		//Hacer un CASTING de ArrayList para modificar una variable de tipo List
		c1.setListaHabitaciones((ArrayList<Habitacion>) listaHabitaciones);
		c1.setListaInquilinos((ArrayList<Persona>) listaInquilinos);
		System.out.println(c1);
		
		
		Casa c2 = context.getBean("casa", Casa.class);
		c2.setPrecio(30000);
		c2.setDireccion(d2);
		c2.setPropietario(p2);
		c2.setListaHabitaciones((ArrayList<Habitacion>) listaHabitaciones2);
		c2.setListaInquilinos((ArrayList<Persona>) listaInquilinos2);
		System.out.println(c2);
	}

}
