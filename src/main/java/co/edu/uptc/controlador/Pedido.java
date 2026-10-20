package co.edu.uptc.controlador;

import co.edu.uptc.modelo.LineaPedido;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<LineaPedido> lineas;

    public Pedido(){
        lineas = new ArrayList<>();
    }

    public void agregar(LineaPedido linea){
        lineas.add(linea);
    }

    public ArrayList<LineaPedido> getLineas(){
        return lineas;
    }

    public double getTotal(){
        double total = 0;
        for (LineaPedido l : lineas){
            total += l.getSubTotal();
        }
        return total;
    }

    public double dividirPersonas(int cantPersonas){
        return getTotal() / cantPersonas;
    }

}
