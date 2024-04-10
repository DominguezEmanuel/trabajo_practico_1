package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//PERSONA 1
		Persona persona1 = new Persona();
		
        System.out.println("Ingrese DNI: ");
        persona1.setDni(scanner.next()); 
        System.out.println("Ingrese Nombre: ");
        persona1.setNombre(scanner.next());
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        persona1.setFechaDeNacimiento(fechaNacimiento);
        System.out.println("Ingrese la provincia donde nacio: ");
        persona1.setProvincia(scanner.next());
        
        persona1.MostrarDatos(persona1.CalcularEdad(anio));
        
        //PERSONA 2
        System.out.println("Ingrese DNI:");
        String Dni = scanner.next();
        System.out.println("Ingrese nombre:");
        String nombre = scanner.next();
        System.out.print("Ingrese el día de nacimiento: ");
        int day = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int month = scanner.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        int year = scanner.nextInt();
        System.out.println("Ingrese la provincia donde nacio: ");
        String provincia = scanner.next();
        
		Persona persona = new Persona(Dni, nombre, LocalDate.of(year,month,day), provincia);
		
		persona.MostrarDatos(persona.CalcularEdad(year));
		
		//PERSONA 3
		 System.out.println("Ingrese DNI:");
	     String Dni3 = scanner.next();
	     System.out.println("Ingrese nombre:");
	     String nombre3 = scanner.next();
	     System.out.print("Ingrese el día de nacimiento: ");
	     int day3 = scanner.nextInt();
	     System.out.print("Ingrese el mes de nacimiento: ");
	     int month3 = scanner.nextInt();
	     System.out.print("Ingrese el año de nacimiento: ");
	     int year3 = scanner.nextInt();
		Persona persona3 = new Persona(Dni3, nombre3, LocalDate.of(year3, month, month3));
		
		persona3.MostrarDatos(persona3.CalcularEdad(year3));
	}

}
