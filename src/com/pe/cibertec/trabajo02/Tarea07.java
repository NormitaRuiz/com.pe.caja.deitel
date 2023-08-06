package com.pe.cibertec.trabajo02;

import java.util.Scanner;

public class Tarea07 {

	public static void main(String[] args) {
		int salarioSemanal=0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de horas trabajadas");
		int hora = scanner.nextInt();

		if (hora <= 40) {

			salarioSemanal = hora * 16;
//			System.out.println("El salario semanal es: "+salarioSemanal);

		} else if (hora > 40) {

			int horaExtra = hora - 40;
			int horaNormal = hora - horaExtra;

			System.out.println("Las horas extras del empleado son: " + horaExtra);
			salarioSemanal = horaNormal * 16 + horaExtra * 20;
//			System.out.println("El salario semanal es: "+salarioSemanal);

		}
		System.out.println("El salario semanal es: " + salarioSemanal);

	}

}
