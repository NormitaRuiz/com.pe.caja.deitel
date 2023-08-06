package EjerciciosClase01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad en segundos: ");
		int valorEntrada=scanner.nextInt();
		int HH=valorEntrada / 3600;
		System.out.println("La horas son: " + HH);
		int MM=valorEntrada % 3600 / 60;
		System.out.println("Los minutos son: " +MM );
		int SS=valorEntrada % 3600 % 60 ;
		System.out.println("Los segundos son: " +SS );
		int tiempo= HH+MM+SS;
		System.out.printf("Hay %d horas %d minutos y %d segundos  " , HH, MM, SS  );
		
		
	}

}
