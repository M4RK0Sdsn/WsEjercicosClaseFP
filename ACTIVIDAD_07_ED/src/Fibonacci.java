import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int F0 = 0;
		int F1 = 1;
		System.out.println("Introduce el numero N para realizar el teorema de Fibonacci : ");
		int N = sc.nextInt();
		System.out.println(F0);
		for(int i = 1; i < N;i++) {
			int suma = F0 + F1;
			F0 = F1;
			F1 = suma;
			System.out.println(suma);
		}


	}

}
