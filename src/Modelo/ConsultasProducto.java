/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vistas.frmAñadeProducto;
import Vistas.frmError;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultasProducto extends Conexion {

    frmError vError = new frmError();
    frmAñadeProducto objProdu = new frmAñadeProducto();

    public boolean insertarProfuctos(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT INTO isfarmacia.producto "
                + "(proCodigo, proNombre, proDescri, proValor, proStock, proFechaVenci, idProveedor) "
                + "values (?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDescripcion());
            ps.setDouble(4, pro.getValor());
            ps.setInt(5, pro.getStock());
            ps.setString(6, pro.getFechaVencimiento());
            ps.setInt(7, pro.getIdProveedor());
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

    public boolean editarProfuctos(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE isfarmacia.producto SET proCodigo=?, "
                + "proNombre=?, proDescri=?, proValor=?, proStock=?, proFechaVenci=?, "
                + "idProveedor=? WHERE proCodigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDescripcion());
            ps.setDouble(4, pro.getValor());
            ps.setInt(5, pro.getStock());
            ps.setString(6, pro.getFechaVencimiento());
            ps.setInt(7, pro.getIdProveedor());
            ps.setString(8, pro.getCodigo());
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

    public boolean eliminarProfuctos(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "DELETE FROM isfarmacia.producto WHERE proCodigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
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

    public boolean verProfuctos(Producto pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT * FROM isfarmacia.producto WHERE proCodigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setCodigo(rs.getString("proCodigo"));
                pro.setNombre(rs.getString("proNombre"));
                pro.setDescripcion(rs.getString("ProDescri"));
                pro.setValor(Double.parseDouble(rs.getString("proValor")));
                pro.setStock(Integer.parseInt(rs.getString("proStock")));
                pro.setFechaVencimiento(rs.getString("proFechaVenci"));
                pro.setIdProveedor(Integer.parseInt(rs.getString("idProveedor")));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró nada con esa referencia", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
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

    public DefaultTableModel filtrarDatosPro(int filtro, String buscar) {
        String[] columnas = {"Codigo", "Nombre", "Descripción", "Valor", "Cantidad", "Fecha de vencimiento", "iPro"};
        String[] filas = new String[7];
        DefaultTableModel modeloProducto = new DefaultTableModel(null, columnas);
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        if (filtro == 1) {
            sql = "SELECT * FROM isfarmacia.producto where proCodigo='" + buscar + "'";
        } else if (filtro == 2) {
            sql = "SELECT * FROM isfarmacia.producto where proNombre='" + buscar + "'";
        } else if (filtro == 3) {
            sql = "SELECT * FROM isfarmacia.producto where proFechaVenci='" + buscar + "'";
        } else if (filtro == 4) {
            sql = "SELECT * FROM isfarmacia.producto where proValor='" + buscar + "'";
        }else if (filtro == 5) {
            sql = "SELECT * FROM isfarmacia.producto where proStock='" + buscar + "'";
        }

        try {

            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                filas[0] = rs.getString("proCodigo");
                filas[1] = rs.getString("proNombre");
                filas[2] = rs.getString("proDescri");
                filas[3] = rs.getString("proValor");
                filas[4] = rs.getString("proStock");
                filas[5] = rs.getString("proFechaVenci");
                filas[6] = rs.getString("idProveedor");
                modeloProducto.addRow(filas);
            }

        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        }
        return modeloProducto;
    }

    public DefaultTableModel modeloTablaProductos() {
        String[] columnas = {"Codigo", "Nombre", "Descripción", "Valor", "Cantidad", "Fecha de vencimiento", "iPro"};
        String[] filas = new String[7];
        DefaultTableModel modeloProducto = new DefaultTableModel(null, columnas);

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM isfarmacia.producto";

        try {

            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                filas[0] = rs.getString("proCodigo");
                filas[1] = rs.getString("proNombre");
                filas[2] = rs.getString("proDescri");
                filas[3] = rs.getString("proValor");
                filas[4] = rs.getString("proStock");
                filas[5] = rs.getString("proFechaVenci");
                filas[6] = rs.getString("idProveedor");
                modeloProducto.addRow(filas);
            }

        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        }
        return modeloProducto;
    }
    
    public DefaultTableModel modeloInventario() {
        String[] columnas = {"Codigo", "Nombre", "Valor", "Ventas", "f. venta", "Ingresos", "F. Ingresos"};
        String[] filas = new String[7];
        DefaultTableModel modeloIventario = new DefaultTableModel(null, columnas);

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT producto.proCodigo, producto.proNombre, producto.proValor, "
                + "ventas.venTotal, ventas.venFecha, ingresos.ingTotal, ingresos.ingFecha "
                + "FROM isfarmacia.producto INNER JOIN isfarmacia.ventas "
                + "ON producto.proCodigo = ventas.proCodigo INNER JOIN isfarmacia.ingresos "
                + "ON producto.proCodigo = ingresos.proCodigo;";

        try {

            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                filas[0] = rs.getString("proCodigo");
                filas[1] = rs.getString("proNombre");
                filas[2] = rs.getString("proValor");
                filas[3] = rs.getString("venTotal");
                filas[4] = rs.getString("venFecha");
                filas[5] = rs.getString("ingTotal");
                filas[6] = rs.getString("ingFecha");
                modeloIventario.addRow(filas);
            }

        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        }
        return modeloIventario;
    }

    public DefaultTableModel modeloMasVentas() {
        String[] columnas = {"Codigo", "Total ventas", "Nombre", "Stock", "f. venta"};
        String[] filas = new String[5];
        DefaultTableModel modeloMasVentas = new DefaultTableModel(null, columnas);

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT producto.proCodigo, sum(ventas.venTotal) as totalVentas, producto.proNombre, "
                + "producto.proStock, ventas.venFecha FROM isfarmacia.ventas "
                + "INNER JOIN isfarmacia.producto ON ventas.proCodigo = producto.proCodigo "
                + "group by producto.proCodigo order by totalVentas desc";

        try {

            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                filas[0] = rs.getString("proCodigo");
                filas[1] = rs.getString("totalVentas");
                filas[2] = rs.getString("proNombre");
                filas[3] = rs.getString("proStock");
                filas[4] = rs.getString("venFecha");
                modeloMasVentas.addRow(filas);
            }

        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        }
        return modeloMasVentas;
    }
    
    public DefaultTableModel modeloIngresos() {
        String[] columnas = {"Codigo", "Ingresos", "Nombre", "Stock", "f. ingreso"};
        String[] filas = new String[5];
        DefaultTableModel modeloIngresos = new DefaultTableModel(null, columnas);

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT producto.proCodigo, sum(ingresos.ingTotal) "
                + "as ingresos, producto.proNombre, producto.proStock, ingresos.ingFecha "
                + "FROM isfarmacia.ingresos INNER JOIN isfarmacia.producto "
                + "ON ingresos.proCodigo = producto.proCodigo group by producto.proCodigo "
                + "order by ingresos asc";

        try {

            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                filas[0] = rs.getString("proCodigo");
                filas[1] = rs.getString("ingresos");
                filas[2] = rs.getString("proNombre");
                filas[3] = rs.getString("proStock");
                filas[4] = rs.getString("ingFecha");
                modeloIngresos.addRow(filas);
            }

        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        }
        return modeloIngresos;
    }
    
    public DefaultTableModel filtromodeloInventario(String code) {
        String[] columnas = {"Codigo", "Nombre", "Valor", "Ventas", "f. venta", "Ingresos", "F. Ingresos"};
        String[] filas = new String[7];
        DefaultTableModel modeloIventario = new DefaultTableModel(null, columnas);

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT producto.proCodigo, producto.proNombre, producto.proValor, "
                + "ventas.venTotal, ventas.venFecha, ingresos.ingTotal, ingresos.ingFecha "
                + "FROM isfarmacia.producto INNER JOIN isfarmacia.ventas "
                + "ON producto.proCodigo = ventas.proCodigo INNER JOIN isfarmacia.ingresos "
                + "ON producto.proCodigo = ingresos.proCodigo WHERE proCodigo='"+code+"'";

        try {

            Connection con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                filas[0] = rs.getString("proCodigo");
                filas[1] = rs.getString("proNombre");
                filas[2] = rs.getString("proValor");
                filas[3] = rs.getString("venTotal");
                filas[4] = rs.getString("venFecha");
                filas[5] = rs.getString("ingTotal");
                filas[6] = rs.getString("ingFecha");
                modeloIventario.addRow(filas);
            }

        } catch (SQLException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
        }
        return modeloIventario;
    }
    
}
