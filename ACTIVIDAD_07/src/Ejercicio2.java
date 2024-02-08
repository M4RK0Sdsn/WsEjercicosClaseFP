import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1= 0;
		System.out.println("Introduce el tamaño del array : ");
		int[]array1 = new int[ n1=sc.nextInt()];
		System.out.println("Introduce los numeros del array");
		int suma = 0;
		for(int i = 0; i < n1; i++ ) {
			array1[i] = sc.nextInt();
			suma = suma + array1[i];
			
			
		}
		System.out.println( " La suma es igual a --> " + suma);
		int media = suma / n1;
		System.out.println( " La media es igual a --> " + media);
	}

}
	