package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero1");
		int numero1 = scanner.nextInt();
		int valor1 = numero1 / 100;
		int valor2 = numero1 % 100 / 10;
		int valor3 = numero1 % 10;
		System.out.println("Los valores del numero son: " + valor1 + (" ") + valor2 + (" ") + valor3 + (" "));

		System.out.println("Ingrese el numero2");
		int numero2 = scanner.nextInt();
		int digito1 = numero2 / 100;
		int digito2 = numero2 % 100 / 10;
		int digito3 = numero2 % 10;
		System.out.println("Los valores del numero son: " + digito1 + (" ") + digito2 + (" ") + digito3 + (" "));

		int maximo;
		int minimo;
		int medio;


		if (valor1 >= valor2 && valor1 >= valor3) {
			maximo = valor1;

		} else if (valor2 >= valor1 && valor2 >= valor3) {
			maximo = valor2;

		} else {
			maximo = valor3;
		}
		// minimo
		if (valor1 <= valor2 && valor1 <= valor3) {
			minimo = valor1;

		} else if (valor2 <= valor1 && valor2 <= valor3) {
			minimo = valor2;

		} else {
			minimo = valor3;
		}
		// medio
		medio = valor1 + valor2 + valor3 - maximo - minimo;

		System.out.println("El orden del numero 1 de mayor a menor es: " + maximo + "" + medio + "" + minimo);

		if (digito1 >= digito2 && digito1 >= digito3) {
			maximo = digito1;

		} else if (digito2 >= digito1 && digito2 >= digito3) {
			maximo = digito2;

		} else {
			maximo = digito3;
		}
		// minimo
		if (digito1 <= digito2 && digito1 <= digito3) {
			minimo = digito1;

		} else if (digito2 <= digito1 && digito2 <= digito3) {
			minimo = digito2;

		} else {
			minimo = digito3;

		}
		// medio
		medio = digito1 + digito2 + digito3 - maximo - minimo;

		System.out.println("El orden del numero 2 de menor a mayor es: " + minimo + "" + medio + "" + maximo);
	}

}
