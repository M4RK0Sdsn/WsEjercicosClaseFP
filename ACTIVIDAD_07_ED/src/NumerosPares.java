import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero cualquiera :");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro numero mayor que el anterior  :");
		int n2 = sc.nextInt();
		while (n1<n2) {
			n1++;
			if (n1 % 2 == 0) {
				System.out.println(n1);
			}
		}
	}

}
