import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array : ");
		int[] array1 = new int[sc.nextInt()];
		System.out.println("Introduce los valores del array :");
		for(int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
			if (array1[i] > n1) {
				n1 = array1[i];
				
			}
			
		}
		System.out.println("El numero mas grande del array ingresado es el -->" + n1);
		
	}
}