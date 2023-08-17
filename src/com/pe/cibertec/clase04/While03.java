package com.pe.cibertec.clase04;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * pedir valor long e imprimir sus digitos pares e impares
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el valor long: ");
		long n = scanner.nextLong();
		String contadorPar= " ";
		String contadorimpar= " ";

		while (n > 0) {

			int digito = (int) n % 10;
			if (digito % 2 == 0) {
				contadorPar = contadorPar + digito;

			} else {
				contadorimpar =contadorimpar+digito;

			}
			
			n /= 10;
			
		}
		System.out.println("Los numeros pares e impares son: " + contadorPar + " , " + contadorimpar);

	}

}
