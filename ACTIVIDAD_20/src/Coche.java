import java.util.Scanner;

public class Coche {
	
	Scanner sc= new Scanner(System.in);
	private int id;
	private String matricula;
	private String marca;
	

	private static int contadorID;
	

	public Coche() {
		super();
		this.id = contadorID;
		contadorID++;
	}
	
	private final String marca1 = "toyota";
	private final String marca2 = "Renault";


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public static int getContadorID() {
		return contadorID;
	}
	public static void setContadorID(int contadorID) {
		Coche.contadorID = contadorID;
	}
	public String getMarca1() {
		return marca1;
	}
	public String getMarca2() {
		return marca2;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	public static void ResetearId () {
		contadorID = 0;
	}
	
	public static void MostrarContadorID () {
		System.out.println(getContadorID());
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	

