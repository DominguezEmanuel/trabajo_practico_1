package ar.edu.unju.fi.ejercicio12.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calendar fechaNacimiento = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento en formato (dd/MM/yyyy): ");
		String fechaNac = scanner.nextLine();
		
		try {
            Persona persona = new Persona();
    		
    		persona.setNombrePersona(nombre);
    		
    		Date fechaParse = formatter.parse(fechaNac);
    		fechaNacimiento.setTime(fechaParse);
    		persona.setFechaNacimiento(fechaNacimiento);
    		
    		int anio = persona.getFechaNacimiento().get(Calendar.YEAR);
    		int dia = persona.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
    		int mes = persona.getFechaNacimiento().get(Calendar.MONTH);
    		
    		persona.MostrarDatos(dia, mes, anio);
    		
        } catch (ParseException e) {
        	System.out.println("Error en la fecha");
            //e.printStackTrace();
        }

	}
}
