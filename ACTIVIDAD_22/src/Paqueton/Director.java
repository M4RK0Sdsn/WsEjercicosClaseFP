package Paqueton;

import java.util.ArrayList;

public class Director extends Empleado {
	
	ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	
	

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}



	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}



	@Override
	public double calcularSueldo() {
		double sueldo = getSueldo()+ (100 * (listaEmpleados.size()-1));
		return sueldo;
	}
	
	

}
