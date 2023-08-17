package com.pe.cibertec.clase04;

import java.util.Iterator;
import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* x=100/1 + 99/2 + 98/3 + 97/4 +......+ 1/100 */

		double suma=0.0d;
		
		for (int i = 1; i <= 100; i++) {
			
			suma+=(101d-i)/i;

		}
		System.out.println("La suma de los valores es: " + suma);

	}

}
