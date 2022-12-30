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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ConsultasLogin extends Conexion {

    frmError vError = new frmError();

    public boolean verificarUsuario(Login log) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT * FROM isfarmacia.login WHERE logContraseña=? and logUsuario=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, log.getContraseña());
            ps.setString(2, log.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                log.setContraseña(rs.getString("logContraseña"));
                log.setUsuario(rs.getString("logUsuario"));
                log.setIdRol(Integer.parseInt(rs.getString("idRol")));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no existente", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (SQLException e) {
            vError.setVisible(true);
            vError.lbErrorDuck2.setText(e.getMessage());

            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                vError.setVisible(true);
                vError.lbErrorDuck2.setText(e.getMessage());
            }
        }
    }

}
