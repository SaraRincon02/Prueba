package co.edu.uptc.controlador;

public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String codigo) {

        super("[!] No hay ningun producto con el código " + codigo + ".");
    }
}
