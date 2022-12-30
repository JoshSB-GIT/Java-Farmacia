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
public class Ingresos {
    private int idIngreso;
    private String estado;
    private int total;
    private int idUsuario;
    private String idProducto;
    private int idProveedor;

    public Ingresos() {
    }

    public Ingresos(int idIngreso, String estado, int total, int idUsuario, String idProducto, int idProveedor) {
        this.idIngreso = idIngreso;
        this.estado = estado;
        this.total = total;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    
}
