import java.util.Scanner;

public class TipoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la cantidad de preguntas del examen:");
		//Se que no es necesario saber la cantidad de preguntas del examen
		//simplemente es por estetica.
		int preguntas = sc.nextInt();
		System.out.println("¿Cuantas preguntas tiene acertadas?:");
		int aciertos = sc.nextInt();
		System.out.println("¿Cuantas preguntas tiene incorrectas?:");
		int fallos = sc.nextInt();
		int nota = (aciertos * 5) - (fallos * 1);
		System.out.println("Su nota final es:" + nota);
		
		}

}
