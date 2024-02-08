import java.util.Scanner;

public class ConversionTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura :");
		int temperatura = sc.nextInt();
		System.out.println("Pulsa 1 para cambiar de Celsius a Farenhait : ");
		System.out.println("Pulsa 2 para cambiar de Farenhait a Celsius : ");
		int conversion = sc.nextInt();
		if (conversion == 2) {
			double operacion = (temperatura - 32) / 1.8;	
			System.out.println(operacion + " " + "ºC");
		}else {
			double operacion2 = (temperatura * 1.8) + 32;
			System.out.println(operacion2 + " " + "ºF");
		}
	}

}
