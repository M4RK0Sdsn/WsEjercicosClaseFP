package Paqueton;

public class Programador extends Empleado {

	@Override
	public String toString() {
		return "Programador id= " + getId() + ", sueldo= " + getSueldo() + ", DNI= " + getDNI()
				+ ", Nombre= " + getNombre() + ", getClass()= " + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
