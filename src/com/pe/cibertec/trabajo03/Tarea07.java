package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de alumnos ");
		int numeroAlumno = scanner.nextInt();
		double contadorPromedio=0;
		double promedioFinal=0.00d;

		for (int i = 1; i <= numeroAlumno; i++) {
			System.out.println("Ingrese la nota del examen final del alumno: "+ i);
			double examenFinal = scanner.nextDouble();
			System.out.println("Ingrese la nota del examen parcial:  "+i);
			double examenParcial = scanner.nextDouble();
			System.out.println("Ingrese la nota del trabajo final:  "+i);
			double trabajoFinal = scanner.nextDouble();
			
			double promedioAlumno = 0.55 * examenFinal + 0.30 * examenParcial + 0.15 * trabajoFinal;
			System.out.println("El promedio de la nota del alumno "+promedioAlumno);
			
			contadorPromedio+=promedioAlumno;
		}
		promedioFinal=contadorPromedio/numeroAlumno;
		System.out.println("El promedio final de los alumnos es:  "+promedioFinal);

	}

}
