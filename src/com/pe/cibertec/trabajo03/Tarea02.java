package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		int numero = scanner.nextInt();
		int suma = 0;

		for (int i = 0; i <= numero; i++) {

			if (numero % 2 == 1) {
				suma = suma + i;

			}

		}

		System.out.println("La suma de los numeros impares es: " + suma);

	}

}
