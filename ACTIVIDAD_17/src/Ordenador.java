import java.util.ArrayList;

public class Ordenador {
	
	private double precio;
	private Procesador procesador;
	private TarjetaGrafica TarjetaGrafica;
	private PlacaBase PlacaBase;
	private ArrayList<RAM> listaRams;
	private ArrayList<Periferico> listaPerifericos;
	
	
		
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public Procesador getProcesador() {
		return procesador;
	}



	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}



	public TarjetaGrafica getTarjetaGrafica() {
		return TarjetaGrafica;
	}



	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		TarjetaGrafica = tarjetaGrafica;
	}



	public PlacaBase getPlacaBase() {
		return PlacaBase;
	}



	public void setPlacaBase(PlacaBase placaBase) {
		PlacaBase = placaBase;
	}



	public ArrayList<RAM> getListaRams() {
		return listaRams;
	}



	public void setListaRams(ArrayList<RAM> listaRams) {
		this.listaRams = listaRams;
	}



	public ArrayList<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}



	public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}



	void CalcularPrecio() {
		int suma = 0;
		for(RAM i: listaRams) {
			suma += i.getPrecio();
		}
		int suma2 = 0;
		for(Periferico j: listaPerifericos) {
			suma2 += j.getPrecio();
		}
		double precio = this.precio = PlacaBase.getPrecio()+ procesador.getPrecio()+ TarjetaGrafica.getPrecio()+ suma + suma2;
	}
	
}
