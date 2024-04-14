package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		Boolean verificacion = false;
		
		while ( verificacion == false ) {
			System.out.println("Ingrese un numero (5-10) :");
			numero = scanner.nextInt();
			scanner.nextLine();
			if ( numero >= 5 && numero <= 10) {
				verificacion = true;
			}else {
				System.out.println("El numero debe encontrarse dentro del rango 5-10");
			}
		}
		
		System.out.println("Longitud del Vector: "+numero);
		
		String[] nombres = new String[numero];

		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese un nombre para guardar en la posicion: "+i);
			String nombrePersona = scanner.nextLine();
			nombres[i] = nombrePersona;
		}
		
		int indice = 0;
		//Mostrar del primer elemento al ultimo
		System.out.println("");
		System.out.println("Del primer elemento al ultimo");
		for(String valor : nombres) {
			System.out.println("Posicion: "+indice+" Elemento: "+valor);
			indice++;
		}
		
		//Mostrar del ultimo elemento al primero
		System.out.println("");
		System.out.println("Del ultimo elemento al primero");
		for(int i = nombres.length - 1; i >= 0; i--) {
			System.out.println("Posicion: "+i+" Elemento: "+nombres[i]);
		}
	}

}
