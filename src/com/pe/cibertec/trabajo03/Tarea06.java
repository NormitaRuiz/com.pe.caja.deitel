package com.pe.cibertec.trabajo03;

import java.util.Scanner;

public class Tarea06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero ");
		int numero = scanner.nextInt();
		int contadorImpar=0;
		
		for (int i = 1; i <= numero; i++) {

			if (i % 2 == 1) {
				int impar = i;
				contadorImpar += impar;
				System.out.println("Los numeros impares son: " + impar);
			

			}

		}
		
		System.out.println("El cuadrado de un numero es: " + contadorImpar);

	}

}
