package com.pe.cibertec.clase04;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		/*
		 * Que el sistema pida valores, terminando cuando se ingresa cero finalmente
		 * imprimir la suma de los valores ingresados
		 */
		Scanner scanner = new Scanner(System.in);

		boolean sigue = true;
		double suma=0.0d;

		while (sigue) {
			System.out.println("Ingrese el valor: ");
			Double valor = scanner.nextDouble();

			if (valor == 0d) {
				sigue = false;

			}
			suma=suma+valor;
		}
		System.out.println("La suma de los valores es: "+suma );

	}

}
