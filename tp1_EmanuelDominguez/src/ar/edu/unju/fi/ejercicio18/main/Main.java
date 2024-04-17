package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		
		List<Pais> paises = new ArrayList();
		List<DestinoTuristico> destinos = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean verificacion;
		int opcion = 0;
		
        paises.add(new Pais("COD-1245", "Italia"));
        paises.add(new Pais("COD-3456", "Argentina"));	//Carga de ArrayList de Paises
        paises.add(new Pais("COD-4557", "España"));
        paises.add(new Pais("COD-6699", "Estados Unidos"));
        paises.add(new Pais("COD-7771", "Alemania"));
        paises.add(new Pais("COD-1112", "Gran Bretaña"));
        
        do {
        	verificacion = false;
			
			while (verificacion == false) {
				opcion = menu(scanner);
				if (opcion >= 1 && opcion <= 9) {
					verificacion = true;
				}else {
					System.out.println("Debe escoger una opcion valida");
				}
			}
			switch(opcion) {
			case 1:
				System.out.println("Alta de Destino");
				System.out.println("Ingrese Codigo de Destino: ");
				String codDestino = scanner.nextLine();
				System.out.println("Ingrese Nombre de Destino: ");
				String nomDestino = scanner.nextLine();
				System.out.println("Ingrese codigo de Pais: ");
				String codPais = scanner.nextLine();
				try {
					System.out.println("Ingrese Precio de Destino: ");
					Double priceDestino = scanner.nextDouble();
					System.out.println("Ingrese Cantidad de dias del Destino: ");
					Byte diasDestino = scanner.nextByte();
					if (verificarPais(paises, codPais) == true) {
						Pais country = asignarPais(paises, codPais);
						DestinoTuristico destino = new DestinoTuristico(codDestino, nomDestino, priceDestino,
								country, diasDestino);
						destinos.add(destino);
						System.out.println("Datos Guardados");
					}else {
						System.out.println("El codigo de Pais ingresado no corresponde con ningun Pais de la Lista");
					}
					scanner.nextLine();
				}catch(Exception e) {
					System.out.println("Error en el ingreso de datos");
					scanner.nextLine();
				}
				break;
				
			case 2: 
				if (destinos.isEmpty()) {
					System.out.println("La lista esta vacia, asegurese de agregar destinos turisticos ");
				}else {
					System.out.println("Mostrar Destinos");
					mostrarDestinos(destinos);
				}
				scanner.nextLine();
				break;
				
			case 3:
				if (destinos.isEmpty()) {
					System.out.println("La lista esta vacia, asegurese de agregar destinos turisticos");
				}else {
					System.out.println("Modificar Pais de Destino");
					System.out.println("Ingrese Destino: ");
					String destino = scanner.nextLine();
					if (buscarDestino(destinos, destino) == true) {
						System.out.println("Destino encontrado");
						System.out.println("Ingrese nuevo codigo de Pais: ");
						String nuevoCodPais = scanner.nextLine();
						if (buscarCodigo(paises, nuevoCodPais) == true) {
							Pais paisAsignado = new Pais();
							paisAsignado = buscarPais(paises, nuevoCodPais);
							asignacionPais(destinos, destino, paisAsignado);
							System.out.println("Modificacion Completa");
						}else {
							System.out.println("El codigo ingresado no corresponde con ningun Pais de la Lista");
						}
					}else {
						System.out.println("El destino ingresado no se encuentra en la lista");
					}
				}
				scanner.nextLine();
				break;
				
			case 4:
				if (destinos.isEmpty()) {
					System.out.println("La lista esta vacia, asegurese de agregar destinos turisticos");
				}else {
					System.out.println("Limpiando la Lista...");
					for(int i = 0; i <= 5; i++) {
						System.out.println("Espere "+i+" segundos");
					}
					destinos.clear();
					System.out.println("Lista Limpia");
				}
				scanner.nextLine();
				break;
				
			case 5:
				if (destinos.isEmpty()) {
					System.out.println("La lista esta vacia, asegurese de agregar destinos turisticos");
				}else {
					System.out.println("Eliminar Destino");
					System.out.println("Ingrese codigo de Destino para Eliminar: ");
					String codParaEliminar = scanner.nextLine();
					if (eliminarDestino(destinos, codParaEliminar) == true) {
						System.out.println("Destino Eliminado");
					}else {
						System.out.println("El codigo proporcionado no corresponde con ningun destino");
					}
				}
				scanner.nextLine();
				break;
				 
			case 6:
				if (destinos.isEmpty()) {
					System.out.println("La lista esta vacia, asegurese de agregar destinos turisticos");
				}else {
					System.out.println("Destinos Turisticos Ordenados");
			    	destinos.sort(Comparator.comparing(DestinoTuristico::getNombreDestino));
			    	destinos.forEach(dest->System.out.println(dest));
				}
				scanner.nextLine();
				break;
			
			case 7:
				System.out.println("Paises de Destinos");
				paises.forEach(pais->System.out.println(pais));
				scanner.nextLine();
				break;
			
			case 8:
				if (destinos.isEmpty()) {
					System.out.println("La lista esta vacia, asegurese de agregar destinos turisticos");
				}else {
					System.out.println("Destinos que pertenecen a un Pais");
					System.out.println("Ingrese el codigo de Pais: ");
					String codigo = scanner.nextLine();
					if (buscarCodigo(paises, codigo) == true) {
						mostrarDestinosDePais(destinos, codigo);
					}else {
						System.out.println("El codigo proporcionado no corresponde con ningun Pais de la Lista");
					}
				}
				scanner.nextLine();
				break;
				
			case 9:
				System.out.println("Saliendo del Programa...");
				break;
			}
        }while(opcion != 9);

	}
	
	public static int menu(Scanner scanner) {

		int eleccion;
		System.out.println("***MENU DE OPCIONES***");
		System.out.println("1-Alta de Destino");
		System.out.println("2-Mostrar todos los Destinos");
		System.out.println("3-Modificar el Pais de un Destino");
		System.out.println("4-Limpiar ArrayList de Destinos");
		System.out.println("5-Eliminar un Destino");
		System.out.println("6-Mostrar los Destinos ordenados por Nombre");
		System.out.println("7-Mostrar todos los Paises");
		System.out.println("8-Mostrar los Destinos que pertenecen a un Pais");
		System.out.println("9-Salir del Programa");
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

	public static Boolean verificarPais(List<Pais> paises, String codigo) {
		Boolean band = false;
		
		for(int i = 0; i < paises.size(); i++) {
			Pais pais = (Pais)paises.get(i);
			if(pais.getCodigoPais().equals(codigo)) {
				band = true;
			}
		}
		return band;
	}
	
	public static Pais asignarPais(List<Pais> paises, String codigo) {
		Pais pais = new Pais();
		for(int i = 0; i < paises.size(); i++) {
			Pais pais2 = (Pais)paises.get(i);
			if(pais2.getCodigoPais().equals(codigo)) {
				pais = pais2;
			}
		}
		return pais;
	}
	
	public static void mostrarDestinos(List<DestinoTuristico> destinos) {
		int cantidad = 1;
		for(int i = 0; i < destinos.size(); i++) {
			DestinoTuristico destiny = (DestinoTuristico)destinos.get(i);
			System.out.println("Destino "+cantidad);
			System.out.println(destiny);
			System.out.println("");
			cantidad++;
		}
	}
	
	public static Boolean buscarDestino(List<DestinoTuristico> destinos, String destino) {
		Boolean band = false;
		
		for(int i = 0; i < destinos.size(); i++) {
			DestinoTuristico destiny = (DestinoTuristico)destinos.get(i);
			if (destiny.getNombreDestino().equals(destino)) {
				band = true;
			}
		}
		
		return band;
	}
	
	public static Pais buscarPais(List<Pais> paises, String nuevoCodigo) {
		Pais encontrado = new Pais();
		for(int i = 0; i < paises.size(); i++) {
			Pais pais = (Pais)paises.get(i);
			if (pais.getCodigoPais().equals(nuevoCodigo)) {
				encontrado = pais;
			}
		}
		return encontrado;
	}
	
	public static void asignacionPais(List<DestinoTuristico> destinos, String destino, Pais pais) {
		for(int i = 0; i < destinos.size(); i++) {
			DestinoTuristico destiny = (DestinoTuristico)destinos.get(i);
			if (destiny.getNombreDestino().equals(destino)) {
				destiny.setPaisDestino(pais);
			}
		}
	}
	
	public static Boolean eliminarDestino(List<DestinoTuristico> destinos, String cod) {
		Boolean band = false;
		Iterator<DestinoTuristico> iteratorDestinos = destinos.iterator();
		
		while(iteratorDestinos.hasNext()){
			DestinoTuristico destino = iteratorDestinos.next();
			if (destino.getCodigoDestino().equals(cod)){
				iteratorDestinos.remove();
				band = true;
			}
		}
		return band;
	}

	public static Boolean buscarCodigo(List<Pais> paises, String cod) {
		Boolean band = false;
		for(int i = 0; i < paises.size(); i++) {
			Pais pais = (Pais)paises.get(i);
			if (pais.getCodigoPais().equals(cod)) {
				band = true;
			}
		}
		return band;
	}
	
	public static void mostrarDestinosDePais(List<DestinoTuristico> destinos, String cod){
		int contador = 0;
		for(int i = 0; i < destinos.size(); i++) {
			DestinoTuristico destiny = (DestinoTuristico)destinos.get(i);
			if (destiny.getPaisDestino().getCodigoPais().equals(cod)) {
				System.out.println(destiny);
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("No hay destinos asignados para el Pais ingresado");
		}
	}
}