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
public class ConsultasFactura extends Conexion{
    frmError vError = new frmError();
    public boolean insertarFactura(Factura fac){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO isfarmacia.factura "
                + "(facCantidad, facFecha, idUsuario, proCodigo, idVenta) "
                + "values (?,now(),?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(fac.getCantidad()));
            ps.setString(2, Integer.toString(fac.getIdUsuario()));
            ps.setString(3, fac.getIdProducto());
            ps.setString(4, Integer.toString(fac.getIdVenta()));
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
}
