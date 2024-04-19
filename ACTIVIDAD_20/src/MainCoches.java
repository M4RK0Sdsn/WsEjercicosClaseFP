import java.util.ArrayList;
import java.util.Scanner;

public class MainCoches {
	private static 	Scanner sc = new Scanner(System.in);
	private ArrayList<Coche> coches = new ArrayList<Coche>();


	public static void main(String[] args) {
		int seleccionador = 1;
		MainCoches main = new MainCoches () ;
		main.arrancarPrograma(seleccionador);
		
		
		
		
	}
	
	public void arrancarPrograma (int seleccionador) {
		
		do {
			System.out.println("--------SELECCIONE UNA OPCION--------");
			System.out.println("1 - Crear Coche");
			System.out.println("2 - Mostrar Coches");
			System.out.println("3 - Mostrar Contador ID");
			System.out.println("4 - Resetear Contador ID");
			System.out.println("5 - Salir Del Programa");
			seleccionador = sc.nextInt();
			switch (seleccionador) {
			case 1:
				Coche c1 = new Coche ();
				System.out.println("Introduce la marca del Coche : ");
				c1.setMarca(sc.next());
				System.out.println("Introduce la matricula del coche : ");
				c1.setMatricula(sc.next());
				coches.add(c1);
				break;
			case 2:
				for(Coche c : coches) {
					System.out.println(c);
				}
				break;
			case 3:
				Coche.getContadorID();
				break;
			case 4:
				Coche.ResetearId();
			case 5:
				System.out.println("Fin del programa");
				break;
			default:
				break;
			}
			
		} while (seleccionador > 0 && seleccionador <=4);
	}
	
}
