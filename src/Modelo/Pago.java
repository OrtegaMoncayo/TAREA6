/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 59397
 */
public class Pago {
    private int idPago;
    private double monto;
    private String metodo;

    public Pago() {
    }

    public Pago(int idPago, double monto, String metodo) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodo = metodo;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
     public void imprimir() {
        System.out.println("PAGO REALIZADO" + "\n"
                + "Id:" + getIdPago()+ "\n"
                + "Monto:" + getMonto() + "\n"
                + "Metodo:" + getMetodo() + "\n");

    }
}
