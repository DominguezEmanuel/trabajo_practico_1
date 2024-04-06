package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        //System.out.println("El número ingresado es: " + numero);
        if (num%2==0) {
        	System.out.println("El número introducido es par");
        	int triple=num*3;
        	System.out.println("Resultado: "+triple);
        }else {
        	System.out.println("El número introducido es impar");
        	int doble=num*2;
        	System.out.println("Resultado: "+doble);
        }
	}

}
