package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String Dni;
	private String nombre;
	private LocalDate FechaDeNacimiento;
	private String Provincia;

	
	public Persona() {
		//Creacion del objeto Persona
	}
	
	//Constructor parametrizado
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		Dni = dni;
		this.nombre = nombre;
		FechaDeNacimiento = fechaDeNacimiento;
		Provincia = provincia;
	}
	
	// Constructor específico
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.Dni = dni;
        this.nombre = nombre;
        this.Provincia = "Jujuy";
        this.FechaDeNacimiento = fechaNacimiento;
    }
    
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	
	public int CalcularEdad(int anioNac) {
		int anio = LocalDate.now().getYear();
		int edad = anio - anioNac;
		return edad;
	}
	
	public boolean EsMayor(int anioNac) {
		if (anioNac > 18) {
			return true;
		}else {
			return false;
		}
	}
	
	public void MostrarDatos(int edad) {
		System.out.println("El nombre es: "+nombre);
		System.out.println("El DNI es: "+Dni);
		System.out.println("Fecha de Nacimiento: "+FechaDeNacimiento);
		System.out.println("Provincia donde nacio: "+Provincia);
		System.out.println("Su edad es: "+edad);
		if (this.EsMayor(edad) == true) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	}
}
