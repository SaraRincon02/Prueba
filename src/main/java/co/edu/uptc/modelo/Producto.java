package co.edu.uptc.modelo;

public class Producto {
    private String codigo;
    private String name;
    private int stock;
    private double price;

    public Producto(String codigo, String name, int stock, double price){
        this.codigo = codigo;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    //GETTERS

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrice() {
        return price;
    }

    public void descontar(int cantidad){
        stock = stock - cantidad;
    }

    @Override
    public String toString() {
        return codigo + " | " + name + " | Stock:" + stock + " | $" + getPrice();
    }
}
