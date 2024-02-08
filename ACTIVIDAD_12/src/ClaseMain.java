import java.util.Scanner;

public class ClaseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Coche c1 = new Coche();
		Coche c2 = new Coche(null, null, null, 0, null, 0);
		
		System.out.println("Introduce el id del coche : ");
		c1.id = sc.next();
		System.out.println("Introduce la marca del coche : ");
		c1.marca = sc.next();
		System.out.println("Introduce el modelo del coche : ");
		c1.modelo = sc.next();
		System.out.println("Introduce la fecha de matriculacion");
		c1.fecha_de_matriculacion = sc.next();
		System.out.println("Introduce los kilometros del coche");
		c1.kilometros = sc.nextDouble();
		System.out.println("Introduce el precio del coche");
		c1.precio = sc.nextDouble();
		
		System.out.println("Introduce el id del coche : ");
		c2.id = sc.next();
		System.out.println("Introduce la marca del coche : ");
		c2.marca = sc.next();
		System.out.println("Introduce el modelo del coche : ");
		c2.modelo = sc.next();
		System.out.println("Introduce la fecha de matriculacion");
		c2.fecha_de_matriculacion = sc.next();
		System.out.println("Introduce los kilometros del coche");
		c2.kilometros = sc.nextDouble();
		System.out.println("Introduce el precio del coche");
		c2.precio = sc.nextDouble();
		
		c1.caro(c2);
		c1.diferencia_kilometros(c2);
		c1.fecha_de_matriculado();
		c1.kilometraje_primo();
		c1.kilometros_hasta_200000();
		c1.precio_base();
		c1.toString();
		c1.precio_kilometraje();
		c1.longitud();
		c1.diferencia_kilometros(c2);
		
		c2.caro(c1);
		c2.diferencia_kilometros(c1);
		c2.fecha_de_matriculado();
		c2.kilometraje_primo();
		c2.kilometros_hasta_200000();
		c2.precio_base();
		c2.toString();
		c2.precio_kilometraje();
		c2.longitud();
		c2.diferencia_kilometros(c1);
	}

}
