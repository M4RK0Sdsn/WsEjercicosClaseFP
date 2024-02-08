import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa una cadena: ");
	        String entradaUsuario = sc.nextLine();
	        int resultado = contarPalabras(entradaUsuario);
	        System.out.println("El número de palabras en la cadena es: " + resultado);}
	    public static int contarPalabras(String cadena) {
	        String[] palabras = cadena.split("\\s+");
	        int numeroPalabras = palabras.length;
	        return numeroPalabras;
	    }
	}
	
