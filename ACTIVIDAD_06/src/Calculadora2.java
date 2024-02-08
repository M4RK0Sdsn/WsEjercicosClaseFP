import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
		pedirDatos();
	}

	public static void pedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los 2 valores con los que quieres calcular :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		suma(n1, n2);
		resta(n1, n2);
		multiplicacion(n1, n2);
		division(n1, n2);
	}
	public static void suma(double num1, double num2) {
		double suma = num1 + num2;
		System.out.println("El resultado de la suma es igual a ." + suma);
	}
	public static void resta(double num1, double num2) {
		double resta = num1 - num2;
		System.out.println("El resultado de la resta es igual a ." + resta);
	}
	public static void multiplicacion(double num1, double num2) {
		double multiplicacion = num1 * num2;
		System.out.println("El resultado de la multiplicacion es igual a ." + multiplicacion);
	}
	public static void division(double num1, double num2) {
		double division = num1 / num2;
		System.out.println("El resultado de la division es igual a ." + division);
	}
	

}
