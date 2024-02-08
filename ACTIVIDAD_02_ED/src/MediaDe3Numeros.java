import java.util.Scanner;

public class MediaDe3Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce uno de los 3 valores con el que quieras hacer la media :");
		double valor1 = sc.nextDouble();
		System.out.println("Introduce otro de los 3 valores con el que quieras hacer la media :");
		double valor2 = sc.nextDouble();
		System.out.println("Introduce uno de los 3 valores con el que quieras hacer la media :");
		double valor3 = sc.nextDouble();
		double media = (valor1 + valor2 + valor3) / 3;
		System.out.println("La media que obtiene mediante los valores ingresados es:" + media);
	}

}
