import java.util.Scanner;

public class sueldoTrabajador {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca su sueldo base por favor:");
		double sueldo = sc.nextDouble();
		System.out.println("A continuacion, introduzca la cantidad de horas extras trabajadas:");
		int extras = sc.nextInt();
		int horas = extras * 40;
		System.out.println("Su sueldo final es de :" + (sueldo + horas));
		
	}

}
