package com.pe.caja.cibertec;

import java.util.Scanner;

public class Tarea08 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese el valor con 10 caracteres: ");
		//System.out.println("Ingrese la cantidad de billetes de S/50: ");
		//System.out.println("Ingrese la cantidad de billetes de S/10: ");
		//System.out.println("Ingrese la cantidad de monedas de S/5: ");
		//System.out.println("Ingrese la cantidad de monedas de S/1: ");
		int valorIngresado=scanner.nextInt();
		int posicion1_2=valorIngresado / 100000000;		
		int valorBilletes100=posicion1_2 * 100;		
		System.out.println("El monto en soles con los billetes de 100 es: "+valorBilletes100);
		
		int posicion3_4 = valorIngresado / 1000000 % 100;
		int valorBilletes50=posicion3_4 * 50;
		System.out.println("El monto en soles con los billetes de 50 es: "+valorBilletes50);
		
		int posicion5_6 = valorIngresado % 1000000 / 10000;
		int valorMonedas10=posicion5_6 * 10;
		System.out.println("El monto en soles con las monedas de 10 es: "+valorMonedas10);
		
		int posicion7_8 = valorIngresado % 10000 / 100;
		int valorMonedas5=posicion7_8 * 5;
		System.out.println("El monto en soles con las monedas de 5 es: "+valorMonedas5);
				
		int posicion9_10 = valorIngresado % 100;
		int valorMonedas1=posicion9_10 * 1;
		System.out.println("El monto en soles con las monedas de 1 es: "+valorMonedas1);
		
		int sumaTotal= valorBilletes100+ valorBilletes50+valorMonedas10+valorMonedas5+ valorMonedas1;
		
		System.out.println("El monto tota en soles es: " + sumaTotal);
	}

}
