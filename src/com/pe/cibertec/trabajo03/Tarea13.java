package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) {
		// Un entero positivo N es un número perfecto, si es igual a la suma de sus
		// divisores menores que él.
		// Escriba un programa que permita verificar si un entero positivo es perfecto o
		// no

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el numero: ");
		int numero = scanner.nextInt();
		int acumulador = 0;

		for (int i = 1; i < numero; i++) {

			if (numero % i == 0) {

				acumulador += i;

				if (acumulador % numero == 0) {

					System.out.println("El numero es perfecto");
					

				}
				

			}

		}
		
	}
	
}
