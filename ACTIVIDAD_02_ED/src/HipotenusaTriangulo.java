import java.util.Scanner;

public class HipotenusaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce uno de los catetos del triangulo:");
		double cateto1 = sc.nextDouble();
		System.out.println("Ahora introduce el segundo cateto:");
		double cateto2 = sc.nextDouble();
		double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
		System.out.println("La hipotenusa del triangulo rectangulo es de:" + hipotenusa + "cm");

	}

}
