package com.pe.cibertec.trabajo01;

import java.util.Scanner;

public class Tarea03 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese cantidad de sobres a ordenar: ");
		
		int sobres=scanner.nextInt();
		
		int grupo50=sobres/50;
		System.out.println("La cantidad de sobres de 50 son : "+ grupo50);
		int grupo30=sobres % 50 /30;
		System.out.println("La cantidad de sobres de 30 son : "+ grupo30);
		int grupo12=sobres % 50 % 30 /12;
		int residuoIncompleto=sobres % 50 % 30 % 12; 
		int numeroAdicional=residuoIncompleto==0? 0:1;
		System.out.println("Tiene residuo? : "+ numeroAdicional);
		int sumar=grupo12+numeroAdicional;
		System.out.println("La cantidad de sobres del grupo 12 son : "+ sumar);	
		
		
		

	}

}
