package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		Boolean verificacion = false;
		
		while ( verificacion == false ) {
			System.out.println("Ingrese un numero (3-10) :");
			numero = scanner.nextInt();
			scanner.nextLine();
			if ( numero >= 3 && numero <= 10) {
				verificacion = true;
			}else {
				System.out.println("El numero debe encontrarse dentro del rango 3-10");
			}
		}
		
		System.out.println("Longitud del Vector: "+numero);
		
		int[] vector = new int[numero];
		
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese un numero para guardar en la posicion: "+i);
			int num = scanner.nextInt();
			vector[i] = num;
		}
		
		int indice = 0, sumaVector = 0;
		
		for(int posicion : vector) {
			sumaVector = sumaVector + posicion;
			System.out.println("Posicion: "+indice+" Elemento: "+posicion);
			indice++;
		}
		System.out.println("La suma de todos los valores del vector es igual a "+sumaVector);
	}

}
