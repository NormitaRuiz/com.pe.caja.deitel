package EjerciciosClase01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor ingresar la nota 1");
		int entradaNota1=scanner.nextInt();
		System.out.println("Por favor ingresar la nota 2");
		int entradaNota2=scanner.nextInt();
		System.out.println("Por favor ingresar la nota 3");
		int entradaNota3=scanner.nextInt();
		
		int promedio= entradaNota1 + entradaNota2+entradaNota3;
		System.out.println("Que imprima el promedio"+promedio);
	}

}
