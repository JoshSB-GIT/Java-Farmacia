/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasIngresos;
import Modelo.ConsultasProducto;
import Modelo.Ingresos;
import Modelo.Producto;
import Vistas.frmIngresos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ctrlingresos implements ActionListener {

    private frmIngresos objIng;
    private Producto modPro = new Producto();
    private ConsultasProducto conPro = new ConsultasProducto();
    private ConsultasIngresos conIng = new ConsultasIngresos();
    private Ingresos modIng = new Ingresos();

    public Ctrlingresos(frmIngresos vIng) {
        this.objIng = vIng;
        this.objIng.tablaPro.setModel(conPro.modeloTablaProductos());
        eventos();
    }

    public final void eventos() {
        objIng.btnGuardarPedido.addActionListener(this);
        objIng.actualizaTabla.addActionListener(this);
        objIng.tlBuscar.addActionListener(this);
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

        if (evt.equals(objIng.btnGuardarPedido)) {
            if (evt.equals(objIng.btnGuardarPedido)) {
                if (objIng.txtCodigoPro.getText().equals("") || objIng.txtEstado.getText().equals("")
                        || objIng.txtTotalIngreso.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Hay campos vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else if (validarNumeros(objIng.txtCodigoPro.getText()) != true
                        || validarNumeros(objIng.txtTotalIngreso.getText()) != true) {
                    JOptionPane.showMessageDialog(null, "Los campos total y código solo admiten numeros", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else if (validarLetras(objIng.txtEstado.getText()) != true) {
                    JOptionPane.showMessageDialog(null, "El campo estado solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    modIng.setEstado(objIng.txtEstado.getText());
                    modIng.setIdUsuario(objIng.cmbUsuarios.getItemAt(objIng.cmbUsuarios.getSelectedIndex()).getIdUsuario());
                    modIng.setIdProducto(objIng.txtCodigoPro.getText());
                    int index = objIng.cmbProveedores.getItemAt(objIng.cmbProveedores.getSelectedIndex()).getIdProveedor();
                    modIng.setIdProveedor(index);
                    modIng.setTotal(Integer.parseInt(objIng.txtTotalIngreso.getText()));

                    if (conIng.insertarIngresos(modIng)) {
                        JOptionPane.showMessageDialog(null, "¡Producto ingresado!");
                        conIng.actualizarStock(modIng);
                        objIng.tablaPro.setModel(conPro.modeloTablaProductos());
                    }

                }
            }
        } else if (evt.equals(objIng.actualizaTabla)) {
            objIng.tablaPro.setModel(conPro.modeloTablaProductos());
        } else if (evt.equals(objIng.tlBuscar)) {
            String codigo = JOptionPane.showInputDialog("Digita el código del producto");
            if (codigo.equals("") || validarNumeros(codigo) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objIng.tablaPro.setModel(conPro.filtrarDatosPro(1, codigo));
            }
        }
    }

}
