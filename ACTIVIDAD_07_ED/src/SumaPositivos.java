import java.util.Scanner;

public class SumaPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero para empezar por favor :");
		int n1 = sc.nextInt();
		System.out.println("Ingrese otro numero para sumar");
		int n2 = sc.nextInt();
		for( int resultado = n1+n2 ;n2>0;resultado+=n2) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Introduce otro numero para sumar");
			System.out.println("Introduce un numero negativo para mostrar el resultado final de la suma");
			n2 = sc.nextInt();
			if (n2<0) {
				System.out.println("-------------------------------------------------");
				System.out.println( "El resultado final de la suma es igual a" + " " + "-->" + " " + resultado);
				System.out.println("El bucle ha finalizado.");
				System.out.println("--------------------------------------------------");
			}
		}
	}

}
