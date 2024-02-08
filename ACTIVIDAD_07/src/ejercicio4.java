import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el tamaño del array:");
		int n = sc.nextInt();

		int[] array = new int[n];

		System.out.println("Introduce los elementos del array:");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print("El array original es: [");
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println("]");

		for (int i = 0; i < n / 2; i++) {
			int invertidor = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = invertidor;
		}

		System.out.print("El array invertido es: [");
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println("]");
	}

}
