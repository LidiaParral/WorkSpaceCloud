package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Cliente;


@SpringBootApplication
public class Application {

	public static ApplicationContext context;
	
	
	public static void main(String[] args) {
		
		context = SpringApplication.run(Application.class, args);
		
		Cliente c = context.getBean("cliente", Cliente.class);
		System.out.println(c);
		
		Cliente c2 = context.getBean("cliente", Cliente.class);
		System.out.println(c2);
	}

}
