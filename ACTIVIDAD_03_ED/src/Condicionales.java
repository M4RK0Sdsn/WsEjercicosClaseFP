import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		condicional(5, 4);
		ej2(5);
	}
	
	public static void condicional (int n1, int n2) {
		System.out.println("------------------------------------");
		if (n1 > n2) {
		System.out.println("El numero 1 es mayor que el numero 2");
		}else if (n1==n2){
		System.out.println("El numero 1 es igual que el numero 2");
		}else  {
		System.out.println("el numero 1 es menor que el numero 2");
			
		}
		
		
	} 
	
	public static void ej2(int n1) {
		System.out.println("------------------------------");
		if (n1==1) {
			System.out.println("El dia de la semana es lunes");
		}else if (n1==2){
			System.out.println("El dia de la semana es martes");
		}
		if (n1==3) {
			System.out.println("El dia de la semana es miercoles");
		}else if (n1==4) {
			System.out.println("El dia de la semana es jueves");
		}
		if (n1==5) {
			System.out.println("El dia de la semana es viernes");
		}else if (n1==6) {
			System.out.println("El dia de la semana es sabado");
		}
		if (n1==7) {
			System.out.println("El dia de la semana es domingo");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Introduzca un numero del 1-100");
		int numero = sc.nextInt();
		if (numero <50) {
			System.out.println("El examen esta suspenso");
		}else  {
			System.out.println("El examen esta aprobado");
		}
		System.out.println("----------------------------");
		System.out.println("Introduzca una edad");
		int edad = sc.nextInt();
		if (edad >13 & edad<18) {
			System.out.println("Se trata de un adolescente");
		}else if (edad>20 & edad<64) {
			System.out.println("Se trata de un adulto");
		}else if (edad > 64) {
			System.out.println("Se trata de un mayor de edad");
		}else if (edad<13) {
			System.out.println("Se trata de un niño");
		}
		System.out.println("----------------------------------");
		System.out.println("Introduzca el primer numero con el que quiera operar:");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero con el que quiera operar:");
		int numero2 = sc.nextInt();
		System.out.println("Pulsa 1 para SUMAR");
		System.out.println("Pulsa 2 para RESTAR");
		System.out.println("Pulsa 3 para MULTIPLICAR");
		System.out.println("Pulsa 4 para DIVIDIR");
		System.out.println("Pulsa 5 para HALLAR EL RESTO DE LA DIVISION");
		int numeroCalculo = sc.nextInt();
		if (numeroCalculo == 1) {
			int resultado = numero1 + numero2;
			System.out.println("El resultado es igual a :" + resultado);

		}else if (numeroCalculo == 2) {
			int resultado = numero1 - numero2;
			System.out.println("El resultado es igual a :" + resultado);

		}else if (numeroCalculo == 3) {
			int resultado = numero1 * numero2;
			System.out.println("El resultado es igual a :" + resultado);

		}else if (numeroCalculo == 4) {
			int resultado = numero1 / numero2;
			System.out.println("El resultado es igual a :" + resultado);

		}else if (numeroCalculo == 5) {
			int resultado = numero1 % numero2;
			System.out.println("El resultado es igual a :" + resultado);
		}
		System.out.println("-------------------------------------------");
		System.out.println("introduzca el numero que usted desee para saber si es par o impar:");
		int numerox = sc.nextInt();
		if (numerox%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		System.out.println("--------------------------");
		System.out.println("Por favor, introduzca el precio total de su compra para saber el descuento aplicado:");
		int precio = sc.nextInt();
		if (precio >100) {
			System.out.println("El descuento sera del 10%");
			int rebaja = (precio * 10) / 100;
			int rebajafinal = precio - rebaja;
			System.out.println(" Y el precio final sera de :" + rebajafinal + " " + "€");
		}else if (precio>50 & precio<100) {
			System.out.println("El descuento sera del 5%");
			int rebaja = (precio * 5) / 100;
			int rebajafinal = precio - rebaja;
			System.out.println(" Y el precio final sera de :" + rebajafinal + " " + "€");
		}else {
			System.out.println("No habra descuento");
		}

	
	}
	
	

	}
