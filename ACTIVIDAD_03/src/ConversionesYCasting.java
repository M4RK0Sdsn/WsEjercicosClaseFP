
public class ConversionesYCasting {

	public static void main(String[] args) {
		
		//Entero a flotante
		//-----------------
		
		int numeroEntero = 15;
		float numeroFlotante = 125F;
		numeroFlotante = numeroEntero;
		System.out.println(numeroFlotante);
		
		//Flotante a enteros
		//------------------
		
		int numeroEntero2 = 32;
		float numeroFlotante2 = 132F;
		numeroEntero2 = (int)numeroFlotante2;
		System.out.println(numeroEntero2);
		
		//Ambas conversiones son posibles ya que
		//no poseen decimales que no puedan representar
		//simplemente se pone un .0 en la conversion Entero>Flotante
		//y se quita en la conversion inversa
		
		//Doble a entero
		//--------------
		
		int numeroEntero3 = 25;
		double numeroDoble = 15.18;
		numeroEntero3 =  (int)numeroDoble;
		System.out.println(numeroEntero3);
		//tengo que hacer el 'casting', porque los numeros double
		//no caben en los enteros
		
		//Entero a doble
		//--------------
		
		int numeroEntero4 = 43;
		double numeroDoble2 = 32.11;
		numeroDoble2= numeroEntero4;
		System.out.println(numeroDoble2);
		
		//Caracteres a enteros
		//--------------------
		int numeroEntero5 = 67;
		char caracter = 'M';
		numeroEntero5 = caracter;
		System.out.println(numeroEntero5);
		//La conversion no necesita cast ya que java coge el valor del caracter
		//de la tabla de ascii
		
		//Entero a caracteres
		//-------------------
		int numeroEntero6 = 74;
		char caracter2 = 'p';
		caracter2 = (char) numeroEntero6;
		System.out.println(caracter2);
		
		//Cadena a entero
		//---------------
		int numeroEntero7 = 4234;
		String CadenaAlfabetica = "hola buenas";
		//numeroEntero7 = CadenaAlfabetica;
		//numeroEntero7 = (int) CadenaAlfabetica;
		//No funciona de ninguna de las dos maneras
		
		//Cadena a caracteres
		//-------------------
		char caracter3 = 'k';
		String CadenaAlfabetica2 = "Aupa Atleti";
		//caracter3 = CadenaAlfabetica2;
		//caracter3 = (char)CadenaAlfabetica2;
		//Tampoco se puede de ninguna de las dos maneras, ni cast
		//ni sin cast
		//

	}

}
