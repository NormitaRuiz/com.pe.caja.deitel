package EjerciciosClase01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de dinero en soles: ");
		int dinero=scanner.nextInt();
		int moneda5=dinero / 5;
		System.out.println("La cantidad de monedas de 5 es: " + moneda5);
		int moneda2=dinero % 5 / 2;
		System.out.println("La cantidad de monedas de 2 es: " +moneda2 );
		int moneda1=dinero % 5 % 2 ;
		System.out.println("La cantidad de monedas de 1 es:" +moneda1 );
		
		System.out.printf("La cantidad de monedas de 5 es:  %d de 2 es: %d de 1 sol es: %d " , moneda5, moneda2, moneda1  );
		
		
	}

}
