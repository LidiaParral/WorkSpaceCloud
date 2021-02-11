package demo.modelo.entidad;

public class Juventus extends Equipo{

	private int id = 2;
	private String nombre = "juventus";
	
	
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
	@Override
	public String toString() {
		return "Juventus - id:" + id + ", nombre:" + nombre;
	}
	
	
}
