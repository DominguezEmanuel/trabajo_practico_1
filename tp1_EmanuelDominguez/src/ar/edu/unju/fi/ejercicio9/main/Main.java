package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		int cantProductos = 0;
		
		Scanner scanner = new Scanner(System.in);
		Producto producto = new Producto();
		
		while (cantProductos < 3) {
			
			System.out.println("Ingrese nombre de producto: ");
			String nombre = scanner.next();
			
			System.out.println("Ingrese codigo de producto: ");
			String cod = scanner.next();
			
			System.out.println("Ingrese precio de producto: ");
			double precio = scanner.nextDouble();
			
			System.out.println("Ingrese descuento de producto entre [$0-$50] ");
			int descuento = scanner.nextInt();
			
			cantProductos++;
			
			producto.setNombreProducto(nombre);
	        producto.setCodigoProducto(cod);
	        producto.setPrecioProducto(precio);
	        producto.setDescuento(descuento);
	        
			producto.MostrarDatos();
			
			Double precioConDescuento = producto.CalcularDescuento();
			
			System.out.println("Precio con Descuento: $"+precioConDescuento);
		}
	}

}
