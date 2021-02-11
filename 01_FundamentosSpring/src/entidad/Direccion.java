package entidad;

public class Direccion {
	
	private String tipoVia;
	private String NombreVia;
	private String ciudad;
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return NombreVia;
	}
	public void setNombreVia(String nombreVia) {
		NombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Tipo de vía: " + tipoVia + ", Nombre de la vía: " + NombreVia + ", Ciudad: " + ciudad;
	}
	
	
	

}
