import java.util.Random;
import java.util.Scanner;

public class AdivinarElNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int valorDado = r.nextInt(10)+1;
		System.out.println("------------------ADIVINA EL NUMERO-------------------------");
		System.out.println("Introduce un numero para intentar adivinar el numero aleatorio del 1 al 10 :");
		int n1 = sc.nextInt();
		do {
			if (n1>valorDado) {
				System.out.println("Muy alto");
				System.out.println("Vuelve a introducir otro numero");
				n1 = sc.nextInt();
			}
			if (n1<valorDado) {
				System.out.println("muy bajo");
				System.out.println("Vuelve a introducir otro numero");
				n1 = sc.nextInt();
			}
		} while (n1!=valorDado);
		if (n1==valorDado) {
			System.out.println("CORRECTO");
			System.out.println("El numero era el :" + valorDado);
		}
	}

}
