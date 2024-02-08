
public class FiguraGeometrica {

	public static void main(String[] args) {
		area(15.5, 17.5);
		area(22.5);
		area(12);
	}
	public static void area(double base, double altura) {
		double calculoArea = (base*altura) / 2;
		System.out.println("El area del triangulo es igual a :" + calculoArea + "cm");
	}
	public static void area(double lado) {
		double calculoArea = (lado*lado) ;
		System.out.println("El area del cuadrado es igual a :" + calculoArea + "cm");
	}
	public static void area(int radio) {
		double calculoArea = (radio*radio) * 3.14;
		System.out.println("El area del cuadrado es igual a :" + calculoArea + "cm");
	}

}
