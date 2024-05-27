/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 59397
 */
public class Cliente {

    private String nombre;
    private String email;
    private String direccion;
    private String apellido;
    private String carrito;

    public Cliente() {
    }

    public Cliente(String nombre, String email, String direccion, String apellido, String carrito) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.apellido = apellido;
        this.carrito = carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrito() {
        return carrito;
    }

    public void setCarrito(String carrito) {
        this.carrito = carrito;
    }
    
   public void imprimir() {
        System.out.println("DATOS DEL CLIENTE" + "\n"
                + "NOMBRE:" + getNombre() + "\n"
                + "Apellido:" + getApellido() + "\n"
                + "Direccion:" + getDireccion() + "\n"
                + "Email:" + getEmail() + "\n"
                + "Carrito:" + getCarrito() + "\n");

    }
}
