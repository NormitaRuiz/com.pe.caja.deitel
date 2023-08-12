package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un número entre el 1 y el 9 ");
		int numero = scanner.nextInt();

		if (numero > 1 && numero <= 9) {
			System.out.println("La tabla de multiplicar del: "+ numero+ " es : ");

			for (int i = 1; i <= 12; i++) {
				
				int resultado=numero*i;
				System.out.println(numero + " x "+ i+ "="+resultado);
				
				

			}

		}else {
			System.out.println("El valor ingresado es incorrecto");
		}

	}
}