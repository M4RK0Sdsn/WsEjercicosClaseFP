import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 1;
		System.out.println("Introduce el tamaño del array : ");
		int[] array1 = new int[sc.nextInt()];
		System.out.println("Introduce los valores del array :");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		for(int i = 0; i <array1.length; i++) {
		int mult = array1[i] * array1[i];
		System.out.println(mult);
		}
	}
}
