import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para saber si es primo o no ;");
		int n1 = sc.nextInt();
		while (n1>=0) {
			if (n1%2==0 && n1!=2 || n1%3==0 && n1!=3 || n1%5==0 && n1!=5) {
				System.out.println("-----------------------------------------------");
				System.out.println("El numero -NO- es primo");
				System.out.println("Introduce otro numero para saber si es primo o no ;");
				System.out.println("-----------------------------------------------");
				n1 = sc.nextInt();
			}else {
				System.out.println("-----------------------------------------------");
				System.out.println("El numero -SI- es primo");
				System.out.println("Introduce otro numero para saber si es primo o no ;");
				System.out.println("-----------------------------------------------");
				n1 = sc.nextInt();
			}
		}
	}

}
