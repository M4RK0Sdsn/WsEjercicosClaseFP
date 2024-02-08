
public class Coche {

	String id;
	String marca;
	String modelo;
	double precio;
	String fecha_de_matriculacion;
	double kilometros;
	
	public Coche () {
		 this.marca = " ";
		 this.modelo = " ";
	}
	
	public Coche (String id, String marca, String modelo, double precio, String fecha_de_matriculacion, double kilometros) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fecha_de_matriculacion = fecha_de_matriculacion;
		this.kilometros = kilometros;
	}

	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", fecha_de_matriculacion=" + fecha_de_matriculacion + ", kilometros=" + kilometros + "]";
	}
	
	public void precio_base () {
		System.out.println("El precio base del coche es de : " + precio + " € ");
	}
	
	public void fecha_de_matriculado () {
		System.out.println("La fecha de matriculacion del vehiculo es : " + fecha_de_matriculacion);
	}
	
	public double precio_kilometraje () {
		double calculo_precio = 0;
		if (kilometros <= 10000) {
			precio = precio;
		}else if (kilometros > 10000 && kilometros < 50000) {
			calculo_precio = (precio * 80) / 100;
		}else {
			calculo_precio = (precio * 50) / 100;
		}
		return calculo_precio;
	}
	
	public boolean kilometraje_primo () {
		boolean primo = true;
	
			if (kilometros%2==0 && kilometros!=2 || kilometros%3==0 && kilometros!=3 || kilometros%5==0 && kilometros!=5) {
				System.out.println("-----------------------------------------------");
				System.out.println("Los kilometros -NO- son primos");
				System.out.println("-----------------------------------------------");
				primo = false;
			}else {
				System.out.println("-----------------------------------------------");
				System.out.println("Los kilometros -SI- son primos");
				System.out.println("-----------------------------------------------");
				primo = true;
			}
			return primo;
		
	}
	
	public double kilometros_hasta_200000 () {
		double resultado = 0;
		resultado = 200000 - kilometros;
		return resultado;
	}
	
	public void longitud () {
		System.out.println("La suma de las letras de la marca y el modelo es igual a : " + marca.length() + modelo.length() );
		}
	public double diferencia_kilometros (Coche c) {
		double resta = 0;
		if (kilometros >c.kilometros) {
			resta = kilometros - c.kilometros;
		}else if (c.kilometros > kilometros) {
			resta = c.kilometros - kilometros;
		}
		return  resta;
	}
	
	 public boolean caro (Coche c) {
		 boolean verdadero = true;
		 if (this.precio > c.precio) {
			 verdadero = true;
			 System.out.println(verdadero);
		 }else {
			 verdadero = false;
			 System.out.println(verdadero);
		 }
		 return verdadero;
	
}
}

