package entidad;


//IMPORTANTE: Spring es un contenedor de POJOS, por lo tanto tiene
//que tener esa estructura. Además tienen que seguir el convenio
// de JavaBean: atributos privados y metodos publicos
public class Persona {
	
	private String nombre;
	private int edad;
	private double peso;
	private Direccion direccion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + ", Dirección: " + direccion;
	}
	
	
	
}
