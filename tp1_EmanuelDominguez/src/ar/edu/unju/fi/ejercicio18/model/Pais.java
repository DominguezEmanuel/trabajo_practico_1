package ar.edu.unju.fi.ejercicio18.model;

public class Pais {

	private String codigoPais;
	private String nombrePais;
	
	public Pais() {
		
	}

	public Pais(String codigoPais, String nombrePais) {
		this.codigoPais = codigoPais;
		this.nombrePais = nombrePais;
	}
	
	

	@Override
	public String toString() {
		return "Datos de Pais [ Codigo: " + codigoPais + " - Nombre: " + nombrePais + " ]";
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	
}
