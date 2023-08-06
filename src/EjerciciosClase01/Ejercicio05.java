package EjerciciosClase01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la hora de entrada en formato HHMMSS: ");
		
		int valor=scanner.nextInt();
		int horaIngresoHH=valor / 10000;
		int horaIngresoMM=valor % 10000 / 100;
		int horaIngresoSS= valor % 100;
		
		
		System.out.println("Las horas son: " + horaIngresoHH  );
		
		System.out.println("Los minutos son: " + horaIngresoMM  );
		
		System.out.println("Los segundos son:  " + horaIngresoSS  );
			
		int horaTotalIngresoSegundos= horaIngresoHH * 3600 + horaIngresoMM * 60 + horaIngresoSS;
		System.out.println("El total en segundos es: " +horaTotalIngresoSegundos );
		
		///hora de salida
		System.out.println("Ingrese la hora de salida en formato HHMMSS: ");
		int valor2=scanner.nextInt();
		int horaSalidaHH=valor2 / 10000;
		int horaSalidaMM=valor2 % 10000 / 100;
		int horaSalidaSS= valor2 % 100;
		
		
		System.out.println("La hora es:  " + horaSalidaHH);
		
		System.out.println("Los minutos son:  " + horaSalidaMM);
		
		System.out.println("Los segundos son: " + horaSalidaSS);
			
		int horaTotalSalidaSegundos= horaSalidaHH * 3600 + horaSalidaMM * 60 + horaSalidaSS;
		System.out.println("El total en segundos es: " +horaTotalSalidaSegundos );
		
		int diferencia=horaTotalSalidaSegundos - horaTotalIngresoSegundos ;
		System.out.println("El total de la diferencia en segundos es: " +diferencia );
		
		int HoraFinal = diferencia / 3600;
		int minutosFinal= diferencia % 3600 / 60;
		int segundosFinal=diferencia % 60;
		
		System.out.println("Las horas finales son: " +HoraFinal );
		System.out.println("Los minutos finales son: " +minutosFinal );
		System.out.println("Los segundos finales son: " +segundosFinal );
		
	}

}
