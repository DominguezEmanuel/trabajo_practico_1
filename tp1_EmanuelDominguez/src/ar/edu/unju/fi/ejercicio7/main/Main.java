package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese legajo de empleado: ");
		String legajo = scanner.next();
		System.out.println("Ingrese el salario del empleado: ");
		Double salary = scanner.nextDouble();

		Empleado empleado = new Empleado(nombre, legajo, salary);

		empleado.Mostrar();
		
		empleado.setSalario(empleado.DarAumento(empleado.getSalario()));
		
		System.out.println("Salario Modificado");
		empleado.Mostrar();
	}

}
