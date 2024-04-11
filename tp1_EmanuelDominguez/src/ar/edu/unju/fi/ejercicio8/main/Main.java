package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		CalculadoraEspecial CalculadoraEspecial = new CalculadoraEspecial();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese valor: ");
		int n = scanner.nextInt();
		
		CalculadoraEspecial.setN(n);
		
		System.out.println("Calculo de la Sumatoria = "+CalculadoraEspecial.CalcularSumatoria());
		System.out.println("Calculo de la Productoria = "+CalculadoraEspecial.CalcularProductoria());
		
	}

}
