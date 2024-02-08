import java.util.Scanner;

public class BucleFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los 2 numeros que quieras");
		int numerox = sc.nextInt();
		int numeroy = sc.nextInt();
		ej901(numerox, numeroy);
		System.out.println("-------------------------------------");
		System.out.println("Elige el numero para ver su tabla de multiplicar :");
		int numeroz = sc.nextInt();
		ej902(numeroz);
		System.out.println("Introduzca el numero para hacer la factorial de este");
		int numeroj = sc.nextInt();
		ej903(numeroj);

		System.out.println("--------------------------");
		System.out.println("EJERCICIO BUCLE FOR");
		System.out.println("---------------------");
		int n1 = 0;
		for (n1 = 1; n1 <= 10; n1++) {
			System.out.println("Esta es la" + " " + n1 + "º" + " " + "vez que imprimo esto");
		}
		for (n1 = 2; n1 <= 20; n1 += 2) {
			System.out.println("Los numeros pares del 2 al 20 son :" + n1);
		}
		System.out.println("Introduzca los 2 numeros extremos que quieras");
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		for (n1 = n2; n1 <= n3; n1++) {
			System.out.println("---------------------");
			System.out.println(n1);
			System.out.println("---------------------");
		}
		int suma = 0;
		for (n1 = 0; n1 <= 100; n1++) {
			suma += n1;
			System.out.println(suma);
		}
		System.out.println("Introduzca el numero cuya tabla de multiplicar quiera saber usted :");
		int n4 = sc.nextInt();
		for (n1 = 1; n1 <= 10; n1++) {
			int multiplicacion = n4 * n1;
			System.out.println("-------------------------------");
			System.out.println(n4 + "*" + n1 + "=" + multiplicacion);

		}
		System.out.println("--------------------------------------------");
		System.out.println("Los numeros del 1 al 10 en orden descendente son :");
		for (n1 = 10; n1 >= 1; n1--) {
			System.out.println(n1);
			System.out.println("------------------------------------------");

		}

		System.out.println("---------------------------------------------");
		System.out.println("Introduzca un numero cuya factorial quiera calcular");
		int n5 = sc.nextInt();
		int n = 1;
		int mult = 1;
		for (n1 = n5; n5 >= 1; n5--) {
			mult = n *= n5;

		}
		System.out.println("---------------------------------------------");
		System.out.println(mult);
		System.out.println("--------------------------------------------");
		suma = 0;
		for (n1 = 2; n1 <= 50; n1 += 2) {
			suma += n1;
			System.out.println(suma);
		}
		System.out.println("----------------------");
		int nx = 1;
		for(n1 = 1; n1<=30; n1+=2) {
			System.out.println(n1);
		System.out.println("----------------------");
		}
		System.out.println("Calculo de potenica");
		System.out.println("------------------");
		System.out.println("Introduce el numero para hacer la potencia");
		int base = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Introduce las veces que quieres multiplicarlo para la potencia");
		int exponente = sc.nextInt();
		int potencia = 1;
		System.out.println("----------------------------------");
		for(int i = 0; i < exponente;i++) {
			potencia *=base;
			System.out.println(potencia);
			System.out.println("------------");
			
			
		}
			
	}

	public static int ej901(int n2, int n3) {
		int n1 = 0;
		for (n1 = n2; n1 <= n3; n1++) {
			System.out.println("---------------------");
			System.out.println(n1);
			System.out.println("---------------------");

		}
		return n1;
	}

	public static int ej902(int n4) {
		int n2 = 0;
		for (n2 = 1; n2 <= 10; n2++) {
			int multiplicacion = n4 * n2;
			System.out.println(multiplicacion);

		}
		return n2;
	}

	public static int ej903(int n5) {
		int n = 1;
		int n1 = 1;
		int mult = 1;
		for (n1 = n5; n5 >= 1; n5--) {
			mult = n *= n5;
			System.out.println(mult);
			
			
			

		}
		return mult;

	}
		}
