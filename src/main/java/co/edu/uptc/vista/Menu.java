package co.edu.uptc.vista;

import co.edu.uptc.controlador.Pedido;
import co.edu.uptc.controlador.Tienda;
import co.edu.uptc.modelo.LineaPedido;
import co.edu.uptc.modelo.Producto;

import java.util.Scanner;

public class Menu {
    private Tienda tienda;
    private Pedido pedido;
    private Scanner sc;

    public Menu(Tienda tienda){
        this.tienda = tienda;
        this.pedido = new Pedido();
        this.sc = new Scanner(System.in);
    }

    public void iniciar(){
        System.out.println();
        System.out.println("===== " + tienda.getName() + " =====");
        int opcion = 0;
        while (opcion == 0){
            mostrarMenu();
            opcion = sc.nextInt();

            if (opcion == 0){
                System.out.println("Hasta la proxima");
            } else if (opcion == 1) {
                for (Producto p : tienda.getCatalogo()){
                    System.out.println(p);
                }
            } else if (opcion == 2) {

                crearPedido();
            }else{
                System.out.println("Opcion no valida");
            }
        }
    }

    private void mostrarMenu(){
        System.out.println();
        System.out.println("1. Ver catalogo");
        System.out.println("2. Agregar Pedido");
        System.out.println("3. Ver Pedido");
    }

    private void crearPedido(){
        String codigo = sc.nextLine();
        sc.nextLine();
        String c = sc.nextLine();

        try {

            int cantidad = Integer.parseInt(c);

            Producto p = tienda.buscarProducto(codigo);
            double subTotal = p.getPrice() * cantidad;
            pedido.agregar(new LineaPedido(p, cantidad));
            p.descontar(cantidad);
            System.out.println("[OK] se ha agregado con exito.");
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("[!] la cantidad debe de ser diferente a cero (0)");
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("[!] El objeto no existe");
        }
    }
}
