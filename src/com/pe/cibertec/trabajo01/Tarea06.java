package com.pe.cibertec.trabajo01;

import java.util.Scanner;

public class Tarea06 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un valor de 6 digitos: ");
		int valorIngresado = scanner.nextInt();
		int posicionPrimera=valorIngresado / 100000;
		System.out.println("El valor de la posicion primera es: "+posicionPrimera);
		int posicionSegunda=valorIngresado % 10;
		System.out.println("El valor de la posicion segunda es: "+posicionSegunda);
		int posicionTercera=valorIngresado / 10000 % 10;
		System.out.println("El valor de la posicion tercera es: "+posicionTercera);
		int posicionCuarta=valorIngresado % 10000 / 10 % 10;
		System.out.println("El valor de la posicion tercera es: "+posicionCuarta);
		int posicionQuinta=valorIngresado % 10000 / 10 / 100;
		System.out.println("El valor de la posicion quinta es: "+posicionQuinta);
		int posicionSexta=valorIngresado  / 100 % 10;
		System.out.println("El valor de la posicion sexta es: "+posicionSexta);
		
		System.out.println("El valor en el formato es: "+posicionPrimera+posicionSegunda+posicionTercera+posicionCuarta
				+ posicionQuinta+ posicionSexta);
		

	}

}
