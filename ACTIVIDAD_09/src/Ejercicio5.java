import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------EJERCICIO 5---------");
		System.out.println("Introduzca un texto : ");
		String cadena = sc.next();
		System.out.println("Introduzca el caracter de su texto que quiera reemplazar : ");
		String remplazada = sc.next();
		System.out.println("Introduzca el caracter por el que quiere reemplazarlo :");
		String remplazador = sc.next();
		System.out.println(cadena.replace(remplazada, remplazador));
		
	}

}
