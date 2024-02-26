import java.util.ArrayList;
import java.util.Arrays;

class Equipo {
    String nombre;
    ArrayList<String> jugadores;

    public Equipo() {
        this.nombre = "Equipo sin nombre";
        this.jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, ArrayList<String> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores.toString() + "]";
    }

    public void mostrarJugadores() {
        System.out.println("Lista de jugadores del equipo " + nombre + ":");
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public boolean existeJugador(String jugador) {
        return jugadores.contains(jugador);
    }

    public int numeroJugadores() {
        return jugadores.size();
    }

    public boolean esAptoParaJugar() {
        return jugadores.size() >= 7;
    }

    public boolean mismaListaDeJugadores(ArrayList<String> otraLista) {
        return jugadores.equals(otraLista);
    }

    public boolean mismoEquipo(Equipo otroEquipo) {
        return this.nombre.equals(otroEquipo.nombre) && this.jugadores.equals(otroEquipo.jugadores);
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }
}
