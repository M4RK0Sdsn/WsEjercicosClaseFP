

import java.util.Iterator;

public class _01_FOR_01_ {

	public static void main(String[] args) {

		// Existen otro tupo de sentencias de control que sirven para alterar al flujo
		// normal de ejecucion de un programa que son los bucles o sentencias
		// repetitivas

		// Con la sentencia "for" podemos repetir un bloque de codigo de una a N veces

		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");

		// Para hacer repeticiones mejor usar un bucle "for"
		// Para hacer un bucle for usaremos la palabra reservada "for"
		// Dentro de la estructura for podemos encontrar las siguientes partes
		// 1- Inicio de la variable de control de bucle, normalmente una variable entera
		// .
		// 2- Condicion de ejecucion del bucle, es decir cuando se tiene que seguir
		// ejecutando el bucle.
		// Es una expresion boolean
		// 3- Incremento de la variable de control de bucle
		// Estas 3 partes van entre parentesis y separadas por ";"

		// Ejemplo
		System.out.println("------------------------FOR-------------------------");
		for (int i = 1; i <= 100000; i++)
			System.out.println("Esta es la" + " " + i + "º" + " " + "vez que le meto a la rule");

		System.out.println("-----------------------FOR CON BLOQUE--------------------------------");
		for (int i = 1; i <= 10000; i++) {
			System.out.println("Hola en este bucle");
			System.out.println("Vamos a ejecutar varias sentencias");
		}
		System.out.println(
				"--------------------------------FOR USANDO LA VARIABLE DE CONTROL-------------------------------");
		for (int i = 1; i <= 10000; i++) {
			System.out.println("Hola en este bucle hemos ejecutado esto" + i + "veces");
		} // Cuando salgamos del bucle, la variable de control que hayamos creado morira
			// System.out.println("No puedo acceder a la variable 'i'" + i);

		// Imprimir solo los pares
		for (int i = 0; i <= 1000; i += 2) {
			System.out.println("Hola este bucle lo hemos ejecutado" + i);
			// No es buena practica alterar la variable del control de bucle fuera del "for"
		}
		// Normalmente usamos la palabre "iteracion" para referirnos a vada salto
		// del bucle

		// TODAS las partes del for son optativas
		for (;;) {
			// OJO con bucles que no paran porque podemo hacer un bucle infinito
			System.out.println(
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			for (int i = 0; i > 1000; i++) {
				System.out.println("Esto no se imprimira");
			}
			// Recomendaciones
			// 1. Escribir la variable de control en un papel y ver como se va incrementando
			// respecto al tiempo
			// 2. Siempre hacer bloques, aunque solo sea una sentencia

			// Podemos declarar la variable de control de bucle fuera del bucle
			int i = 0;
			for (i = 0; i <= 1000; i += 2) {
				System.out.println("Este bucle se ejecuta estas veces :" + i);
			}
			System.out.println("Ahora si que puede acceder a la variable de control :" + i);

			// Usando bucles podemos resolver de varias maneras los ejercicios
			// jugando con la variable de control y las condiciones de ejecucion
			for (int j = 0; j <= 9; j++) {
				System.out.println("Hola a todo el mundo que lea esto");
			}
			// Podemos seguir usando variables para las condiciones de bucle
			int numero = 10;
			for (int j = 1; j <= numero; j++) {
				System.out.println("Hola diez veces");
			}
			
		}
	}

}
