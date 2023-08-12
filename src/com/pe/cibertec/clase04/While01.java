package com.pe.cibertec.clase04;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		/*
		pedir valor entero e imprimir la suma de sus digitos
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese el valor entero: ");
		
		int n=scanner.nextInt();
		int suma=0;
		
		while(n>0) {
			
			int digito= n % 10;
			suma=suma+digito;
			//suma+=digito;
			n=n/10;
			
			
					
		}
		System.out.println("La suma de los digitos es: "+suma);

	}

}
