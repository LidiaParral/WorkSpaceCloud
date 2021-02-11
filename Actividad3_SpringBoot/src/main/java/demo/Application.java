package demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Barcelona;
import demo.modelo.entidad.Jugador;
import demo.modelo.entidad.Juventus;



@SpringBootApplication
@ImportResource("classpath:jugador.xml")
public class Application {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1-Barcelona 2-Juventus");
		int respuesta = sc.nextInt();
		
		context = SpringApplication.run(Application.class, args);
		
		Jugador jug = (Jugador) context.getBean("jugador1");
		
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
			break;

		default:
			break;
		}
		
		
		
		System.out.println(jug.getNombre() + " - " + jug.getEquipo()
				+ "-" + jug.getCamiseta().getNumero() + jug.getCamiseta().getMarca());
		
		
		sc.close();
	}
	
	

}
