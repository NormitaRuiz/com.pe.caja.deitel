package com.pe.cibertec.trabajo03;

import java.util.Scanner;

public class Tarea14 {
	
	/*
	 Escriba un programa que permita ingresar un número entero N positivo e imprima en pantalla
	los N primeros términos de la serie de Fibonacci. Cada término de la serie resulta de la suma
	de los dos anteriores, con excepción del primer y segundo término
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int VA1 = 1;
		int VA2 = 1;
		String valor = " ";

		do {
			System.out.println("Ingrese numero entero positivo:");
			numero = scanner.nextInt();

		} while (numero <= 2);

		valor = VA1 + "," + VA2;

		for (int i = 3; i <= numero; i++) {

			int fibonacci = VA1 + VA2;
			VA1 = fibonacci;
			VA2 = VA1;

	
			valor = valor + "," + fibonacci;

		}
		System.out.print("Los N primeros terminos de la serie es: " + valor);

	}

}
