package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Empleado;

@SpringBootApplication
public class Ej1SpringBootApplication {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(Ej1SpringBootApplication.class, args);
		
		Empleado emp1 = context.getBean("empleado", Empleado.class);
		System.out.println(emp1);
		Empleado emp2 = context.getBean("empleado", Empleado.class);
		System.out.println(emp2);
	}

}
