package com.pe.cibertec.trabajo01;

import java.util.Scanner;

public class Tarea05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor 1 con 5 digitos: ");
		int valor1 = scanner.nextInt();	
		int diago1Valor1=valor1 / 10000;
		System.out.println("El valor del inicio de la diagonal primera es: "+diago1Valor1);
		int ultimaPosicion=valor1 % 10000 % 1000 % 100 % 10;
		System.out.println("El valor de la ultima diagonal es: "+ultimaPosicion);
				
		System.out.println("Ingrese el valor 2 con 5 digitos: ");
		int valor2 = scanner.nextInt();	
		int diago1Valor2=valor2 / 1000 % 10;
		System.out.println("El valor de la posicion segunda de la diagonal primera es: "+diago1Valor2);
		int penultimaPosicion=valor2 % 1000 % 100 /10;				
		System.out.println("El valor de la penultima diagonal es: "+penultimaPosicion);
		
		
		System.out.println("Ingrese el valor 3 con 5 digitos: ");
		int valor3 = scanner.nextInt();	
		int diagoValor3=valor3 % 1000 / 100; 
		System.out.println("El valor de la posicion tercera de la diagonal primera es: "+diagoValor3);
		int posicionMedio= valor3 % 1000 /100 ;
		System.out.println("El valor del digito medio es: "+posicionMedio);
		
		System.out.println("Ingrese el valor 4 con 5 digitos: ");
		int valor4 = scanner.nextInt();
		int diagoValor4=valor4 % 100 / 10;
		System.out.println("El valor de la posicion cuarta de la diagonal primera es: "+diagoValor4);
		int despuesMedio= valor4 / 1000 % 10;
		System.out.println("El valor del digito despues del medio es: " + despuesMedio);
		
		
		System.out.println("Ingrese el valor 5 con 5 digitos: ");
		int valor5 = scanner.nextInt();
		int diagoValor5= valor5 % 10;
		System.out.println("El valor de la posicion quinta de la diagonal primera es: "+diagoValor5);
		int primero= valor5 / 10000;
		System.out.println("El valor del primer digito es : " + primero);
		
		
		int sumaDiagonalUno=diago1Valor1+diago1Valor2+diagoValor3+diagoValor4+diagoValor5;
		System.out.println("Suma Diagonal uno es : " + sumaDiagonalUno);
		
		int sumaDiagonalDos=ultimaPosicion+penultimaPosicion+posicionMedio+despuesMedio+primero;
		System.out.println("Suma del diagonal dos es : " + sumaDiagonalDos);
		
		int productoDiagonales=sumaDiagonalUno*sumaDiagonalDos;
		System.out.println("Cantidad de tanques disponibles es : " +productoDiagonales );
	

	}

}
