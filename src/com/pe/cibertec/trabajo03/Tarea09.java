package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cantidad de terminos: ");
		int n = scanner.nextInt();
		double sum = 0d;

		double num = 1;
		double den = 1;

		for (int i = 1; i < n; i++) {

			sum += num / den;
			den *= 2;

		}
		System.out.println("Suma: " + sum);
	}

}
