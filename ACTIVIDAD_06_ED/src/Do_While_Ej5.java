import java.util.Scanner;

public class Do_While_Ej5 {

	public static void main(String[] args) {
		System.out.println("POTENCIA");
		System.out.println("----------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base :");
		int base = sc.nextInt();
		System.out.println("Introduzca el exponente :");
		int exponente = sc.nextInt();
		int potencia = 1;
		int i = 0;
		do {
			potencia *= base;
			i++;
			System.out.println(potencia);
		} while (exponente>i);
	}

}
