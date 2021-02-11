package negocio;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Persona;

public class MainSpring {
	
	public static ApplicationContext context = null;
	
		public static void main(String[] args) {
		//El contexto de spring también es un objeto así que tenemos
			// que crearlo
		
			
		context = new ClassPathXmlApplicationContext("recurso/context.xml");
		
		//A partir de aquí tenemos nuestro contexto de spring cargando, con los objetos
		// que haya en el xml
		
		
		//A partir de ahora, siempre que queramos un objeto gestionado por SPRING
		//tenemos que pedirlo al contexto
		Persona p1 = (Persona) context.getBean("persona1");
		System.out.println(p1);
		//Valores vacíos
		
		
		p1.setNombre("Lidia");
		p1.setEdad(25);
		

		p1.setPeso(45);
		
		System.out.println(p1);
		
		//Esto sería de una manera habitual
		cambiarEdadPersona(p1, 26);
		System.out.println(p1);
		
		//Con SPRING podriamos hacer lo siguiente
		cambiarEdad(21);
		System.out.println(p1);
		
		//p1 = null;
		
		//Después de mil lineas el objeto sigue teniendo el mismo valor
		p1 = context.getBean("persona1",Persona.class);
		System.out.println(p1);
		
		p1 = context.getBean("persona2",Persona.class);
		System.out.println(p1);
		
		p1 = context.getBean("persona3",Persona.class);
		System.out.println(p1);
		
		p1=context.getBean("personaPrototipada", Persona.class);
		System.out.println(p1);
		p1.setNombre("Superman");
		
		
		//ArrayList<Persona> listaPersonas = context.getBean("listaPersonas", ArrayList.class);
		List<Persona> listaPersonas = context.getBean("listaPersonas", List.class);
		//listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(p1);
		System.out.println(p1);
		
		p1=context.getBean("personaPrototipada", Persona.class);
		System.out.println(p1);
		
		System.out.println(listaPersonas.get(0));
		
		
		
		p1 = context.getBean("persona4", Persona.class);
		System.out.println(p1);
		
		
		List<Persona> listaPersonas2 = context.getBean("listaPersonas2", List.class);
		for (Persona persona : listaPersonas2) {
			System.out.println(persona);
		}
	}
	
	public static void cambiarEdadPersona(Persona p, int edad) {
		p.setEdad(edad);
	}
	
	
	public static void cambiarEdad(int edad) {
		Persona p = (Persona) context.getBean("persona1");
		p.setEdad(edad);
	}
}
