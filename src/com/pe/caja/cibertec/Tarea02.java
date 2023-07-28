package com.pe.caja.cibertec;

import java.util.Scanner;

public class Tarea02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long grupo1;
		long grupo2;
		long grupo3;		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un numero entero de 15 digitos");
		
		long numero=scanner.nextLong();
		
		grupo1=numero/10000000000l;		
		System.out.println("el grupo1 es: "+ grupo1);
		grupo2=numero%10000000000l/100000;
		System.out.println("el grupo1 es: "+ grupo2);
		grupo3=numero%10000000000l%100000;
		System.out.println("el grupo1 es: "+ grupo3);
		
		long suma=grupo1+grupo2+grupo3;
		System.out.println("El resultado de la suma es : "+ suma);

	}

}
