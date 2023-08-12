package com.pe.cibertec.clase03;

import java.util.Scanner;

public class Do02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese las 03 notas ");

		int nota1;
		int nota2;
		int nota3;

		do {
			System.out.println("nota1 [0,20 ]: ");
			nota1 = scanner.nextInt();
		} while (nota1 < 0 || nota1 > 20);
		

		do {
			System.out.println("nota2 [0,20 ]: ");
			nota2 = scanner.nextInt();
		} while (nota1 < 0 || nota2 > 20);

		do {
			System.out.println("nota3 [0,20 ]: ");
			nota3 = scanner.nextInt();
		} while (nota1 < 0 || nota3 > 20);
		
		System.out.println("promedio: " + (nota1+nota2+nota3)/3d);
	}

}
