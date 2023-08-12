package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		int numero = scanner.nextInt();
		int contadorMultiplos3 = 0;

		System.out.println("El numero ingresado es: " + numero);

		for (int i = 1; i < numero; i++) {

			if (i % 3 == 0) {
				
				System.out.println("El numero "+ i + "    es multiplo de 3: " );

			}

		}

	}

}
