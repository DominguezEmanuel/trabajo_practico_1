package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Jugador> lista = new ArrayList();
		
		int opcion = 0;
		Boolean verificacion;
		
		do {
			verificacion = false;
			while (verificacion == false) {
				opcion = menu(scanner);
				if (opcion >= 1 && opcion <= 8) {
					verificacion = true;
				}else {
					System.out.println("Debe escoger una opcion valida");
					scanner.nextLine();
				}
			}
			switch (opcion) {
		    case 1:
		    	try {
			        System.out.println("Alta de Jugador");
			        System.out.println("Ingrese nombre de jugador: ");
			        String nombre = scanner.nextLine();
			        System.out.println("Ingrese apellido: ");
			        String apellido = scanner.nextLine();
			        System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
					String fechaNac = scanner.nextLine();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate fechaNacimiento = LocalDate.parse(fechaNac,formatter);
					System.out.println("Ingrese nacionalidad: ");
					String nacionalidad = scanner.nextLine();
					System.out.println("Ingrese estatura Ej:1,70 ");
					Double estatura = scanner.nextDouble();
					System.out.println("Ingrese peso: ");
					Double peso = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Ingrese posicion en la que juega: ");
					String posicion = scanner.nextLine();
					
			        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
			        lista.add(jugador);
			        
			        System.out.println("Jugador dado de alta");
		    	}catch(Exception e) {
		    		System.out.println("Error en el ingreso de datos");
		    	}
		        break;
		        
		    case 2:
		    	if (lista.isEmpty()) {
		    		System.out.println("La lista se encuentra vacia, asegurese de dar de alta a jugadores");
		    	}else {
			        System.out.println("Mostrar Datos del Jugador");
			        System.out.println("Ingrese nombre de jugador: ");
			        String nombreParaMostrar = scanner.nextLine();
			        System.out.println("Ingrese apellido: ");
			        String apellidoParaMostrar = scanner.nextLine();
			        
			        MostrarJugador(lista, nombreParaMostrar, apellidoParaMostrar);
		    	}
		        break;
		        
		    case 3:
		    	if (lista.isEmpty()) {
		    		System.out.println("La lista se encuentra vacia, asegurese de dar de alta a jugadores");
		    	}else {
			    	System.out.println("Jugadores Ordenados por Apellido");
			    	lista.sort(Comparator.comparing(Jugador::getApellidoJugador));
			    	lista.forEach(lis->System.out.println(lis));
		    	}
		        break;
		        
		    case 4: 
		    	Boolean seguir = true;
		    	if (lista.isEmpty()) {
		    		System.out.println("La lista se encuentra vacia, asegurese de dar de alta a jugadores");
		    	}else {
			    	System.out.println("Modificar Datos de Jugador");
			    	while(seguir == true) {
			    		Modificacion(scanner, lista);
			    		System.out.println("¿Desea seguir modificando? S/N" );
			    		char rta = scanner.nextLine().charAt(0);
			    		if (rta == 'N'|| rta == 'n') {
			    			seguir = false;
			    		}
			    	}
		    	}
		    	break;
		        
		    case 5:
		    	if (lista.isEmpty()) {
		    		System.out.println("La lista se encuentra vacia, asegurese de dar de alta a jugadores");
		    	}else {
		    		 System.out.println("Eliminar Jugador");
		    		 System.out.println("Ingrese nombre de jugador: ");
				     String nombreEliminar = scanner.nextLine();
				     System.out.println("Ingrese apellido: ");
				     String apellidoEliminar = scanner.nextLine();
				     
				     if (Eliminar(lista, nombreEliminar, apellidoEliminar) == true){
				    	 System.out.println("Jugador Eliminado");
				     }else {
				    	 System.out.println("Los datos proporcionados no corresponden con ningun Jugador");
				     }
		    	}
		    	break;
		    	
		    case 6:
		    	if (lista.isEmpty()) {
		    		System.out.println("La lista se encuentra vacia, asegurese de dar de alta a jugadores");
		    	}else {
		    		int cantidadJugadores = lista.size();
		    		System.out.println("Cantidad de Jugadores");
		    		System.out.println("La cantidad de jugadores que hay en la lista es de "+cantidadJugadores);
		    	}
		    	break;
		    
		    case 7:
		    	if (lista.isEmpty()) {
		    		System.out.println("La lista se encuentra vacia, asegurese de dar de alta a jugadores");
		    	}else {
		    		System.out.println("Cantidad de Jugadores de una nacionalidad");
		    		System.out.println("Ingrese una Nacionalidad: ");
		    		String nacionalidad2 = scanner.nextLine();
		    		int cantNacionalidad = determinarCantidad(lista, nacionalidad2);
		    		System.out.println("La cantidad de Jugadores de la nacionalidad "+nacionalidad2+
		    				" es de "+cantNacionalidad);
		    	}
		    	break;
		    	
		    case 8:
		    	System.out.println("Saliendo del Porgrama...");
		    	break;
		    	
		    default:
		        System.out.println("Opción Invalida");
		        break;
		}
		scanner.nextLine(); 
		}while(opcion != 8);

	}

	public static int menu(Scanner scanner) {
		int eleccion;
		System.out.println("***MENU DE OPCIONES***");
		System.out.println("1-Alta Jugador");
		System.out.println("2-Mostrar datos del Jugador");
		System.out.println("3-Mostrar Jugadores ordenados por apellido");
		System.out.println("4-Modificar datos de un Jugador");
		System.out.println("5-Eliminar Jugador");
		System.out.println("6-Mostrar cantidad de Jugadores");
		System.out.println("7-Mostrar cantidad de Jugadores de una nacionalidad");
		System.out.println("8-Salir del Programa");
		System.out.println("");
		try {
			System.out.println("¿Que opcion elige? ");
			eleccion = scanner.nextInt();
			scanner.nextLine();
			return eleccion;
		}catch(Exception e){
			System.out.println("Debe ingresar un numero");
			scanner.nextLine();
			return 0;
		}
	}
	
	public static void MostrarJugador(List<Jugador> lista, String nombre, String apellido) {
		Boolean mostrar = false;
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Jugador) {    
					Jugador jugador = (Jugador)lista.get(i); 
					if (jugador.getNombreJugador().equals(nombre) && jugador.getApellidoJugador().equals(apellido)) {
						System.out.println(jugador);
						mostrar = true;
					}
			}
		}
		if (mostrar == false) {
			System.out.println("Los datos proporcionados no corresponden a ningun Jugador");
		}
	}
	
	public static void Modificacion(Scanner scanner, List<Jugador> lista) {
		int opcionModificar = 0;
    	Boolean modificacion = false;
    	
		System.out.println("Ingrese nombre de jugador: ");
        String nombreParaModificar = scanner.nextLine();
        System.out.println("Ingrese apellido: ");
        String apellidoParaModificar = scanner.nextLine();
        
        if (verificarJugador(lista, nombreParaModificar, apellidoParaModificar) == true) {
        	int jugadorModificado = encontrarJugador(lista, nombreParaModificar, apellidoParaModificar);
        	
        	while(modificacion == false) {
	        	opcionModificar = menuModificar(scanner);
	        	if (opcionModificar >= 1 && opcionModificar <= 7) {
	        		modificacion = true;
	        	}else {
	        		System.out.println("Debe escoger una opcion valida");
	        		scanner.nextLine();	        	}
        	}
        	
        	if (modificacion == true) {
        		switch(opcionModificar) {
        		case 1:
        			System.out.println("Ingrese nuevo Nombre: ");
        			String nuevoNombre = scanner.nextLine();
        			lista.get(jugadorModificado).setNombreJugador(nuevoNombre);
        			break;
        			
        		case 2: 
        			System.out.println("Ingrese nuevo Apellido: ");
        			String nuevoApellido = scanner.nextLine();
        			lista.get(jugadorModificado).setApellidoJugador(nuevoApellido);
        			break;
        			
        		case 3:
        			try {
	        			System.out.println("Ingrese nueva Fecha de Nacimiento (dd/MM/yyyy): ");
	        			String nuevaFecha = scanner.nextLine();
	        			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        			LocalDate nuevaFechaNacimiento = LocalDate.parse(nuevaFecha,formatter);
	        			lista.get(jugadorModificado).setFechaNacimiento(nuevaFechaNacimiento);
        			}catch(Exception e) {
        				System.out.println("Error en el ingreso");
        				scanner.nextLine();
        			}
        			break;
        			
        		case 4:
        			System.out.println("Ingrese nueva Nacionalidad: ");
        			String nuevaNacionalidad = scanner.nextLine();
        			lista.get(jugadorModificado).setNacionalidadJugador(nuevaNacionalidad);
        			break;
        			
        		case 5:
        			try {
        				System.out.println("Ingrese nueva estatura Ej:1,70 ");
	        			Double nuevaEstatura = scanner.nextDouble();
	        			lista.get(jugadorModificado).setEstaturaJugador(nuevaEstatura);
        			}catch(InputMismatchException e) {
        				System.out.println("Error en el ingreso");
        				scanner.nextLine();
        			}
        			break;
        			
        		case 6:
        			try {
        			System.out.println("Ingrese nuevo Peso: ");
        			Double nuevoPeso = scanner.nextDouble();
        			lista.get(jugadorModificado).setPesoJugador(nuevoPeso);
        			}catch(InputMismatchException e) {
        				System.out.println("Error en el ingreso de datos");
        				scanner.nextLine();
        			}
        			break;
        			
        		case 7:
        			System.out.println("Ingrese nueva Posicion: ");
        			String nuevaPosicion = scanner.nextLine();
        			lista.get(jugadorModificado).setPosicionJugador(nuevaPosicion);
        			break;
        		}
        	}
        	
        }else {
        	System.out.println("El jugador que ha seleccionado no existe");
        }
        
	}
	
	public static int menuModificar(Scanner scanner) {
		int opcion = 0;
		System.out.println("***MENU DE OPCIONES***");
		System.out.println("1-Modificar Nombre");
		System.out.println("2-Modificar Apellido");
		System.out.println("3-Modificar Fecha de Nacimiento");
		System.out.println("4-Modificar Nacionalidad");
		System.out.println("5-Modificar Estatura");
		System.out.println("6-Modificar Peso");
		System.out.println("7-Modificar Posicion");
		System.out.println("");
		try{
			System.out.println("¿Que opcion elige? ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			return opcion;
		}catch(InputMismatchException e) {
			System.out.println("Error: opcion erronea");
			scanner.nextLine();
			return 0;
			
		}
		
	}
	
	public static Boolean verificarJugador(List<Jugador> lista, String nombre, String apellido) {
		Boolean verificado = false;
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Jugador) {    
				 Jugador jugador = (Jugador)lista.get(i); 
				 if (jugador.getNombreJugador().equals(nombre) && jugador.getApellidoJugador().equals(apellido)) {
					 
					verificado = true;
				 }
			 }
		}
		return verificado;
	}
	
	public static int encontrarJugador(List<Jugador> lista, String nombre, String apellido) {
		int buscado = 0;
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Jugador) {    
				 Jugador jugador = (Jugador)lista.get(i); 
				 if (jugador.getNombreJugador().equals(nombre) && jugador.getApellidoJugador().equals(apellido)) {
					 
					buscado = i;
				 }
			 }
		}
		return buscado;
	}
	
	public static Boolean Eliminar (List<Jugador> lista, String nombre, String apellido) {
		
		Boolean eliminado = false;
		
		Iterator<Jugador> iterator = lista.iterator();
		
		while(iterator.hasNext()) {
			Jugador jugador = iterator.next();
			if (jugador.getNombreJugador().equals(nombre) && jugador.getApellidoJugador().equals(apellido)) {
				iterator.remove();
				eliminado = true;
			}
		}
		
		return eliminado;
	}
	
	public static int determinarCantidad(List<Jugador> lista, String nacionalidad) {
		int cantidad = 0;
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Jugador) {    
				 Jugador jugador = (Jugador)lista.get(i); 
				 if (jugador.getNacionalidadJugador().equals(nacionalidad)) {
					 cantidad++;
				 }
			 }
		}
		return cantidad;
	}
}
