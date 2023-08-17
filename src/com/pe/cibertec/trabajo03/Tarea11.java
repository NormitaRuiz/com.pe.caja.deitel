package com.pe.cibertec.trabajo03;

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {
		/*
		 * Escribir una aplicación que solicite un número entero N, y que calcule la
		 * sumatoria de las n primeras fracciones del tipo 1+ 2/1+ 4/3+ 6/5 + 8/7
		 */
		double numero = 0.00d;
		double suma = 0.00d;
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Ingrese numero entero positivo:");
			numero = scanner.nextInt();

		} while (numero < 0);

		for (int i = 1; i <= numero; i++) {

			
			if (i == 1) {

				suma = suma + i;

			} else if (i == 2) {
				suma = suma + i;
			} else {
				
				suma = suma + 2d * (i-1) / (2d * (i - 2) + 1d);
			}

		}
		
		System.out.println("La sumatoria de las primeras fracciones es: "+ suma);

	}

}
