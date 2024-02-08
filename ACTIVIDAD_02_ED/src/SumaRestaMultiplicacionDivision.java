import java.util.Scanner;

public class SumaRestaMultiplicacionDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce uno de los valores con los que quieras operar:");
		double valor1 = sc.nextDouble();
		System.out.println("Ahora introduce el segundo valor con el que quieras operar:");
		double valor2 = sc.nextDouble();
		double suma = valor1 + valor2;
		double resta = valor1 - valor2;
		double multiplicacion = valor1 * valor2;
		double division = valor1 / valor2;
		System.out.println("La suma de dichos valores es igual a :" + suma);
		System.out.println("La resta de dichos valores es igual a :" + resta);
		System.out.println("La multiplicacion de dichos valores es igual a :" + multiplicacion);
		System.out.println("La division de dichos valores es igual a :" + division);
		
	}

}
