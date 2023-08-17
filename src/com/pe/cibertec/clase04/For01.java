package com.pe.cibertec.clase04;

import java.util.Iterator;
import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		/* Ingresar un numero entero N mayor que 2 luego imprimir su suma */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el valor entero (>2: )");
		int contador=0;

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			
			contador+=i;

		}
		System.out.println("La suma de los valores es: " + contador);

	}

}
