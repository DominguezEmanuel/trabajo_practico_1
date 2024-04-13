package ar.edu.unju.fi.ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros; //Definicion de Vector
		
		numeros = new int[8]; //Construccion de Vector
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
		    try {
		        System.out.println("Ingrese un numero: ");
		        numeros[i] = scanner.nextInt();
		    } catch (InputMismatchException e) {
		        System.out.println("Error en la entrada de datos, vuelva a intentarlo");
		        scanner.next(); // Limpiar la entrada inválida
		        i--; // Decrementar i para volver a solicitar el valor para ese índice
		    }
		}
	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice de Vector: "+i+" Valor Almacenado: "+numeros[i]);
		}
	}

}
