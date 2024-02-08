import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Nombre = "Capi";
		String Contraseña = "odioAironMan69";
		System.out.println("----------EJERCICIO 4----------");
		System.out.println("Introduzca su nombre de usuario");
		String nombre = sc.next();
		System.out.println("Introduzca su contraseña");
		String contraseña = sc.next();
		if (nombre.equals(Nombre) && contraseña.equals(Contraseña) ) {
			System.out.println("Acceso concedido");
			System.out.println("Bienvenido al paraiso de la programacion :)");
		}else {
			System.out.println("Acceso denegado");
		}
	}

}
