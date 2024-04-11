package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		int cantidadPizzas = 1;
		Scanner scanner = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		while (cantidadPizzas <= 3) {
			
			System.out.println("Ingrese diametro de la pizza 20, 30 o 40: ");
			Double diametro = scanner.nextDouble();
			System.out.println("La pizza lleva ingredientes especiales? (true/false): ");
			Boolean ingredientesEspeciales = scanner.nextBoolean();
			
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			pizza.setPrecio(pizza.CalcularPrecio());
			pizza.setArea(pizza.CalcularArea(diametro));
			
			System.out.println("** Pizza "+cantidadPizzas+" **");
			System.out.println("Diametro = "+pizza.getDiametro()+" cm");
			System.out.println("Ingredientes Especiales = "+pizza.getIngredientesEspeciales());
			System.out.println("Precio Pizza = "+pizza.getPrecio()+"$");
			System.out.println("Área de la Pizza = "+pizza.getArea()+" cm^2");
			
			cantidadPizzas++;
			
			if (cantidadPizzas > 3) {
				System.out.println("Orden Terminada");
			}
		}

	}

}
