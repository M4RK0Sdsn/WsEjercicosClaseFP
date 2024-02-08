import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa una cadena: ");
	        String cadena = sc.nextLine();
	        String cadenaInvertida = invertirCadena(cadena);
	        System.out.println("Cadena invertida: " + cadenaInvertida);

	    }
	    private static String invertirCadena(String cadena) {

	        char[] caracteres = cadena.toCharArray();
	        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
	            char temp = caracteres[i];
	            caracteres[i] = caracteres[j];
	            caracteres[j] = temp;
	        }
	        return new String(caracteres);
	    }
	}
