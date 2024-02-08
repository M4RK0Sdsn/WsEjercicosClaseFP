import java.util.Iterator;

public class Videojuego {
	String id;
	String nombre;
	double puntuacion;
	double precio;
	String fecha_de_creacion;
	boolean segunda_mano;
	
	public Videojuego () {
		fecha_de_creacion = "01/01/1970";		
		
	}
	
	public Videojuego ( String id, String nombre, double puntuacion, double precio, String fecha_de_creacion, boolean segunda_mano  ) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fecha_de_creacion = fecha_de_creacion;
		this.segunda_mano = segunda_mano;
		
	}
	
	public Videojuego (String nombre, String fecha_de_creacion) {
		this.nombre = nombre;
		this.fecha_de_creacion = fecha_de_creacion;

		
	}
	
	public void imprimir () {
		System.out.println("El id del videjouego es :" + this.id);
		System.out.println("El nombre del videojuego es :" + this.nombre);
		System.out.println("La puntuacion del videojuego es de :" + this.puntuacion);
		System.out.println("El precio del videojuego es de " + this.precio + "€");
		System.out.println("La fecha de creacion del videojuego es :" + this.fecha_de_creacion);
		System.out.println("Es el juego de segunda mano ? :" + this.segunda_mano);
	}
	
	public void imprimir_nombre_puntuacion () {
		System.out.println("El nombre del videojuego es :" + this.nombre);
		System.out.println("La puntuacion del videojuego es de :" + this.puntuacion);


	}
	
	public void libras () {
		double libras = this.precio * 0.86;
		System.out.println("El precio en libras es igual a :" + libras);
		
	}
	
	public double descuento () {
		double descuento = 0;
		if (this.segunda_mano == true) {
		descuento = (this.precio * 30) / 100;
			
		}
		return descuento;
		
	}
	 public void apto_no_apto () {
		 if (puntuacion >= 5 && puntuacion <=10) {
			System.out.println("APTO");
		}else {
			System.out.println("NO APTO");
		}
	 }
	 public void contar_numeros () {
		 for (int i = 0; i >this.puntuacion && i <= 10; i++) {
			 System.out.println(i);
		 }
		 }
		 public boolean caro (Videojuego v) {
			 boolean verdadero = true;
			 if (this.precio > v.precio) {
				 verdadero = true;
				 System.out.println(verdadero);
			 }else {
				 verdadero = false;
				 System.out.println(verdadero);
			 }
			 return verdadero;
		 
		
	 }
		 
	
	 
	
	}


