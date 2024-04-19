package Paqueton;

public class Empleado {
	
	private int id;
	private double sueldo;
	private String DNI;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void generarId() {
		this.id++;
	}
	
	public double calcularSueldo() {
		this.sueldo = sueldo;
		return sueldo;
	}
	

}
