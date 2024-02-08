import java.util.Scanner;

public class Do_While_Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero del cual quieras hacer el factorial : ");
		int numero1 = sc.nextInt();
		int numero2 = 1;
		int mult = 1;

		do {
			mult = numero2*=numero1;
			numero1--;
			System.out.println(mult);
		} while (numero1<=1000 && numero1 > 1);
	}

}
