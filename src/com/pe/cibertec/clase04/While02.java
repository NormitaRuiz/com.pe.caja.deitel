package com.pe.cibertec.clase04;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		/*
		pedir valor entero e imprimir al revez
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese el valor entero: ");
		
		int n=scanner.nextInt();
				
		while(n>0) {
			
			int digito= n % 10;
			int reverso=digito;
			//suma+=digito;
			n=n/10;
			System.out.print(reverso);
			
					
		}
		System.out.println();

	}

}
