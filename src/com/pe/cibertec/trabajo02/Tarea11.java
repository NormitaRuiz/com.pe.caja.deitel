package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el modelo del carro: A ó B");
		String modelo = scanner.nextLine();
		modelo = modelo.toUpperCase();
		System.out.println("Ingrese la placa del carro de 6 digitos");
		int placa = scanner.nextInt();
		placa = placa % 10;
		System.out.println("Ingrese el costo aproximado del carro ");
		int costo = scanner.nextInt();

		switch (modelo) {
		case "A": {

			if (placa >= 0 && placa <= 5) {
				if (costo <= 500) {
					System.out.println("Enero");

				} else {
					if (costo > 500) {
						System.out.println("febrero");

					}

				}

			} else {
				if (placa >= 6 && placa <= 8) {
					if (costo <= 700) {
						System.out.println("junio");

					} else {
						if (costo > 700) {
							System.out.println("julio");
						}
					}

				} else {
					if (placa == 9) {
						if (costo <= 1000) {
							System.out.println("octubre");

						}

					} else {
						if (costo > 1000) {
							System.out.println("noviembre");

						}
					}
				}

			}

		}

			break;

		case "B": {
			if (placa >= 1 && placa <= 3) {
				if (costo <= 500) {
					System.out.println("marzo");

				} else {
					if (costo > 500) {
						System.out.println("abril");
					}
				}
			} else {
				if (placa >= 4 && placa <= 8) {
					if (costo <= 700) {
						System.out.println("mayo");

					} else {
						if (costo > 700) {
							System.out.println("septiembre");

						}
					}

				} else {
					if (placa == 9 || placa == 0) {
						if (costo <= 1000) {
							System.out.println("agosto");

						} else {
							if (costo > 1000) {
								System.out.println("diciembre");
							}
						}

					}
				}
			}
		}
			break;

		default:
			System.out.println("no cumple con los requisitos");
			break;

		}
	}
}
