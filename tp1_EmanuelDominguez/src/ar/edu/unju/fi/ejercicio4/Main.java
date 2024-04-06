package ar.edu.unju.fi.ejercicio4;

public class Main {

	public static void main(String[] args) {
	
		int num=5, fact=1;
		
		if (num>=0 && num<=10) {
			System.out.println(num+"!");
			while (num!=0) {
				fact=fact*num;
				num--;
			}
			System.out.println("El factorial es: "+fact);
		}else {
			System.out.println("El número debe estar en el rango [0-10]");
		}
	}

}
