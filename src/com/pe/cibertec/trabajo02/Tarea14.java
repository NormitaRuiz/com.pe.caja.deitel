package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea14 {

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

		int par1 = 0;
		int par2 = 0;
		int par3 = 0;

		if (valor1 != 0) {
			if (valor1 % 2 == 0) {
				par1 = valor1;

			}
		}

		if (valor2 != 0) {
			if (valor2 % 2 == 0) {

				par2 = valor2;

			} 

		}
		if (valor3 != 0) {
			if (valor3 % 2 == 0) {

				par3 = valor3;

			} 

		}
		
		
	

		System.out.println("la cantidad de numero par es: " + par1+""+par2+""+par3);
		
		if (digito1 != 0) {
			if (digito1 % 2 != 0) {
				par1 = digito1;

			}
		}

		if (digito2 != 0) {
			if (digito2 % 2 != 0) {

				par2 = digito2;

			} 

		}
		if (digito3 != 0) {
			if (digito3 % 2 != 0) {

				par3 = digito3;

			} 

		}
		System.out.println("la cantidad de numero impar es: " + par1+""+par2+""+par3);


	}

}
