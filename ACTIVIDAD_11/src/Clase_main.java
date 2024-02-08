import java.util.Scanner;

public class Clase_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("asdie", "fortinite", 8.9, 67, "12/08/2017", true);
		Videojuego v3 = new Videojuego("Black ops 3" , "15/07/2005");
	

		System.out.println(v1.fecha_de_creacion);
		System.out.println("Introduzca el id del juego : ");
		v1.id = sc.next();
		System.out.println("Introduce el nombre del juego : ");
		v1.nombre = sc.next();
		System.out.println("Introduce el precio del videojuego : ");
		v1.precio = sc.nextDouble();
		System.out.println("Introduce la puntuacion del juego : ");
		v1.puntuacion = sc.nextDouble();
		System.out.println("Es el juego de segunda mano ? : ");
		v1.segunda_mano = sc.nextBoolean();
		
		
		v1.caro(v2);
		v1.apto_no_apto();
		v1.contar_numeros();
		v1.descuento();
		v1.imprimir();
		v1.imprimir_nombre_puntuacion();
		v1.libras();
		
		v2.caro(v3);
		v2.apto_no_apto();
		v2.contar_numeros();
		v2.descuento();
		v2.imprimir();
		v2.imprimir_nombre_puntuacion();
		v2.libras();
		
		v3.caro(v1);
		v3.apto_no_apto();
		v3.contar_numeros();
		v3.descuento();
		v3.imprimir();
		v3.imprimir_nombre_puntuacion();
		v3.libras();
		
	}
	

}
