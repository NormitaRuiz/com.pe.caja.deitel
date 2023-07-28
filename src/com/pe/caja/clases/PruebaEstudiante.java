package com.pe.caja.clases;

import java.util.Scanner;

public class PruebaEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Estudiante cuenta1=new Estudiante("Jane Green", 93.5);
			Estudiante cuenta2=new Estudiante("Jhon Blue", 72.75);			
			
			System.out.printf("La calificacion en letras de: %s es: %s %n", cuenta1.getNombre(), cuenta1.obtenerCalificacionEstudiante());
			System.out.printf("La calificacion en letras de: %s es: %s %n", cuenta2.getNombre(), cuenta2.obtenerCalificacionEstudiante());
	}

}
