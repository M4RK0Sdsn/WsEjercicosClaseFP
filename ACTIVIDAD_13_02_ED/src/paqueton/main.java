package paqueton;

import java.util.Scanner;


import paqueton2.Matematicas;



public class main {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion = 0;
		
		
		
		do {
			System.out.println("1.SUMA");
			System.out.println("2.RESTA");
			System.out.println("3.MULTIPLICACION");
			System.out.println("4.DIVISION");
			System.out.println("5.SALIR DEL PROGRAMA");
			opcion = sc.nextInt();
			operacion(opcion);
		} while (opcion != 5);
		
	}
	
		public static void operacion(int opcion) {
			switch(opcion) {
			case 1:
				
				System.out.println("Introduce los 2 numeros con los que quieras operar :");
				double numero1 = sc.nextDouble();
				double numero2 = sc.nextDouble();
				double suma = Matematicas.suma(numero1, numero2);
				System.out.println(suma);
				break;
			case 2:
				System.out.println("Introduce los 2 numeros con los que quieras operar :");
				numero1 = sc.nextDouble();
				numero2 = sc.nextDouble();
				double resta = Matematicas.resta(numero1, numero2);
				System.out.println(resta);
				break;
			case 3:
				System.out.println("Introduce los 2 numeros con los que quieras operar :");
				numero1 = sc.nextDouble();
				numero2 = sc.nextDouble();
				double multiplicacion = Matematicas.multiplicacion(numero1, numero2);
				System.out.println(multiplicacion);
				break;
			case 4:
				System.out.println("Introduce los 2 numeros con los que quieras operar :");
				numero1 = sc.nextDouble();
				numero2 = sc.nextDouble();
				double division = Matematicas.division(numero1, numero2);
				System.out.println(division);
				break;
			case 5:
				System.out.println("MUÑON SALIENDO...");
				break;
			default :
				System.out.println("Opcion no valida, elige otro numero : ");
			
			
			}
		}
		
		

	}


