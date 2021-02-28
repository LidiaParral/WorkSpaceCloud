package demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Coche;
import demo.modelo.persistencia.DaoCoche;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoCoche daoCoche = context.getBean("daoCoche", DaoCoche.class);
		
		Coche coche = new Coche();
		coche.setMatricula("CMD-3456");
		coche.setMarca("Ferrari");
		coche.setPotencia(1100);
		
		//persisitimos el coche en BBDD
		//notese, que no ponemos el ID del coche, ya
		//que la bbdd no pone uno por defecto y es autoincremental
		//daoCoche.save(coche);
		
		//para modificar, usaremos el mismo metodo pero esta vez
		//tendremos que pasarle el ID que queremos modificar.
		//Es decir, si NO le pasamos ID, lo dara de alta en la BBDD
		//si le pasamos el ID, entonces modificaremos dicho registro
		Coche c2 = new Coche();
		c2.setId(1);//importante poner el id que queremos modificars
		c2.setMatricula("FDR-9876");
		c2.setMarca("Ferrari");
		c2.setPotencia(1200);
		//Notese que sobreescribimos TODO el objeto
		
		daoCoche.save(c2);
		
		//Para acceder a un coche
		//ojo, el metodo findById() devuelve un optinal
		//hay que desenvolverlo con get(), tambien podemos
		
		Coche c3 = daoCoche.findById(1).get();
		System.out.println(c3);
		
		//usar el metodo isPresent() para ver si el objeto exite
		Optional<Coche> cocheOptional = daoCoche.findById(2);
		if(cocheOptional.isPresent()) {
			System.out.println("existe el coche");
			//deselvolvemos el objeto SOLO en caso de que
			//exista en la BBDD
			System.out.println(cocheOptional.get());
		}else {
			System.out.println("el coche no existe");
		}
		
		//recuperar todos los coches
		List<Coche> listaCoches = daoCoche.findAll();
		System.out.println(listaCoches);
		
		//borrar un coche
		daoCoche.deleteById(1);
		
		listaCoches = daoCoche.findAll();
		System.out.println(listaCoches);
	}

}
