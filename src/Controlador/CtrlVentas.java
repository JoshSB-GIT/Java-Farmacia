/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasFactura;
import Modelo.ConsultasVentas;
import Modelo.Factura;
import Modelo.Ventas;
import Vistas.frmVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlVentas implements ActionListener {

    private frmVentas objVentas;
    private Ventas modVentas = new Ventas();
    private Factura modFac = new Factura();
    private ConsultasFactura conFac = new ConsultasFactura();
    private ConsultasVentas conVentas = new ConsultasVentas();

    public CtrlVentas(frmVentas objVentas) {
        this.objVentas = objVentas;
        eventos();
    }

    public final void eventos() {
        objVentas.btnHacerVenta.addActionListener(this);
    }

    public boolean validarNumeros(String txt) {
        return txt.matches("^([0-9])*$");
    }

    public boolean validarLetras(String txt) {
        return txt.matches("[a-zA-Z]+");
    }

    public boolean validarDouble(String txt) {
        return txt.matches("^[0-9]+([.][0-9]+)?$");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(objVentas.btnHacerVenta)) {

            if (objVentas.txtCodigoPro.getText().equals("") || objVentas.txtVentaTotal.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else if (validarNumeros(objVentas.txtVentaTotal.getText()) != true){
                JOptionPane.showMessageDialog(null, "El campo total solo admite números", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            }else {
                modVentas.setIdProducto(objVentas.txtCodigoPro.getText());
                modVentas.setIdUsuario(objVentas.cmbUsuarios.getItemAt(objVentas.cmbUsuarios.getSelectedIndex()).getIdUsuario());
                modVentas.setTotal(Integer.parseInt(objVentas.txtVentaTotal.getText()));
                /*modFac.setCantidad(Integer.parseInt(objVentas.txtVentaTotal.getText()));
                modFac.setIdProducto(objVentas.txtCodigoPro.getText());
                modFac.setIdUsuario(Integer.parseInt(objVentas.txtUsuariosid.getText()));
                modFac.setIdVenta(modVentas.getIdVenta());*/
                if (conVentas.insertarVentas(modVentas)) {
                    conVentas.actualizarStock(modVentas);
                    JOptionPane.showMessageDialog(null, "Venta realizada con exito", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                } else {

                }
                //conFac.insertarFactura(modFac);
                /*conVentas.actualizarStock(modVentas);
                objVentas.txtUsuariosid.setText("");
                objVentas.txtVentaTotal.setText("");
                objVentas.txtCodigoPro.setText("");*/
            }

        }
    }

}
