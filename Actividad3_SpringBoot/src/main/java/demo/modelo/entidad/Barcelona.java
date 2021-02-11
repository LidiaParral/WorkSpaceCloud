package demo.modelo.entidad;

public class Barcelona extends Equipo {

	private int id = 1;
	private String nombre = "barcelona";
	
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
		return "Barcelona - id:" + id + ", nombre:" + nombre;
	}
	
	
}
