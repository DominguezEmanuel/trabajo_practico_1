package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private double diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes para los adicionales de ingredientes especiales
    private static final double ADICIONAL_20 = 500;
    private static final double ADICIONAL_30 = 750;
    private static final double ADICIONAL_40 = 1000;

    private static final double PI = 3.14;
    
    // Constructor por defecto
    public Pizza() {
     
    }

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean getIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
    public Double CalcularPrecio() {
    	if (diametro == 20 && ingredientesEspeciales == false) {
    		this.precio = 4500;
    	}else {
    		if (diametro == 20 && ingredientesEspeciales == true) {
    			this.precio = 4500 + ADICIONAL_20;
    		}else {
    			if (diametro == 30 && ingredientesEspeciales == false) {
    				this.precio = 4800;
    			}else {
    				if (diametro == 30 && ingredientesEspeciales == true) {
    					this.precio = 4800 + ADICIONAL_30;
    				}else {
    					if (diametro == 40 && ingredientesEspeciales == false) {
    						this.precio = 5500;
    					}else {
    						if (diametro == 40 && ingredientesEspeciales == true) {
    							this.precio = 5500 + ADICIONAL_40; 
    						}
    					}
    				}
    			}
    		}
    	}
    	return precio;
    }
    
    public Double CalcularArea(Double dato) {
    	Double radio = dato / 2;
    	Double area = PI * Math.pow(radio, 2);
    	return area;
    }
}
