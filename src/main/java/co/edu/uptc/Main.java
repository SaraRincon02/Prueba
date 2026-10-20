package co.edu.uptc;

import co.edu.uptc.controlador.Tienda;
import co.edu.uptc.modelo.DatoInvalidoException;
import co.edu.uptc.modelo.Producto;
import co.edu.uptc.vista.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tienda sogamoso = new Tienda("Juan Valdez - Sogamoso");
        try {
            sogamoso.agregarProducto(new Producto("JV001", "Tinto Campesino", 15, 5000));
            sogamoso.agregarProducto(new Producto("JV002", "Capuccino Valdez", 12, 8900));
            sogamoso.agregarProducto(new Producto("JV003", "Granizado Nevado", 10, 13200));
            sogamoso.agregarProducto(new Producto("JV004", "Croassaint Queso", 19, 7500));
            sogamoso.agregarProducto(new Producto("JV005", "Cafe Grano 500gr", 6, 28000));
        }catch (DatoInvalidoException e){
            System.out.println(e.getMessage());
        }
        Menu menu = new Menu(sogamoso);
        menu.iniciar();
    }
}
