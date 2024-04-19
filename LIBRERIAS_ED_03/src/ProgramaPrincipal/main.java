package ProgramaPrincipal;

import aleatorios.ClaseAleatorios;
import sysos.ImprimirPantalla;

public class main {

	public static void main(String[] args) {
		ClaseAleatorios ca = new ClaseAleatorios();
		int numero = ca.numeroAleatorio();
		
	ImprimirPantalla ip = new ImprimirPantalla();
	ip.imprimir(numero);
	}

}
