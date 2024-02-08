
public class ObjetoCoche {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		
		c1.marca = "Citroen";
		c1.modelo = "Xsara Picasso";
		c1.matricula = "0110FBH";
		c1.antiguedad = 5;
		c1.peso = 1000;
		c1.electrico = false;
		
		System.out.println("La marca del coche es :" + c1.marca);
		System.out.println("El modelo del coche es :" + c1.modelo);
		System.out.println("La matricula del coche es :" + c1.matricula);
		System.out.println("La antigüedad del coche es de " + c1.antiguedad + "años");
		System.out.println("El peso del coche es igual a " + c1.peso + "kg");
		System.out.println("¿Es el coche electrico? :" + c1.electrico);
		
		Coche c2 = new Coche();
		
		c2.marca = "Kia";
		c2.modelo = "Soul";
		c2.matricula = "4828HTK";
		c2.antiguedad = 2;
		c2.peso = 1250;
		c2.electrico = false;
		System.out.println("-------------------------------------------------------");
		System.out.println("La marca del coche es :" + c2.marca);
		System.out.println("El modelo del coche es :" + c2.modelo);
		System.out.println("La matricula del coche es :" + c2.matricula);
		System.out.println("La antigüedad del coche es de " + c2.antiguedad + "años");
		System.out.println("El peso del coche es igual a " + c2.peso + "kg");
		System.out.println("¿Es el coche electrico? :" + c2.electrico);
		
		Coche c3 = new Coche();
		
		c3.marca = "DS";
		c3.modelo = "7";
		c3.matricula = "5478LKJ";
		c3.antiguedad = 1;
		c3.peso = 1500;
		c3.electrico = true;
		System.out.println("-------------------------------------------------------");
		System.out.println("La marca del coche es :" + c3.marca);
		System.out.println("El modelo del coche es :" + c3.modelo);
		System.out.println("La matricula del coche es :" + c3.matricula);
		System.out.println("La antigüedad del coche es de " + c3.antiguedad + "años");
		System.out.println("El peso del coche es igual a " + c3.peso + "kg");
		System.out.println("¿Es el coche electrico? :" + c3.electrico);
	}

}
