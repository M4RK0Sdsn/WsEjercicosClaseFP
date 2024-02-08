import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una cadena: ");
		String cadena = sc.nextLine();
		System.out.print("Ingresa un carácter para contar: ");
		char caracterContar = sc.next().charAt(0);
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracterContar) {
				contador++;
			}
		}

		System.out.println("El carácter '" + caracterContar + "' aparece " + contador + " veces en la cadena.");

	}
}