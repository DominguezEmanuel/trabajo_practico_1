package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nombres = new String[5];
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese el nombre de una persona: ");	//Peticion de nombres para el vector
			String nombrePersona = scanner.nextLine();
			nombres[i] = nombrePersona;
		}
		
		int indice = 0;
		
		System.out.println("");
		System.out.println("Contenido del Vector");
		while(indice < nombres.length) {
			System.out.println("Indice: "+indice+" Valor: "+nombres[indice]);	//Visualizacion del vector
			indice++;
		}
		
		System.out.println("El tamaño del arreglo es: "+nombres.length); //Tamaño del array usando length
		
		Boolean verificado = false;
		Byte eliminado = 0;
		
		do {
			System.out.println("Ingrese el indice del elemento a eliminar: ");
			eliminado = scanner.nextByte();
			if ( eliminado >= 0 && eliminado < indice) {                                //Solicitar indice mediante do-while
				verificado = true;
			}else {
				System.out.println("Ese numero de posicion no existe en el arreglo");
			}
		} while ( verificado == false );
		
		
		System.out.println("Posicion del vector para eliminar: "+eliminado);
		
		for(int k = 0; k < nombres.length; k++) {
			if ( eliminado == indice - 1) {
				nombres[eliminado] = "";
			}else {
				if ( k == eliminado) {									//Eliminacion del la cadena que se encuentra en el indice seleccionado
					while(eliminado < indice - 1) {
						nombres[eliminado] = nombres[eliminado + 1];
						eliminado++;
					}
				}
			}
		}
		
		indice = 0;
		System.out.println("");
		System.out.println("Contenido del nuevo Vector");
		while(indice < nombres.length) {										//Visualizacion del nuevo arreglo
			System.out.println("Indice: "+indice+" Valor: "+nombres[indice]);
			indice++;
		}
	}

}
