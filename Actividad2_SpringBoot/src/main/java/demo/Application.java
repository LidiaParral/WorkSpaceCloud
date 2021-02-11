package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Autor;
import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:email.xml")
public class Application {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Email email1 = context.getBean("email", Email.class);
		email1.setRemitente("AAA");
		email1.setDestinatario("BBB");
		email1.setId(22);
		
		Email email2 = context.getBean("emailSingletone", Email.class);
		Email email3 = context.getBean("emailSingletone", Email.class);
		
		System.out.println("Email por anotaciones");
		System.out.println(email1);
		
		System.out.println("\nEmail por XML");
		System.out.println(email2);
		System.out.println(email3);
		
		System.out.println("\nAutores");
		Autor autor1 = context.getBean("autor", Autor.class);
		autor1.setEdad(27);
		autor1.setId(1);
		autor1.setNombre("Lidia Parral");
		
		Libro libro1 = context.getBean("libro", Libro.class);
		libro1.setAutor(autor1);
		libro1.setEditorial("Editorial 1");
		libro1.setIsbn("123");
		System.out.println(autor1);
		
		System.out.println("\nLibros");
		System.out.println(libro1);
		
		System.out.println("\nLibro XML");
		Autor autor2 = context.getBean("autorXml1", Autor.class);
		System.out.println(autor2);
		
		Libro libro2 = context.getBean("libroXml1", Libro.class);
		System.out.println(libro2);
	}

}
