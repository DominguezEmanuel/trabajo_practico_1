package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {

	private String codigoDestino;
	private String nombreDestino;
	private Double precioDestino;
	private Pais paisDestino;
	private byte cantidadDias;
	
	public DestinoTuristico() {
		
	}

	public DestinoTuristico(String codigoDestino, String nombreDestino, Double precioDestino, Pais paisDestino,
			byte cantidadDias) {
		this.codigoDestino = codigoDestino;
		this.nombreDestino = nombreDestino;
		this.precioDestino = precioDestino;
		this.paisDestino = paisDestino;
		this.cantidadDias = cantidadDias;
	}
	
	

	@Override
	public String toString() {
		return "Datos del Destino: [Codigo: " + codigoDestino + " - Nombre: " + nombreDestino
				+ " - Precio: $" + precioDestino + " - Pais: " + paisDestino.getNombrePais() + " - Codigo Pais: " +paisDestino.getCodigoPais() 
				+ " - Dias: " + cantidadDias + "]";
	}

	public String getCodigoDestino() {
		return codigoDestino;
	}

	public void setCodigoDestino(String codigoDestino) {
		this.codigoDestino = codigoDestino;
	}

	public String getNombreDestino() {
		return nombreDestino;
	}

	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	public Double getPrecioDestino() {
		return precioDestino;
	}

	public void setPrecioDestino(Double precioDestino) {
		this.precioDestino = precioDestino;
	}

	public Pais getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(Pais paisDestino) {
		this.paisDestino = paisDestino;
	}

	public byte getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(byte cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	
	
}
