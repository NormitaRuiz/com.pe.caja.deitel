package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero 1 ");
		int valor1 = scanner.nextInt();
		System.out.println("Ingrese el numero 2 ");
		int valor2 = scanner.nextInt();
		System.out.println("Ingrese el numero 3 ");
		int valor3 = scanner.nextInt();
		int maximo;
		int minimo;
		int medio;
		int sumaAlto;
		int diferenciaBajo;

		if (valor1 >= valor2 && valor1 >= valor3) {
			maximo = valor1;
			System.out.println("El maximo numero es: " + maximo);

		} else if (valor2 >= valor1 && valor2 >= valor3) {
			maximo = valor2;
			System.out.println("El maximo numero es: " + maximo);

		} else {
			maximo = valor3;
			System.out.println("El maximo numero es: " + maximo);
		}
		// minimo
		if (valor1 <= valor2 && valor1 <= valor3) {
			minimo = valor1;
			System.out.println("El minimo numero es: " + minimo);

		} else if (valor2 <= valor1 && valor2 <= valor3) {
			minimo = valor2;
			System.out.println("El minimo numero es: " + minimo);

		} else {
			minimo = valor3;
			System.out.println("El minimo numero es: " + minimo);
		}
		// medio
		medio = valor1 + valor2 + valor3 - maximo - minimo;
		System.out.println("El numero medio es: " + medio);

		sumaAlto = maximo + medio;
		System.out.println("La suma de los numeros mas altos es: " + sumaAlto);

		diferenciaBajo = medio - minimo;
		System.out.println("La diferencia de los numeros mas bajos es: " + diferenciaBajo);

	}
}