package demo.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Jugador {
	
	private int id;
	private String nombre;
	@Autowired
	@Qualifier("barcelona")
	private Equipo equipo;
	@Autowired
	private Camiseta camiseta;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}
	@Override
	public String toString() {
		return "Jugador - id:" + id + ", nombre:" + nombre + ", equipo:" + equipo + ", " + camiseta;
	}
	
	
	
	

}
