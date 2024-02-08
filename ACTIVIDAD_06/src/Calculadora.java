
public class Calculadora {

	public static void main(String[] args) {
	 calculoSuma(45, 24);
	 calculoSuma(22.5, 20.94);
	 calculoResta(10, 5);
	 calculoResta(45.5, 22.2);
	 calculoMultiplicacion(5, 9);
	 calculoMultiplicacion(10.5, 20.15);
	 calculoDivision(52, 4);
	 calculoDivision(50.5, 5.5);
	}
	public static void calculoSuma(int n1, int n2) {
		 double suma = n1 + n2;
		 System.out.println("La suma de los 2 numeros es igual a :" + suma);
	}
	public static void calculoSuma(double d1, double d2) {
		double suma = d1 + d2;
		System.out.println("La suma de los 2 numeros es igual a" + suma);
	}
	public static void calculoResta(int n1, int n2) {
		 double resta = n1 - n2;
		 System.out.println("La resta de los 2 numeros es igual a :" + resta);
	}
	public static void calculoResta(double d1, double d2) {
		 double resta = d1 - d2;
		 System.out.println("La resta de los 2 numeros es igual a :" + resta);
	}
	public static void calculoMultiplicacion(int n1, int n2) {
		 double multiplicacion = n1 * n2;
		 System.out.println("La multiplicacion de los 2 numeros es igual a :" + multiplicacion);
	}
	public static void calculoMultiplicacion(double d1, double d2) {
		 double multiplicacion = d1 * d2;
		 System.out.println("La multiplicacion de los 2 numeros es igual a :" + multiplicacion);
	}
	public static void calculoDivision(int n1, int n2) {
		 double division = n1 / n2;
		 System.out.println("La division de los 2 numeros es igual a :" + division);
	}
	public static void calculoDivision(double d1, double d2) {
		 double division = d1 / d2;
		 System.out.println("La division de los 2 numeros es igual a :" + division);
	}
	

}
