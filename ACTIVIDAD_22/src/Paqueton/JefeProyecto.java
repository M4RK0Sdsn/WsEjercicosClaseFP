package Paqueton;

public class JefeProyecto extends Empleado{
	
	private double incentivos;

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public double calcularSueldo() {
		double sueldo = getSueldo() + this.incentivos;
		return sueldo;
	}
	
	

}
