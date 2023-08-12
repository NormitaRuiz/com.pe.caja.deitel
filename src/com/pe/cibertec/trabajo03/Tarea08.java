package com.pe.cibertec.trabajo03;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroAlumno =0;
		
		 do {
			 System.out.println("Ingrese el numero de alumnos del salon");
			 numeroAlumno = scanner.nextInt();
	        } while (!(numeroAlumno <= 50 && numeroAlumno>0));


			for (int i = 1; i <= numeroAlumno; i++) {
				
				System.out.println("Ingrese el peso del alumno " + i);
				int pesoAlumno = scanner.nextInt();
				int contadorAlumnoPeso = 0;

				if (pesoAlumno < 40) {
					contadorAlumnoPeso = contadorAlumnoPeso + 1;
					System.out.println("la cantidad de alumnos que hay menor a 40 son " + contadorAlumnoPeso);

				}
				if (pesoAlumno >= 40 && pesoAlumno <= 50) {
					
					contadorAlumnoPeso = contadorAlumnoPeso + 1;
					System.out.println("la cantidad de alumnos mayores que 40 y menores igual que 50 son:  "+ contadorAlumnoPeso);
				}
				if (pesoAlumno > 50 && pesoAlumno < 60) {
					contadorAlumnoPeso = contadorAlumnoPeso + 1;
					System.out.println("la cantidad de alumnos mayores que 50 y menores que 60 son: " + contadorAlumnoPeso);
				}

				if (pesoAlumno >= 60) {
					contadorAlumnoPeso = contadorAlumnoPeso + 1;
					System.out.println("La cantidad de alumnos con el peso mayor a 60: " + contadorAlumnoPeso);

				}
			}
			

	}

}
