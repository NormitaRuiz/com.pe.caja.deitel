package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero");
		int numero = scanner.nextInt();
		int valor1 = numero / 1000;
		int valor2 = numero % 1000 / 100;
		int valor3 = numero % 100 / 10;
		int valor4 = numero % 10;
		System.out.println("Los valores del numero son: " + valor1 + (" ") + valor2 + (" ") + valor3 + (" ") + valor4);

		int contadorPar = 0;
		int contadorImpar = 0;

		if (valor1 != 0) {
			if (valor1 % 2 == 0) {
				contadorPar = contadorPar + 1;

			} else {
				contadorImpar = contadorImpar + 1;
			}
		}

		if (valor2 != 0) {
			if (valor2 % 2 == 0) {

				contadorPar = contadorPar + 1;

			} else {
				contadorImpar = contadorImpar + 1;
			}

		}
		if (valor3 != 0) {
			if (valor3 % 2 == 0) {

				contadorPar = contadorPar + 1;

			} else {
				contadorImpar = contadorImpar + 1;
			}

		}

		if (valor4 != 0) {
			if (valor4 % 2 == 0) {

				contadorPar = contadorPar + 1;

			} else {
				contadorImpar = contadorImpar + 1;
			}
		}

		System.out.println("la cantidad de numero par es: " + contadorPar);
		System.out.println("la cantidad de numero impar es: " + contadorImpar);

	}

}
