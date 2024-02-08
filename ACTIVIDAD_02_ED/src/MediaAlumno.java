import java.util.Scanner;

public class MediaAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Si usted quiere conocer su media, introduce los siguientes valores:");
		System.out.println("Introduzca su nota del primer parcial:");
		double parcial1 = sc.nextDouble();
		System.out.println("Introduzca su nota del segundo parcial:");
		double parcial2 = sc.nextDouble();
		System.out.println("Introduzca su nota del tercer parcial:");
		double parcial3 = sc.nextDouble();
		double mediaparcial = (parcial1 + parcial2 + parcial3) / 3;
		double parcial = (55*mediaparcial) / 100;
		System.out.println("A continuacion introduzca su nota del examen final:");
		double global = sc.nextDouble();
		double finaal = (30*global) / 100;
		System.out.println("Por ultimo, introduzca su nota del trabajo final:");
		double trabajo1 = sc.nextDouble();
		double trabajo = (15*trabajo1) / 100;
		System.out.println("Su media final en la asignatura de entorno de desarrollo es :" + (parcial + trabajo + finaal));
	
	
	}

}
