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

    public Producto buscarProducto(String code) throws ProductoNoEncontradoException{
        for (Producto p : catalogo){
            if (p.getCodigo().equalsIgnoreCase(code)){
                return p;
            }
        }

        throw new ProductoNoEncontradoException(code);
    }

    public Producto despachar(String codigo, int cantidad) throws StockInsuficienteException, ProductoNoEncontradoException{
        if (cantidad <= 0){
            System.out.println("Dato invalido");
        }
        Producto p = buscarProducto(codigo);
        if (cantidad > p.getStock()){
            throw new StockInsuficienteException(p.getName(), cantidad, p.getStock());
        }

        p.descontar(cantidad);
        return p;
    }


}
