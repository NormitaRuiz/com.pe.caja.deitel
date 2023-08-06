package com.pe.cibertec.trabajo01;

import java.util.Scanner;

public class Tarea04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de lapices: ");

		int nroLapices = scanner.nextInt();

		int cajas100 = nroLapices / 100;
		System.out.println("La cantidad de cajas de 100 son : " + cajas100);
		int cajas50 = nroLapices % 100 / 50;
		System.out.println("La cantidad de cajas de 50 son : " + cajas50);
		int cajas10=nroLapices % 100 % 50 /10;
		System.out.println("La cantidad de cajas de 12 son : " + cajas10);
		int bolsa1=nroLapices % 100 % 50 % 10 /1;
		System.out.println("La cantidad de bolsas de 1 son : " + bolsa1);

	}

}
