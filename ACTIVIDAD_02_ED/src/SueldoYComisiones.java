import java.util.Scanner;

public class SueldoYComisiones {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca por favor su sueldo base:");
		double sueldo = sc.nextDouble();
		System.out.println("por cada venta, se lleva un 10% de comision extra");
		System.out.println("Introduzca el valor de su primera venta:");
		double venta1 = sc.nextDouble();
		System.out.println("Introduzca el valor de su segunda venta:");
		double venta2 = sc.nextDouble();
		System.out.println("Por ultimo, introduzca el valor de su tercera venta:");
		double venta3 = sc.nextDouble();
		double comision1 = (10*venta1) / 100;
		double comision2 = (10*venta2) / 100;
		double comision3 = (10*venta3) / 100;

		System.out.println("Si usted tiene 3 ventas extras al mes, su sueldo al final del mes sera de:"+ (sueldo + comision1 + comision2 + comision3)+ "€");

	}

}
