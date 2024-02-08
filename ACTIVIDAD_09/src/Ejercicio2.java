import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------EJERCICIO 2-------------");
			System.out.println("Introduzca el texto que usted desee");
			String cadena = sc.nextLine();
			System.out.println("Este texto esta en mayusculas : " + cadena.toUpperCase());
			System.out.println("Este texto esta en minusculas : " + cadena.toLowerCase());


	}

}
