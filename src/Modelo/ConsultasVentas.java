/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vistas.frmError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ConsultasVentas extends Conexion{
    
    frmError vError = new frmError();
    
    public boolean insertarVentas(Ventas ven){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO isfarmacia.ventas "
                + "(venFecha, venTotal, idUsuario, proCodigo) "
                + "values (now(),?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(ven.getTotal()));
            ps.setString(2, Integer.toString(ven.getIdUsuario()));
            ps.setString(3, ven.getIdProducto());
            ps.execute();
            return true;
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
            
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                vError.setVisible(true);
                vError.setLocationRelativeTo(null);
                vError.lbErrorDuck2.setText(e.getMessage());
            }
        }
        
    }
    
    
    public void actualizarStock(Ventas ven){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE isfarmacia.producto INNER JOIN isfarmacia.ventas ON producto.proCodigo = ? "
        + "SET producto.proStock = producto.proStock-? WHERE producto.proCodigo=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ven.getIdProducto());
            ps.setString(2, Integer.toString(ven.getTotal()));
            ps.setString(3, ven.getIdProducto());
            ps.execute();
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                vError.setVisible(true);
                vError.setLocationRelativeTo(null);
                vError.lbErrorDuck2.setText(e.getMessage());
            }
        }
    }
    
}
