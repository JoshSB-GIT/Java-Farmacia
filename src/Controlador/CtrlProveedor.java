/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasProveedor;
import Modelo.Proveedor;
import Vistas.frmProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlProveedor implements ActionListener {

    //Objetos / variables
    private frmProveedor objProvee;
    private Proveedor modProve = new Proveedor();
    private ConsultasProveedor conProve = new ConsultasProveedor();

    //Constructor de la clase
    public CtrlProveedor(frmProveedor objProvee) {
        this.objProvee = objProvee;
        this.objProvee.tablaProveedor.setModel(conProve.modeloTablaProveedor());
        eventos();
    }

    //ActionListeners de los items del frame 
    public final void eventos() {
        objProvee.btnAñadePro.addActionListener(this);
        objProvee.btnBuscarPro.addActionListener(this);
        objProvee.btnEditaPro.addActionListener(this);
        objProvee.btnEliminaPro.addActionListener(this);
        objProvee.tlBuscar.addActionListener(this);
        objProvee.tlEditar.addActionListener(this);
        objProvee.tlEliminar.addActionListener(this);
        objProvee.tlInsertar.addActionListener(this);
        objProvee.actualizaTabla.addActionListener(this);
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
        //variable objeto evt para el origen de e
        Object evt = e.getSource();

        //Botones insertar
        if (evt.equals(objProvee.btnAñadePro) || evt.equals(objProvee.tlInsertar)) {
            //campos vacíos
            if (objProvee.txtNombre.getText().equals("") || objProvee.txtDescri.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                //validar letras
            } else if (validarLetras(objProvee.txtNombre.getText()) != true) {
                JOptionPane.showMessageDialog(null, "El campo nombre solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                //enviar datos al modelo de proveedor
                modProve.setNombre(objProvee.txtNombre.getText());
                modProve.setDescripcion(objProvee.txtDescri.getText());
                //método para INSERT
                if (conProve.insertarProveedor(modProve)) {
                    JOptionPane.showMessageDialog(null, "Proveedor añadido correctamente", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                    objProvee.tablaProveedor.setModel(conProve.modeloTablaProveedor());
                } else {

                }
            }
        } else if (evt.equals(objProvee.btnEditaPro) || evt.equals(objProvee.tlEditar)) {
            //obtener fila seleccionada en la tabla
            int fila = objProvee.tablaProveedor.getSelectedRow();

            //Validar que esté seleccionada
            if (fila >= 0) {
                //Validar letras o numeros
                if (validarLetras(objProvee.tablaProveedor.getValueAt(fila, 1).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "Casilla de nombre solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    //enviar datos al modelo de proveedores
                    modProve.setIdProveedor(Integer.parseInt(objProvee.tablaProveedor.getValueAt(fila, 0).toString()));
                    modProve.setNombre(objProvee.tablaProveedor.getValueAt(fila, 1).toString());
                    modProve.setDescripcion(objProvee.tablaProveedor.getValueAt(fila, 2).toString());

                    //metodo para UPDATE
                    if (conProve.editarProveedor(modProve)) {
                        JOptionPane.showMessageDialog(null, "Proveedor editado correctamente", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);

                    } else {

                    }
                    //cargar tabla
                    objProvee.tablaProveedor.setModel(conProve.modeloTablaProveedor());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado el proveedor", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            }
            //boton recargar tabla
        } else if (evt.equals(objProvee.actualizaTabla)) {
            objProvee.tablaProveedor.setModel(conProve.modeloTablaProveedor());
            //botones eliminar
        } else if (evt.equals(objProvee.btnEliminaPro) || evt.equals(objProvee.tlEliminar)) {
            //obtener fila seleccionada en la tabla
            int fila = objProvee.tablaProveedor.getSelectedRow();

            int op = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas eliminar este proveedor?");
            // 0 = si , 1 = no, 2 = cancel

            if (op == 0) {
                //Validar que esté seleccionada
                if (fila >= 0) {
                    //Validar letras o numeros
                    if (validarLetras(objProvee.tablaProveedor.getValueAt(fila, 1).toString()) != true) {
                        JOptionPane.showMessageDialog(null, "Casilla de nombre solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        //enviar datos al modelo de proveedores
                        modProve.setIdProveedor(Integer.parseInt(objProvee.tablaProveedor.getValueAt(fila, 0).toString()));

                        //metodo para DELETE
                        if (conProve.eliminarProveedor(modProve)) {
                            JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);

                        } else {

                        }
                        //cargar tabla
                        objProvee.tablaProveedor.setModel(conProve.modeloTablaProveedor());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No has seleccionado el proveedor", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                }
            } else {

            }
        } else if (evt.equals(objProvee.btnBuscarPro)) {
            if (objProvee.txtBuscarPro.getText().equals("") || validarNumeros(objProvee.txtBuscarPro.getText()) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objProvee.tablaProveedor.setModel(conProve.filtrarProveedor(Integer.parseInt(objProvee.txtBuscarPro.getText())));
            }
        } else if (evt.equals(objProvee.tlBuscar)) {
            String codigo = JOptionPane.showInputDialog("Digita el código del proveedor");
            if (codigo.equals("") || validarNumeros(codigo) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objProvee.tablaProveedor.setModel(conProve.filtrarProveedor(Integer.parseInt(codigo)));
            }

        }
    }

}
