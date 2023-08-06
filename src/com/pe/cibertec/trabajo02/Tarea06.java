package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la zona de la vivienda: Comercial o Residencial  ");
		String zona = scanner.nextLine();
		zona = zona.toUpperCase();
		System.out.println("Este metodo convierte el string a mayuscula  " + zona);
		System.out.println("Ingrese la cantidad de kilowatts consumidos al mes: ");
		double kilowatts = scanner.nextDouble();
		double precioComercial = 50d;
		double precioResidencial = 25d;
		double costo = 0.0d;

		switch (zona) {
		case "COMERCIAL":
			costo = (kilowatts <= 100) ? precioComercial + kilowatts * 0.75 : precioComercial + kilowatts * 0.90;
			/*
			 * if (kilowatts <= 100) { costo = precioComercial + kilowatts * 0.75;
			 *System.out.println("El monto a pagar: " + costo);
			 * 
			 * }else {// if (kilowatts > 100) costo = precioComercial + kilowatts * 0.90;
			 * System.out.println("El monto a pagar: " + costo);
			 * 
			 * }
			 */
			break;

		case "RESIDENCIAL":
			costo = (kilowatts <= 100) ? precioResidencial + kilowatts * 0.30 : precioResidencial + kilowatts * 0.70;
			/*
			 * if (kilowatts <= 100) { costo = precioResidencial + kilowatts * 0.30; //
			 * System.out.println("El monto a pagar: " + costo);
			 * 
			 * }else {//if (kilowatts > 100) costo = precioResidencial + kilowatts * 0.70;
			 * // System.out.println("El monto a pagar: " + costo); }
			 */
			break;

		default:

			System.out.println("La residencia ingresada no existe");

			break;

		}
		System.out.println("El monto a pagar: " + costo);

	}

}
