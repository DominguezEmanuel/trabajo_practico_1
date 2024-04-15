package ar.edu.unju.fi.ejercicio12.model;

import java.time.LocalDate;
import java.util.Calendar;

public class Persona {

	private String nombrePersona;
	private Calendar fechaNacimiento;
	
	public Persona() {
		//Constructor por Defecto
	}

	public Persona(String nombrePersona, Calendar fechaNacimiento) {
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int Edad(int anioNacimiento , int mes) {
		int anio = LocalDate.now().getYear();
		int mesAnio = LocalDate.now().getMonthValue(); 
		int edad = anio - anioNacimiento;
		if (mes <= mesAnio)
			return edad;
		else
			return edad - 1;
	}
	
	public String signoZodiaco(int dia , int mes) {
		 if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	            return "Aries";
	        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	            return "Tauro";
	        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	            return "Géminis";
	        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	            return "Cáncer";
	        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	            return "Leo";
	        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	            return "Virgo";
	        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	            return "Libra";
	        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	            return "Escorpio";
	        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	            return "Sagitario";
	        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
	            return "Capricornio";
	        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	            return "Acuario";
	        } else {
	            return "Piscis";
	        }
	}
	
	public String estacionDelAño(int dia, int mes) {
		if ((dia >= 21 && mes == 12) || mes == 1 || mes == 2 || (dia <= 20 && mes == 3)) {
            return "Verano";
        } else if ((dia >= 21 && mes == 3) || mes == 4 || mes == 5 || (dia <= 20 && mes == 6)) {
            return "Otoño";
        } else if ((dia >= 20 && mes == 6) || mes == 7 || mes == 8 || (dia <= 20 && mes == 9)) {
            return "Invierno";
        } else {
            return "Primavera";
        }
	}

	public void MostrarDatos(int dia , int mes , int anio) {
		System.out.println("");
		System.out.println("Datos de "+this.getNombrePersona());
		System.out.println("Nombre: "+this.getNombrePersona());
		System.out.println("Fecha de Nacimiento: "+this.getFechaNacimiento().getTime());
		System.out.println("Edad: "+this.Edad(anio, mes + 1)+" años");
		System.out.println("Signo del Zodiaco: "+this.signoZodiaco(dia , mes + 1));
		System.out.println("Estacion: "+this.estacionDelAño(dia , mes + 1));
	}
	
	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
	
}
