package com.pe.cibertec.trabajo01;

import java.util.Scanner;

public class Tarea09 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese la hora de ingreso del motor: ");
		int horaIngresoMotor=scanner.nextInt();
		System.out.println("Ingrese la hora de salida del motor: ");
		int horaSalidaMotor=scanner.nextInt();
		
		int horaIngresoMotorHora= horaIngresoMotor / 10000;
		int horaIngresoMotorMinutos= horaIngresoMotor % 10000 / 100;
		int horaIngresoMotorSegundos=horaIngresoMotor % 100;
		
		int horaSalidaMotorHora= horaSalidaMotor / 10000;
		int horaSalidaMotorMinutos= horaSalidaMotor % 10000 / 100;
		int horaSalidaMotorSegundos=horaSalidaMotor % 100;
		
		//convertir en segundos la hora y los minutos de entrada del motor
		
		int convertirIngresoMotorHoraSegundos= horaIngresoMotorHora * 60 * 60;
		int convertirIngresoMotorMinutoSegundos=horaIngresoMotorMinutos * 60;
		int convertirIngresoMotorSegundos=horaIngresoMotorSegundos;
		
		//convertir en segundis la hora y los minutos de la salida del motor
		int convertirSalidaMotorHoraSegundos= horaSalidaMotorHora * 60 * 60;
		int convertirSalidaMotorMinutoSegundos=horaSalidaMotorMinutos * 60;
		int convertirSalidaMotorSegundos=horaSalidaMotorSegundos;
		
		int SumaTiempoEntradaMotor= convertirIngresoMotorHoraSegundos+convertirIngresoMotorMinutoSegundos+convertirIngresoMotorSegundos;
		int SumaTiempoSalidaMotor= convertirSalidaMotorHoraSegundos + convertirSalidaMotorMinutoSegundos + convertirSalidaMotorSegundos;
		
		int tiempoTrabajado=SumaTiempoSalidaMotor - SumaTiempoEntradaMotor;
		int hora= tiempoTrabajado / 3600;
		int minutos=tiempoTrabajado % 3600 /60;
		int segundos=tiempoTrabajado % 3600 % 60;
						
		System.out.println("Ingrese la hora de salida del motor: " +hora );
		System.out.println("Ingrese la hora de salida del motor: " +minutos );
		System.out.println("Ingrese la hora de salida del motor: " +segundos );

	}

}
