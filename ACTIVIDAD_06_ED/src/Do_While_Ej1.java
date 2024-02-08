import java.util.Scanner;

public class Do_While_Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero que quiera multiplicar");
		
		int n = 0;
		int i = sc.nextInt();
 do {
	 n++;
		System.out.println("La tabla de multiplicar del " + i + " es igual a : " + i + " X " + n + " = " + (i * n));
} while (n >=0 && n <10);
 
	}

}
