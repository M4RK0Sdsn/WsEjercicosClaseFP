import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Procesador procesador = new Procesador();
        TarjetaGrafica tarjetaGrafica = new TarjetaGrafica();
        PlacaBase placaBase = new PlacaBase();
        
        ArrayList<RAM> listaRams = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaRams.add(new RAM());
        }
        
        ArrayList<Periferico>  listaPerifericos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listaPerifericos.add(new Periferico());
        }
        
        Ordenador ordenador = new Ordenador();
        ordenador.setProcesador(procesador);
        ordenador.setTarjetaGrafica(tarjetaGrafica);
        ordenador.setPlacaBase(placaBase);
        ordenador.setListaRams(listaRams);
        ordenador.setListaPerifericos(listaPerifericos);
        
        System.out.println("Ordenador antes de calcular el precio:");
        System.out.println(ordenador.toString());
        
        ordenador.CalcularPrecio();
        
        System.out.println("\nOrdenador después de calcular el precio:");
        System.out.println(ordenador.toString());
    }
}