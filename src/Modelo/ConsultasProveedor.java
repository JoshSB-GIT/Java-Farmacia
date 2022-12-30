/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vistas.frmError;
import Vistas.frmProveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ConsultasProveedor extends Conexion{
    
    
    frmProveedor objProve = new frmProveedor();
    frmError vError = new frmError();
    
    public ArrayList<Proveedor> getProveedor(){
        PreparedStatement ps = null;
        Statement stm;
        ResultSet rs = null;
        Connection con = getConnection();
        ArrayList<Proveedor> listaPro = new ArrayList<>();
        String sql = "SELECT * FROM isfarmacia.proveedor";
        
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                Proveedor objPro = new Proveedor();
                objPro.setIdProveedor(Integer.parseInt(rs.getString("idProveedor")));
                objPro.setNombre(rs.getString("provNombre"));
                objPro.setDescripcion(rs.getString("provDescripcion"));
                
                listaPro.add(objPro);
            }
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
        }
        return listaPro;
    }
    
    public boolean insertarProveedor(Proveedor pro){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO isfarmacia.proveedor "
                + "(provNombre, provDescripcion, provFechaHora) "
                + "values (?,?,now())";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getDescripcion());
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
    
    public boolean editarProveedor(Proveedor pro){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "update isfarmacia.proveedor set provNombre=?, provDescripcion=? WHERE idProveedor=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getDescripcion());
            ps.setString(3, Integer.toString(pro.getIdProveedor()));
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            vError.setVisible(true);
            vError.setLocationRelativeTo(null);
            vError.lbErrorDuck2.setText(e.getMessage());
            System.out.println("Consultas....");
            
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
    
    public boolean eliminarProveedor(Proveedor pro){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "DELETE FROM isfarmacia.proveedor WHERE idProveedor=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(pro.getIdProveedor()));
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
            vError.lbErrorDuck2.setText(e.getMessage());
            }
        }
    
}
    
    public boolean verProveedor(Proveedor pro){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        
        String sql = "SELECT * FROM isfarmacia.proveedor WHERE proCodigo=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(pro.getIdProveedor()));
            rs = ps.executeQuery();
            
            if (rs.next()) {
                pro.setNombre(rs.getString("proNombre"));
                pro.setDescripcion(rs.getString("ProDescri"));
                pro.setIdProveedor(Integer.parseInt(rs.getString("idProveedor")));
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró nada con esa referencia","¡Mensaje de error!",JOptionPane.ERROR_MESSAGE);
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
    
    public DefaultTableModel modeloTablaProveedor(){
        String [] columnas = {"Id", "Nombre", "Descripción"};
        String [] filas = new String [3];
        DefaultTableModel modeloProveedor = new DefaultTableModel(null, columnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        String sql = "SELECT * FROM isfarmacia.proveedor";
        
        try {
            
            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                    filas[0] = rs.getString("idProveedor");
                    filas[1] = rs.getString("provNombre");
                    filas[2] = rs.getString("provDescripcion");
                    modeloProveedor.addRow(filas);
            }
            
        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        } 
        return modeloProveedor;
    }
    
    public DefaultTableModel filtrarProveedor(int num){
        String [] columnas = {"Id", "Nombre", "Descripción"};
        String [] filas = new String [3];
        DefaultTableModel modeloProveedor = new DefaultTableModel(null, columnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        String sql = "SELECT * FROM isfarmacia.proveedor WHERE idProveedor='"+num+"'";
        
        try {
            
            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                    filas[0] = rs.getString("idProveedor");
                    filas[1] = rs.getString("provNombre");
                    filas[2] = rs.getString("provDescripcion");
                    modeloProveedor.addRow(filas);
            }
            
        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        } 
        return modeloProveedor;
    }
}
