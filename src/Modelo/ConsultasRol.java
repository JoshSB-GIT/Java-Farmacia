/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vistas.frmError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ConsultasRol extends Conexion{
    frmError vError = new frmError();
    
    public ArrayList<Rol> getRol(){
        PreparedStatement ps = null;
        Statement stm;
        ResultSet rs = null;
        Connection con = getConnection();
        ArrayList<Rol> listaRol = new ArrayList<>();
        String sql = "SELECT * FROM isfarmacia.rol";
        
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                Rol objRol = new Rol();
                objRol.setIdRol(Integer.parseInt(rs.getString("idRol")));
                objRol.setNombre(rs.getString("rolNombre"));
                
                listaRol.add(objRol);
            }
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
        }
        return listaRol;
    }
}
