package co.edu.uptc.modelo;

public class LineaPedido{
    private Producto producto;
    private int cantidad;

    public LineaPedido(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;

    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubTotal(){
        return producto.getPrice() * cantidad;
    }

    @Override
    public String toString() {
        return cantidad + " | " + producto.getName() + " = $" + getSubTotal();
    }
}
