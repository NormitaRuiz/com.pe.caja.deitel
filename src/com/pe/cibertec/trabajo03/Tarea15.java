package com.pe.cibertec.trabajo03;

import java.util.Scanner;

public class Tarea15 {
	/*
	 * Escriba un programa que permita ingresar un número entero positivo (N), menor que 10, y
		luego nos permita imprimir un triangulo de N filas formado por un carácter que se ingrese
		como dato
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;

		do {
			System.out.println("Ingrese numero entero positivo:");
			numero = scanner.nextInt();
			

		} while (numero >= 10);
		
		System.out.println("Ingrese un caracter para el triangulo:");
		char caracter=scanner.next().charAt(0);

		for (int i = 1; i <= numero; i++) {
			
			for(int j=1; j<=i; j++) {
								
				System.out.println(caracter);
				
			}
			System.out.println(" ");
			

		}

	}
}
