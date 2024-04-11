package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		
		Boolean cambio = true;
		int num =  0, i = 2, prod, j;
		
		for ( j = 40; j > 0; j--) {
			if (cambio == true) {
				prod = i * j;
				num = num + prod;
				System.out.println(num+ " ");
				cambio = false;
			}else {
				num = num + j - i;
				i++;
				System.out.println(num + " ");
			}	
		}
	}
}
