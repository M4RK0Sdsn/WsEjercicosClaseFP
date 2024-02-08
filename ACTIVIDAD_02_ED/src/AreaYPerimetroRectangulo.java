import java.util.Scanner;

public class AreaYPerimetroRectangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la base del rectangulo:");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura del rectangulo:");
		double altura = sc.nextDouble();
		double area = base * altura;
		System.out.println("El area del rectangulo es de :"+ area+ "cm");
		double perimetro = 2 * (base + altura);
		System.out.println("Y el perimetro del rectangulo es de :"+ perimetro+ "cm");
	}

}
