package com.pe.cibertec.clase03;

import java.util.Scanner;

public class Do03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] nota = new int[3];

		int sum = 0;

		for (int i = 0; i < nota.length; i++) {

			do {
				System.out.println("nota " + (1 + i) + "[0,20]: ");
				nota[i] = scanner.nextInt();
			} while (nota[i] < 0 || nota[i] > 20);

			sum += nota[i];

			System.out.println("promedio: " + sum);
		}

	}
}