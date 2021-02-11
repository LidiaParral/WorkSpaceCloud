package demo.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//Tenemos que decirle a JPA data que esta clase JavaBean
//queremos que nos cree una tabla en bbdd y que la maneje
//para dar trabajar con persistencia de datos de los objetos
//Para ello usamos la anotacion @Entity

//Con esta anotacion le decimos a JPA que queremo crear
//una tabla en bbdd que se llame coche, y que tenga como
//campos todos sus atributos
@Entity
public class Coche {
	//Vamos a decirle que este campo sera primery key
	@Id
	//Vamos a decirle que cada vez que de de alta un objeto
	//en base de datos me autogenere el id de manera incremental
	@GeneratedValue
	private int id;
	//esta anotacion dice que queremos hacer el valor de esa columna
	//unico
	@Column(unique = true)
	private String matricula;
	private String marca;
	private int potencia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
}
