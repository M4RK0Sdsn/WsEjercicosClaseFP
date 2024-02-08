import java.util.Iterator;
import java.util.Scanner;

public class JuegoNumeroMayor {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("----------QUE NUMERO ES MAYOR--------------");
		System.out.println("Introduce un numero positivo : ");
		n1 = sc.nextInt();
		System.out.println("Introduce otro numero positivo");
		 n2 = sc.nextInt();
		while(n1>=0 && n2>=0) {
			if (n1 > n2) {
				System.out.println("Introduce otro numero : ");
				n2 = sc.nextInt();
			}else if (n2 > n1) {
				System.out.println("Introduce otro numero : ");
				n1 = sc.nextInt();

			}else {
				System.out.println("Introduce otro numero : ");
				n1 = sc.nextInt();

			}
		}
		if (n1 > n2) {
			System.out.println("El numero mas grande es --> " + n1);
		}
		if (n1 < n2) {
			System.out.println("El numero mas grande es --> " + n2);
		}
		
	}

}
