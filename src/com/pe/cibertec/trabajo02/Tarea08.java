package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea08 {

	public static void main(String[] args) {

		int precio = 760;
		double descuento=0.0d;
		double precioTotal=0.0d;
		double precioPagado=0.0d;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de computadora a comprar");
		int numeroComputadora = scanner.nextInt();

		if (numeroComputadora < 5) {
			precioTotal = numeroComputadora * precio;
			descuento = 0.1 * precioTotal;
//			precioPagado = precioTotal - descuento;
//			System.out.println("El descuento total es: " + descuento);
//			System.out.println("El precio que se pago es: " + precioPagado);

		} else if (numeroComputadora >= 5 && numeroComputadora < 10) {
			precioTotal = numeroComputadora * precio;
			descuento = 0.2 * precioTotal;
//			precioPagado = precioTotal - descuento;
//			System.out.println("El descuento total es: " + descuento);
//			System.out.println("El precio que se pago es: " + precioPagado);

		} else if (numeroComputadora > 10) {
			precioTotal = numeroComputadora * precio;
			descuento = 0.4 * precioTotal;
//			precioPagado = precioTotal - descuento;
			
//			System.out.println("El descuento total es: " + descuento);
//			System.out.println("El precio que se pago es: " + precioPagado);
		}
		
		precioPagado = precioTotal - descuento;
		
		System.out.println("El descuento total es: " + descuento);
		System.out.println("El precio que se pago es: " + precioPagado);
		

	}

}
