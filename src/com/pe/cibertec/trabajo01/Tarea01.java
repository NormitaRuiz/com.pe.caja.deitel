package com.pe.cibertec.trabajo01;

public class Tarea01 {

	public static void main(String[] args) {
	
		// Que lea el valor de un ángulo en radianes, luego que calcule y muestre su valor en 
		//grados, minutos y segundos.

		double valor = 180 / 3.14;
		double grado=57.324 / 1000;
		grado= 57;
		double minutos= 57.324 % 1000 * 60  ;
		minutos=19.44;
		double segundos= 19.44 % 100 % 100 * 60; 
		segundos=26;
		
		System.out.println("El grado es: " +grado);
		System.out.println("Los minutos son: " +minutos);
		System.out.println("Los segundos son: " +segundos);
		
	}

}
