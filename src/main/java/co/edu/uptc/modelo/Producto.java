package co.edu.uptc.modelo;

public class Producto {
    private String codigo;
    private String name;
    private int stock;
    private double price;

    public Producto(String codigo, String name, int stock, double price){
       if (codigo == null || codigo.isBlank()){
           throw new DatoInvalidoException("[!] El código no puede estar vacio.");
       }
       if (stock <= 0){
           throw new DatoInvalidoException("[!] El stock no puede ser 0 o negativo.");
       }
       if (price <= 0){
           throw new DatoInvalidoException("[!] El precio no puede ser 0 o negativo.");
       }

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
