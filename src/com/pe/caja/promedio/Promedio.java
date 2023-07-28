package com.pe.caja.promedio;

import java.util.ArrayList;
import java.util.Scanner;

public class Promedio {

	private int numeroEstudiante;
	private int nota;

	public int getNumeroEstudiante() {
		return numeroEstudiante;
	}

	public void setNumeroEstudiante(int numeroEstudiante) {
		this.numeroEstudiante = numeroEstudiante;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public double promedioNota() {

		int i;
		double suma=0.0;
		double promedio=0.0;
		
		for (i = 1; i <= 10; i++) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese la nota" + i);
			double notaIngresada = scanner.nextDouble();
			
			suma=suma+notaIngresada;
			promedio=suma/10;
			
									
		}
		System.out.println("El promedio del curso es: "+promedio);
		return promedio;

		

	}

}
