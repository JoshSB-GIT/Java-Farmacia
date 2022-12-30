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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ConsultasUsuario extends Conexion{
    
    frmError vError = new frmError();
    
     public ArrayList<Usuarios> getUsuarios(){
        PreparedStatement ps = null;
        Statement stm;
        ResultSet rs = null;
        Connection con = getConnection();
        ArrayList<Usuarios> listaUsu = new ArrayList<>();
        String sql = "SELECT * FROM isfarmacia.usuario";
        
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                Usuarios objUsu = new Usuarios();
                objUsu.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
                objUsu.setNombre(rs.getString("usuNombre"));
                objUsu.setApellido(rs.getString("usuApellido"));
                objUsu.setTelefono(rs.getString("usuTelefono"));
                objUsu.setCorreo(rs.getString("usuCorreo"));
                objUsu.setEstado(rs.getString("usuEstado"));
                objUsu.setContraseña(rs.getString("usuContraseña"));
                objUsu.setRol(Integer.parseInt(rs.getString("idRol")));
                
                listaUsu.add(objUsu);
            }
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
        }
        return listaUsu;
    }
    
    public boolean insertarUsuarios(Usuarios usu){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO isfarmacia.usuario "
                + "(usuNombre, usuApellido, usuTelefono, usuCorreo, usuEstado, usuContraseña, idRol) "
                + "values (?,?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setString(3, usu.getTelefono());
            ps.setString(4, usu.getCorreo());
            ps.setString(5, usu.getEstado());
            ps.setString(6, usu.getContraseña());
            ps.setInt(7, usu.getRol());
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

    
    public boolean editarUsuarios(Usuarios usu){
        PreparedStatement ps = null;
        Connection con = getConnection();
         
        String sql = "UPDATE isfarmacia.usuario SET usuNombre=?, usuApellido=?, usuTelefono=?, usuCorreo=?, usuEstado=?, usuContraseña=?, idRol=? WHERE idUsuario=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setString(3, usu.getTelefono());
            ps.setString(4, usu.getCorreo());
            ps.setString(5, usu.getEstado());
            ps.setString(6, usu.getContraseña());
            ps.setInt(7, usu.getRol());
            ps.setInt(8, usu.getIdUsuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
            System.out.println(""+e.getMessage());
            
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
    
    
    public boolean eliminarUsuarios(Usuarios usu){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "DELETE FROM isfarmacia.usuario WHERE idUsuario=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usu.getIdUsuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(""+e.getMessage());
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
            
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Consul..."+e.getMessage());
                vError.setVisible(true);
                vError.setLocationRelativeTo(null);
                vError.lbErrorDuck2.setText(e.getMessage());
            }
        }
        
    }
    
    public DefaultTableModel modeloTablaUsuarios(){
        String [] columnas = {"Codigo", "Nombre", "Apellido", "Telefono", "Correo", "Estado", "Contraseña", "Rol"};
        String [] filas = new String [8];
        DefaultTableModel modeloUsuario = new DefaultTableModel(null, columnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        String sql = "SELECT * FROM isfarmacia.usuario";
        
        try {
            
            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                    filas[0] = rs.getString("idUsuario");
                    filas[1] = rs.getString("usuNombre");
                    filas[2] = rs.getString("usuApellido");
                    filas[3] = rs.getString("usuTelefono");
                    filas[4] = rs.getString("usuCorreo");
                    filas[5] = rs.getString("usuEstado");
                    filas[6] = rs.getString("usuContraseña");
                    filas[7] = rs.getString("idRol");
                    modeloUsuario.addRow(filas);
            }
            
        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        } 
        return modeloUsuario;
    }
    
    public DefaultTableModel filtrarUsuarios(int num){
        String [] columnas = {"Codigo", "Nombre", "Apellido", "Telefono", "Correo", "Estado", "Contraseña", "Rol"};
        String [] filas = new String [8];
        DefaultTableModel modeloUsuario = new DefaultTableModel(null, columnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        String sql = "SELECT * FROM isfarmacia.usuario WHERE idUsuario='"+num+"'";
        
        try {
            
            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                    filas[0] = rs.getString("idUsuario");
                    filas[1] = rs.getString("usuNombre");
                    filas[2] = rs.getString("usuApellido");
                    filas[3] = rs.getString("usuTelefono");
                    filas[4] = rs.getString("usuCorreo");
                    filas[5] = rs.getString("usuEstado");
                    filas[6] = rs.getString("usuContraseña");
                    filas[7] = rs.getString("idRol");
                    modeloUsuario.addRow(filas);
            }
            
        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        } 
        return modeloUsuario;
    }
    
}
