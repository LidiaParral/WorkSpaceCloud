package demo.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String cp;
	private int numero;
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int num) {
		this.numero = num;
	}
	
	@Override
	public String toString() {
		return "Dirección -  Tipo de vía:" + tipoVia + ", Nombre de la vía:" + nombreVia + ", C.P.:" + cp + ", número:" + numero;
	}
	
	
	
}
