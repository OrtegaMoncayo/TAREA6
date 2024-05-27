/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 59397
 */
public class Pedido {
    private int idPedido;
    private Producto producto;
    private Cliente cliente;       
    private double total;       
    private String stado;       

    public Pedido() {
    }

    public Pedido(int idPedido, Producto producto, Cliente cliente, double total, String stado) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.cliente = cliente;
        this.total = total;
        this.stado = stado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStado() {
        return stado;
    }

    public void setStado(String stado) {
        this.stado = stado;
    }

     public void imprimir() {
        System.out.println("PEDIDO DEL CLIENTE" + "\n"
                + "Id:" + getIdPedido() + "\n"
                + "Producto:" + getProducto() + "\n"
                + "Cliente:" + getCliente() + "\n"
                + "Total:" + getTotal() + "\n"
                + "Stado:" +getStado() + "\n");

    }
            
            
}
