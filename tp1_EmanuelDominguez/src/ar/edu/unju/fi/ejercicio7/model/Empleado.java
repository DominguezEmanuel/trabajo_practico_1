package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String legajo;
	private Double salario;
	
	private static final Double SALARIO_MINIMO = 210000.00;
	private static final Double AUMENTO_POR_MERITOS = 20000.00;
	
	public Empleado(String nombre, String legajo, Double salario) {
		this.nombre = nombre;
		this.legajo = legajo;

		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void Mostrar() {
		System.out.println("Nombre del Empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario $: "+this.salario);
		
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double DarAumento(Double salario) {
		double NuevoSalario = AUMENTO_POR_MERITOS + salario;
		return NuevoSalario;
	}
	
}
