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

public class ConsultasIngresos extends Conexion{
        frmError vError = new frmError();
    
    public boolean insertarIngresos(Ingresos in){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO isfarmacia.ingresos "
                + "(ingEstado,ingFecha,ingTotal,idUsuario,proCodigo,idProveedor) "
                + "values (?,now(),?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, in.getEstado());
            ps.setString(2, Integer.toString(in.getTotal()));
            ps.setString(3, Integer.toString(in.getIdUsuario()));
            ps.setString(4, in.getIdProducto());
            ps.setString(5, Integer.toString(in.getIdProveedor()));
            ps.execute();
            return true;
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
            System.out.println("consultas..."+e.getMessage());
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
    
    
    public void actualizarStock(Ingresos in){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        /* String sql = "UPDATE isfarmacia.producto INNER JOIN isfarmacia.ingresos "
                + "ON producto.proCodigo = ingresos.proCodigo "
                + "SET producto.proStock = producto.proStock+ingresos.ingTotal "
                + "WHERE producto.proCodigo=?";*/
        
        String sql = "UPDATE isfarmacia.producto INNER JOIN isfarmacia.ingresos "
                + "ON producto.proCodigo = ? "
                + "SET producto.proStock = producto.proStock+? "
                + "WHERE producto.proCodigo=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, in.getIdProducto());
            ps.setString(2, Integer.toString(in.getTotal()));
            ps.setString(3, in.getIdProducto());
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
