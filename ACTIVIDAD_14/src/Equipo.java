import java.util.Arrays;
import java.util.Iterator;

public class Equipo {
	
	String nombre;
	String[] lista;
	public Equipo() {
		super();
	}
	public Equipo(String nombre, String[] lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}
	
	public String toString() {
		return "Equipo [nombre=" + nombre + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	public void MostrarJugadores() {
		for(int i = 0; i< lista.length; i++) {
			System.out.println("El jugador numero " + i + "se llama :" + lista[i]);
		}
		
	public void 
	}
	
	

}
