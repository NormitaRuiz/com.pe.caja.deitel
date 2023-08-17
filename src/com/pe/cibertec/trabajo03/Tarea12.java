package com.pe.cibertec.trabajo03;

import java.util.Scanner;

public class Tarea12 {
	/*
	 * Escriba un programa que permita invertir el orden de los dígitos de número
	 * entero positivo
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el numero: ");
		int numero = scanner.nextInt();
		
		while (numero > 0) {
			int digito = numero % 10;
			int reverso = digito;
			numero /= 10;
			System.out.print(reverso);

		}
		System.out.println();

	}

}
