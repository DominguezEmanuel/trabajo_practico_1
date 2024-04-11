package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombreProducto;
	private String codigoProducto;
	private Double precioProducto;
	private int descuento;
	
	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public Double getPrecioProducto() {
		return precioProducto;
	}


	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}


	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		if (descuento >= 0 && descuento <=50) {
			this.descuento = descuento;
		}else {
			System.out.println("El descuento debe estar entre 0-50");
		}
	}

	public Double CalcularDescuento() {
		Double NuevoPrecio = precioProducto - descuento;
		return NuevoPrecio;
	}
	
	public Producto() {
		//Constructor por defecto
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre del Producto: "+this.nombreProducto);
		System.out.println("Codigo de Producto: COD-"+this.codigoProducto);
		System.out.println("Precio: $"+this.precioProducto);
		System.out.println("Descuento: $"+this.descuento);
	}
}
