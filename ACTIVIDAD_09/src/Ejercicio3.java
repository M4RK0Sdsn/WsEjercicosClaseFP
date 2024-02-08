import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------EJERCICIO 3--------------");
		System.out.print("Introduzca un texto y dos indices a cada extremo : ");
		String cadena = sc.nextLine();
		System.out.print("Introduce el primer indice :");
		int n1 = sc.nextInt();
		System.out.print("Introduce el segundo indice :");
		int n2 = sc.nextInt();
		System.out.println(cadena.substring(n1, n2+1));
	}

}
