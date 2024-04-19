package aleatorios;

import java.util.Random;

public class ClaseAleatorios {
	
	/**
	 * Metodo que genera un numero aleatorio entre dos numeros 
	 * pasados por parametro.
	 * @param n1 El minimo valor posible del rango (incluido)
	 * @param n2 El maximo valor posible del rango (incluido)
	 * @return El numero aleatorio generado entre los dos limites
	 */

	public int numeroAleatorioEntreDosNumeros(int n1, int n2) {
		Random rd = new Random();
		int nAleatorio = rd.nextInt(n1, n2 + 1);
		return nAleatorio;
	}
	
	/**
	 * Metodo que generea un numero aleatorio entre el 0
	 * y 2^32
	 * @return El numero pseudoaleatorio :)
	 */
	
	public int numeroAleatorio() {
		Random rd = new Random();
		int nAleatorio = rd.nextInt();
		return nAleatorio;
	}
}
