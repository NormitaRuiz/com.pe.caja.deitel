package com.pe.cibertec.clase03;

import java.util.Scanner;

public class Do01 {

	public static void main(String[] args) {
		//pedir 03 notas enteras entre 0 y 20

		Scanner scanner = new Scanner(System.in);

		int nota;
		do {
			System.out.println("nota {0,20: ");
			nota = scanner.nextInt();
		} while (nota < 0 || nota > 20);
		System.out.println("nota ingresada es: " + nota);
	}

}
