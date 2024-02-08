import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------EJERCICIO 1-----------");
		System.out.print("Introduzca el texto que usted quiera :");
		String cadena = sc.nextLine();
		System.out.println("La longitud de la cadena es de " + cadena.length());
	}

}
