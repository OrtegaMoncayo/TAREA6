/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Direccion;
import Modelo.Pago;
import Modelo.Pedido;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59397
 */
public class Main {

    public static void main(String[] args, Iterable<Cliente> clientes) {
        Cliente cli = new Cliente();
        Producto pro = new Producto();
        Pedido ped = new Pedido();
        Pago pag = new Pago();
        Direccion dir = new Direccion();

        Cliente[] Listaclientes = new Cliente[10];
        Producto[] Listaproductos = new Producto[10];
        Pedido[] Listapedidos = new Pedido[10];
        Pago[] Listapagos = new Pago[10];
        Direccion[] Listadirecciones = new Direccion[10];

        for (int i = 0; i < 10; i++) {
           Listaclientes[i] = new Cliente("juan", "j@hotmail", "pugacho", "perez", "lista de deseo");
          Listaproductos[i] = new Producto(1, "computadora", "hp luminus", 1030.30, 54);
           Listadirecciones[i] = new Direccion("primero de mayo", "Ibarra", "C29","Ecuador");
        }

        for (int i = 0; i < 10; i++) {
           Listapedidos[i] = new Pedido(2, pro, cli, 2000, "completo");
           Listapagos[i] = new Pago(4, 1003.20, "tarjeta de credito");
        }

        for (Cliente cliente : Listaclientes) {
            cliente.imprimir();
        }

        for (Producto producto : Listaproductos) {
            producto.imprimir();
        }

        for (Pedido pedido :Listapedidos) {
            pedido.imprimir();
        }

        for (Pago pago :Listapagos) {
            pago.imprimir();
        }

        for (Direccion direccion : Listadirecciones) {
            direccion.imprimir();
        }
    }
}
