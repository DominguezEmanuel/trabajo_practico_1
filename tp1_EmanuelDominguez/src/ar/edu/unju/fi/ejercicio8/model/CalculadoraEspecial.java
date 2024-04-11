package ar.edu.unju.fi.ejercicio8.model;

import java.util.Iterator;

public class CalculadoraEspecial {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public CalculadoraEspecial() {
		//Constructor por Defecto
	}
	
	public Double CalcularSumatoria() {
		int res;
		int base;
		Double sumatoria = 0.0;
		for (int k = 1; k <= n; k++) {
			res = k * (k + 1);
			base = res/2;
			sumatoria = sumatoria + Math.pow(base,2);
		}
		return sumatoria;
	}
	
	public Double CalcularProductoria() {
		int prod;
		Double productoria = 0.0;
		for (int k = 1; k <= n; k++) {
			prod = k * (k + 4);
			productoria = productoria + prod;
		}
		return productoria;
	}
}
