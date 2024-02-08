import java.util.Scanner;

public class While_Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero por favor :");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro numero mayor que el anterior de 3 cifras maximo  por favor :");
		int numero2 = sc.nextInt();
		while(  numero1<=numero2 ) {
			System.out.println(numero1);
			numero1++;
		}
	}

}
