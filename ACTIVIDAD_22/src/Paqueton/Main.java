package Paqueton;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 1;

		do {
			System.out.println("1 : Da de alta un empleado");
			System.out.println("2 : Mostrar empleados");
			System.out.println("3 : Calcular salario empleado");
			System.out.println("4 : Calcular costes totales de empresa");
			System.out.println("5 : Salir del programa");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				Empleado e1 = new Empleado();
				System.out.println();
				e1.setNombre(sc.next());
				break;
			}
		} while (opcion > 0 && opcion <= 4);

	}

}
