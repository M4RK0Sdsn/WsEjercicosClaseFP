import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            equipos.add(crearEquipoDesdeTeclado(scanner, i + 1));
        }
        scanner.close();

        for (Equipo equipo : equipos) {
            System.out.println(equipo.toString());
            equipo.mostrarJugadores();
            System.out.println("Número de jugadores: " + equipo.numeroJugadores());
            System.out.println("¿Es apto para jugar?: " + equipo.esAptoParaJugar());
            System.out.println();
        }

        Equipo equipo1 = equipos.get(0);
        Equipo equipo2 = equipos.get(1);

        System.out.println("¿Las listas de jugadores son iguales?: " + equipo1.mismaListaDeJugadores(equipo2.getJugadores()));
        System.out.println("¿Los equipos son iguales?: " + equipo1.mismoEquipo(equipo2));
    }

    public static Equipo crearEquipoDesdeTeclado(Scanner scanner, int numEquipo) {
        System.out.println("Introduce el nombre del equipo " + numEquipo + ": ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la lista de jugadores separados por comas para el equipo " + numEquipo + ": ");
        String jugadoresInput = scanner.nextLine();
        String[] jugadores = jugadoresInput.split(",");
        ArrayList<String> jugadoresList = new ArrayList<>();
        for (String jugador : jugadores) {
            jugadoresList.add(jugador.trim());
        }
        return new Equipo(nombre, jugadoresList);
    }
}
