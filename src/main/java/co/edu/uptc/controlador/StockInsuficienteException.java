package co.edu.uptc.controlador;

public class StockInsuficienteException extends Exception {
    public StockInsuficienteException(String nombre, int cantidadPedida, int disponible) {

        super("Solo quedan " + disponible + " de " + nombre + ", y se pidió " + cantidadPedida);
    }
}
