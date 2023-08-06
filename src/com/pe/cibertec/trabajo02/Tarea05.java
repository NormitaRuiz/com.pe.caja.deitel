package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea05 {

	public static void main(String[] args) {

		double montoTotal = 0.0d;
		double interes = 0.0d;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el monto del credito: ");
		double credito = scanner.nextDouble();

		if (credito < 5000) {
			interes = 0.03 * credito;
//			montoTotal = credito + interes;
//			System.out.println("El monto total a pagar por el credito es: " + montoTotal);

		} else if (credito > 5000 && credito < 10000) {
			interes = 0.02 * credito;
//			montoTotal = credito + interes;
//			System.out.println("El monto total a pagar por el credito es: " + montoTotal);

		} else {

			interes = 0.01 * credito;
//			montoTotal = credito + interes;
//			System.out.println("El monto total a pagar por el credito es: " + montoTotal);
		}

		montoTotal = credito + interes;
		System.out.println("El monto total a pagar por el credito es: " + montoTotal);

	}

}
