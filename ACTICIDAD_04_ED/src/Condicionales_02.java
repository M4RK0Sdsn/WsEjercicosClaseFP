import java.util.Scanner;

public class Condicionales_02 {

	public static void main(String[] args) {
		ej1(5, 10);

	}
	Scanner sc = new Scanner(System.in);
	public static void ej1(int n1, int n2) {
		String cadena2 = (n1==n2) ? "El numero 1 es igual que el numero 2" : "El numero1 es diferente al numero 2";
		String cadena = (n1>n2) ? "El numero 1 es mayor  que el numero 2" : "El numero 2 es mayor que el numero 1";
		System.out.println(cadena2);
		System.out.println(cadena);
		System.out.println("-------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero del 1 al 100 para saber si su examen esta aprobado o no");
		double n3 = sc.nextDouble();
		String cadena3 = (n3<50) ? "El examen esta suspenso" : "El examen esta aprobado";
		System.out.println("-----------------------------------------------------------");
		System.out.println(cadena3);
		System.out.println("------------------------------------------------------------");
		System.out.println("CALCULADORA MASTER");
		System.out.println("------------------------------------------------------------");
		System.out.println("Introduce el primer numero con el que quieras operar");
		int n4 = sc.nextInt();
		System.out.println("Introduce el segundo numero con el que quieras operar ");
		int n5 = sc.nextInt();
		System.out.println("-----------------------------------------------------------");
		System.out.println("Pulsa el numero 1 para sumar");
		System.out.println("Pulsa el numero 2 para restar");
		System.out.println("Pulsa el numero 3 para multiplicar");
		System.out.println("Pulsa el numero 4 para dividir");
		System.out.println("Pulsa el numero 5 para hallar el resto de la division");
		System.out.println("-------------------------------------------------------");
		int numeroCalculo = sc.nextInt();
		switch (numeroCalculo) {
		case 1:
			int resultado = n4 + n5;
			System.out.println(resultado);

			break;
		case 2:
			int resultado2 = n4 - n5;
			System.out.println(resultado2);
			break;
		case 3:
			int resultado3 = n4 * n5;
			System.out.println(resultado3);
			break;
		case 4:
			int resultado4 = n4 / n5;
			System.out.println(resultado4);
			break;
		case 5 :
			int resultado5 = n4 % n5;
			System.out.println(resultado5);
			default:
			break;
			 
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Introduzca el numero que usted quiera para saber si es par o impar :");
		int n6 = sc.nextInt();
		int incognita = n6%2;
		switch (incognita) {
		case 0 :
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("El numero elegido es par");
			break;
		case 1 :
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("El numero elegido es impar");

		default:
			break;
		}

		

		
		
	}
	

	



}
