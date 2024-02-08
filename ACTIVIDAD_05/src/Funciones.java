
public class Funciones {

	public static void main(String[] args) {
		System.out.println("Funciones");
		System.out.println("----------------------");
		pantalla();
		pantalla();
		pantalla();
		System.out.println("----------------------");
		ej2(5, 6);
		ej2(5, 8);
		System.out.println("----------------------------------------------------------");
		double perimetro = ej3(7.5, 10.5);
		System.out.println("El perimetro del segundo rectangulo es:" + perimetro + "cm");
		double perimetrob = ej3(10.5, 14.5);
		System.out.println("El perimetro del segundo rectangulo es:" + perimetrob + "cm");
		System.out.println("-----------------------------------------------------------");
		double area = ej4(9.5, 18.5);
		System.out.println("El area del rectangulo es igaul a:" + area + "cm");
		double areab = ej4(15, 22);
		System.out.println("El area del rectangulo es igaul a:" + areab + "cm");
		System.out.println("--------------------------------------------------");
		double hipotenusa = ej5(7, 10);
		System.out.println("La hipotenusa es igual a :" + hipotenusa + "cm");
		double hipotenusab = ej5(5, 2);
		System.out.println("La hipotenusa es igual a :" + hipotenusab + "cm");
		System.out.println("------------------------------------------------");
		int suma = ej6suma(5, 7);
		System.out.println("La suma de los dos numero es igual a :" + suma);
		int suma2 = ej6suma(9, 57);
		System.out.println("La suma de los dos numero es igual a :" + suma2);
		System.out.println("--------------------------------------------------");
		int resta = ej6resta(15, 5);
		System.out.println("La resta de los dos numeros es igual a :" + resta);
		int resta2 = ej6resta(78, 56);
		System.out.println("La resta de los dos numeros es igual a :" + resta2);
		System.out.println("---------------------------------------------------");
		int multiplicacion = ej6multiplicacion(6, 9);
		System.out.println("La multiplicacion de los dos numeros es igual a :" + multiplicacion);
		int multiplicacion2 = ej6multiplicacion(9, 23);
		System.out.println("La multiplicacion de los dos numeros es igual a :" + multiplicacion2);
		System.out.println("-------------------------------------------------------------------");
		int division = ej6division(90, 30);
		System.out.println("La division de los dos numeros es igual a :" + division);
		int division2 = ej6division(26, 2);
		System.out.println("La division de los dos numeros es igual a :" + division2);
		System.out.println("---------------------------------------------------------");
		ej7(5, 7, 9);
		ej7(3, 6, 9);
		System.out.println("---------------------------------------------------------");
		double mediatotal = ej8(7, 8, 6);
		System.out.println("La nota final del alumno es igual a :" + mediatotal);
		double mediatotal2 = ej8(8, 6, 9);
		System.out.println("La nota final del alumno es igual a :" + mediatotal2);
		System.out.println("-----------------------------------------------------");
		ej9(1500, 5, 20);
		ej9(1200, 15, 40);

	}

	public static void pantalla() {
		System.out.println("1.Entrar en la aplicación");
		System.out.println("2.Registrarse en la aplicación");
		System.out.println("3.Salir del programa");
	}

	public static void ej2(int altura, int base) {

		int perimetro = 2 * (base + altura);
		System.out.println("El perimetro del rectangulo es :" + perimetro);

	}

	public static double ej3(double altura, double base) {
		double perimetro = 2 * (altura + base);
		return perimetro;

	}

	public static double ej4(double altura, double base) {
		double area = base * altura;
		return area;

	}

	public static double ej5(double cateto1, double cateto2) {
		double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
		return hipotenusa;

	}

	public static int ej6suma(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}

	public static int ej6resta(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
	}

	public static int ej6multiplicacion(int numero1, int numero2) {
		int multiplicacion = numero1 * numero2;
		return multiplicacion;
	}

	public static int ej6division(int numero1, int numero2) {
		int division = numero1 / numero2;
		return division;
	}

	public static void ej7(int numero1, int numero2, int numero3) {
		int media = (numero1 + numero2 + numero3) / 3;
		System.out.println("La media obtenida de los 3 numero es igual a :" + media);
	}

	public static double ej8(double nota1, double nota2, double nota3) {
		double medianota1 = (55 * nota1) / 100;
		double medianota2 = (30 * nota2) / 100;
		double medianota3 = (15 * nota3) / 100;
		double mediatotal = (medianota1 + medianota2 + medianota3);
		return mediatotal;

	}

	public static void ej9(long sueldo, int extra, int extrasueldo) {
		long sueldototal = sueldo + (extra * extrasueldo);
		System.out.println("El salario total del trabajador es igual a :" + sueldototal);
	}
}
