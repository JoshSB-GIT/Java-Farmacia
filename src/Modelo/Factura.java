/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Factura {
    private int idFactura;
    private int cantidad;
    private String fecha;
    private int idUsuario;
    private String idProducto;
    private int idVenta;

    public Factura() {
    }

    public Factura(int idFactura, int cantidad, String fecha, int idUsuario, String idProducto, int idVenta) {
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.idVenta = idVenta;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    
   
    
    
}
