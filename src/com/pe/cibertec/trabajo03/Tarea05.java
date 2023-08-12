package com.pe.cibertec.trabajo03;

import java.util.Scanner;

public class Tarea05 {

	public static void main(String[] args) {
		/*
		 * Realizar una aplicación que permita sumar los n primeros pares y los m
		 * primeros número impares. Tanto n y m, son número enteros que deberán ser
		 * ingresados por el usuario y representan la cantidad de números que desean
		 * operar.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los n primeros numeros ");
		int numero = scanner.nextInt();
		System.out.println("Ingrese los m primeros numeros ");
		int numeroImpar = scanner.nextInt();
		int contadorPar = 0;
		int contadorImpar = 0;
		int par = 0;
		int impar = 0;

		for (int i = 1; i <= numero; i++) {

			if (i % 2 == 0) {
				par = i;
				contadorPar = contadorPar + par;
				System.out.println("Los numeros pares son " + par);

			}

		}

		System.out.println("La suma de los pares de los n primeros numeros es: " + contadorPar);

		
		 System.out.println(
		 "=========================================================");
		 
		for (int j = 1; j <= numeroImpar; j++) {

			if (j % 2 == 1) {
				impar = j;
				contadorImpar += impar;
				System.out.println("Los numeros impares son " + j);

			}

		}

		System.out.println("La suma de los impares de los m primeros numeros es: " + contadorImpar);

	}

}
