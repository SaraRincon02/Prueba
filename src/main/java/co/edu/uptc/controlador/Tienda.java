package co.edu.uptc.controlador;

import co.edu.uptc.modelo.Producto;

import java.util.ArrayList;

public class Tienda {
    private String name;
    private ArrayList<Producto> catalogo;

    public Tienda(String name){
        this.name = name;
        this.catalogo = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void agregarProducto(Producto producto){
        catalogo.add(producto);
    }

    public int getCantidadProductos(){
        return catalogo.size();
    }

    public Producto buscarProducto(String code){
        for (Producto p : catalogo){
            if (p.getCodigo().equalsIgnoreCase(code)){
                return p;

            }
        }
        return null;
    }


}
