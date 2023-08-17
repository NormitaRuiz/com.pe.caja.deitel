package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea10 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que calcule e imprima el valor de la sumatoria de los N primeros
			términos de la serie 1-1/2+1/4-1/8+1/16+...
		*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cantidad de terminos: ");
		int n = scanner.nextInt();
		double sum = 0d;

		double num = 1;
		double den = 1;
		int signo=1;

		for (int i = 1; i <= n; i++) {

			sum += signo * num / den;
			den *= 2;
			signo *= -1;

		}
		System.out.println("Suma: " + sum);
	}

}
