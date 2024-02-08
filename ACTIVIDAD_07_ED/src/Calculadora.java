import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------CALCULADORA-------------------------");
		System.out.println("Pulsa '0' para encender la calculadora :");
		int n1 = sc.nextInt();
		System.out.println("-----------------------");
		System.out.println("CALCULADORA ENCENDIDA");
		System.out.println("-----------------------");
		while (n1>=0 && n1!=5) {
			System.out.println("-----------------PANEL DE COMANDOS-------------------");
			System.out.println("Pulse 1 para sumar :");
			System.out.println("Pulse 2 para restar :");
			System.out.println("Pulse 3 para multiplicar :");
			System.out.println("Pulse 4 para dividir :");
			System.out.println("Pulse 5 para apagar la calculadora :");
			System.out.println("----------------------------------------------");
			 n1 = sc.nextInt();
			
			if (n1 == 1) {
				System.out.println("Introduce el primer numero para sumar :");
				int n2 = sc.nextInt();
				System.out.println("Introduce el segundo numero para sumar :");
				int n3 = sc.nextInt();
				int suma = n2 + n3;
				System.out.println("--------------------------------------------------");
				System.out.println("El resultado de la suma es igual a --> " + suma);
				System.out.println("--------------------------------------------------");
			}else if (n1 == 2) {
				System.out.println("Introduce el primer numero para que este sea restado :");
				int n2 = sc.nextInt();
				System.out.println("Introduce el segundo numero para restar al primer numero :");
				int n3 = sc.nextInt();
				int resta = n2 - n3;
				System.out.println("--------------------------------------------------");
				System.out.println("El resultado de la resta es igual a --> " + resta);
				System.out.println("--------------------------------------------------");
			}else if (n1 == 3) {
				System.out.println("Introduce el primer numero para multiplicar :");
				int n2 = sc.nextInt();
				System.out.println("Introduce el segundo numero para multiplicar al primer numero :");
				int n3 = sc.nextInt();
				int multiplicacion = n2 * n3;
				System.out.println("--------------------------------------------------");
				System.out.println("El resultado de la multiplicacion es igual a --> " + multiplicacion);
				System.out.println("--------------------------------------------------");
			}else if (n1 == 4) {
				System.out.println("Introduce el primer numero para que este sea dividido :");
				int n2 = sc.nextInt();
				System.out.println("Introduce el segundo numero para dividir al primer numero :");
				int n3 = sc.nextInt();
				int division = n2 / n3;
				System.out.println("--------------------------------------------------");
				System.out.println("El resultado de la division es igual a --> " + division);	
				int resto = n2%n3;
				System.out.println("Y el resto de la division es igual a -->" + resto);				
				System.out.println("--------------------------------------------------");
			}else if (n1==5) {
				System.out.println("-----------------------");
				System.out.println("CALCULADORA APAGADA");
				System.out.println("-----------------------");

			}
				
			
		}
	}

}
