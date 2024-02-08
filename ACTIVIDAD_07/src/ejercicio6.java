import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------ARRAY DE 5 NUMEROS ENTEROS-------");
		int[] array = {1,2,3,4,5};
		System.out.print("Ingrese un numero entero para saber si se encuentra o no en el array : ");
       int n = sc.nextInt();
      while (n>=0) {
		if (n == array[0]) {
			System.out.println("---------------------------------");
			System.out.println("El numero " + n + " se encuentra en el array");
			System.out.print("Ingrese otro numero por favor :");
			n = sc.nextInt();
			System.out.println("---------------------------------");
		}else if (n == array[1]) {
			System.out.println("---------------------------------");
			System.out.println("El numero " + n + " se encuentra en el array");
			System.out.print("Ingrese otro numero por favor :");
			n = sc.nextInt();
			System.out.println("---------------------------------");
		}else if (n == array[2]) {
			System.out.println("---------------------------------");
			System.out.println("El numero " + n + " se encuentra en el array");
			System.out.print("Ingrese otro numero por favor :");
			n = sc.nextInt();
			System.out.println("---------------------------------");
		}else if (n == array[3]) {
			System.out.println("---------------------------------");
			System.out.println("El numero " + n + " se encuentra en el array");
			System.out.print("Ingrese otro numero por favor :");
			n = sc.nextInt();
			System.out.println("---------------------------------");
		}else if (n == array[4]) {
			System.out.println("---------------------------------");
			System.out.println("El numero " + n + " se encuentra en el array");
			System.out.print("Ingrese otro numero por favor :");
			n = sc.nextInt();
			System.out.println("---------------------------------");
		}else {
			System.out.println("---------------------------------");
			System.out.println("El numero " + n + " NO se encuentra en el array");
			System.out.print("Ingrese otro numero por favor :");
			n = sc.nextInt();
		}
	}
		
	}
}