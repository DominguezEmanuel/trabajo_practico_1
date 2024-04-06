package ar.edu.unju.fi.ejercicio5;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        
        if (num>=1 && num<=9) {
        	System.out.println("TABLA DEL NÚMERO "+num);
	        for (int i = 0; i <= 10; i++) {
				int res=num*i;
				System.out.println(num+"x"+i+"="+res);
	        }
        }else {
        	System.out.println("Debe ingresar un número entre el [1-9]");
        }
		} 
			
}
