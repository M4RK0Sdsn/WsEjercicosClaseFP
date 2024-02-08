import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumador = 0;
		int pares = 0;
		int impares = 0;
		System.out.println("Introduce el tamaño del array:");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.println("Introduce los elementos del array :");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			

		}
		System.out.println("Hay " + pares + " Numeros pares");
		System.out.println("Y " + impares + " Numeros impares");
	}
}