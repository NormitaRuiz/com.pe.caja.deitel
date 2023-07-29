package com.pe.caja.cibertec;

import java.util.Scanner;

public class Tarea06 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un valor de 6 dígitos: ");
		int valorIngresado = scanner.nextInt();
		int posicionPrimera=valorIngresado / 100000;
		System.out.println("El valor de la posicion primera es: "+posicionPrimera);

	}

}
