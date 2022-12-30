/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.Usuarios;
import Vistas.frmAñadeUsuario;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlAñadeUsuarios implements ActionListener {

    private frmAñadeUsuario objUsuario;
    private ConsultasUsuario conUsu = new ConsultasUsuario();
    private Usuarios modUsu = new Usuarios();

    public CtrlAñadeUsuarios(frmAñadeUsuario objUsuario) {
        this.objUsuario = objUsuario;
        this.objUsuario.tablaUsuarios.setModel(conUsu.modeloTablaUsuarios());
        eventos();
    }

    public final void eventos() {
        objUsuario.tlActuUsu.addActionListener(this);
        objUsuario.tlBuscar.addActionListener(this);
        objUsuario.tlEliminaUsu.addActionListener(this);
        objUsuario.tlInsertarUsu.addActionListener(this);
        objUsuario.btnBscarPro.addActionListener(this);
        objUsuario.btnInicio.addActionListener(this);
        objUsuario.actualizaTabla.addActionListener(this);
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
        //variable evt con origen e
        Object evt = e.getSource();
        //boton insertar usuario
        if (evt.equals(objUsuario.tlInsertarUsu)) {
            //validar campos
            if (objUsuario.txtNombre.getText().equals("") || objUsuario.txtApellido.getText().equals("")
                    || objUsuario.txtTelefono.getText().equals("") || objUsuario.txtCorreo.getText().equals("")
                    || objUsuario.txtEstado.getText().equals("") || objUsuario.txtContraseña.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else if (validarLetras(objUsuario.txtNombre.getText()) != true || validarLetras(objUsuario.txtApellido.getText()) != true
                    || validarLetras(objUsuario.txtEstado.getText()) != true) {
                JOptionPane.showMessageDialog(null, "Los campos, estado, nombre y apellido solo admiten letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else if (validarNumeros(objUsuario.txtTelefono.getText()) != true) {
                JOptionPane.showMessageDialog(null, "El campo telefono solo admite números", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                //Obtener texto de los JtextField
                modUsu.setNombre(objUsuario.txtNombre.getText());
                modUsu.setApellido(objUsuario.txtApellido.getText());
                modUsu.setTelefono(objUsuario.txtTelefono.getText());
                modUsu.setCorreo(objUsuario.txtCorreo.getText());
                modUsu.setEstado(objUsuario.txtEstado.getText());
                modUsu.setContraseña(objUsuario.txtApellido.getText());
                modUsu.setRol(objUsuario.cmbRoles.getItemAt(objUsuario.cmbRoles.getSelectedIndex()).getIdRol());

                conUsu.insertarUsuarios(modUsu);
                objUsuario.tablaUsuarios.setModel(conUsu.modeloTablaUsuarios());
            }
            //Actualizar usuario
        } else if (evt.equals(objUsuario.tlActuUsu)) {

            int fila = objUsuario.tablaUsuarios.getSelectedRow();

            if (fila >= 0) {
                if (validarLetras(objUsuario.tablaUsuarios.getValueAt(fila, 1).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "La casilla nombre solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else if (validarLetras(objUsuario.tablaUsuarios.getValueAt(fila, 2).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "La casilla apellido solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else if (validarLetras(objUsuario.tablaUsuarios.getValueAt(fila, 5).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "La casilla estado solo admite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else if (validarNumeros(objUsuario.tablaUsuarios.getValueAt(fila, 3).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "La casilla telefono solo admite números", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else if (validarNumeros(objUsuario.tablaUsuarios.getValueAt(fila, 7).toString()) != true
                        && Integer.parseInt(objUsuario.tablaUsuarios.getValueAt(fila, 7).toString()) >= 2
                        && Integer.parseInt(objUsuario.tablaUsuarios.getValueAt(fila, 7).toString()) <= 1) {
                    JOptionPane.showMessageDialog(null, "La casilla idRol solo admite números y debe ser 1 o 2", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    modUsu.setIdUsuario(Integer.parseInt(objUsuario.tablaUsuarios.getValueAt(fila, 0).toString()));
                    modUsu.setNombre(objUsuario.tablaUsuarios.getValueAt(fila, 1).toString());
                    modUsu.setApellido(objUsuario.tablaUsuarios.getValueAt(fila, 2).toString());
                    modUsu.setTelefono(objUsuario.tablaUsuarios.getValueAt(fila, 3).toString());
                    modUsu.setCorreo(objUsuario.tablaUsuarios.getValueAt(fila, 4).toString());
                    modUsu.setEstado(objUsuario.tablaUsuarios.getValueAt(fila, 5).toString());
                    modUsu.setContraseña(objUsuario.tablaUsuarios.getValueAt(fila, 6).toString());
                    modUsu.setRol(Integer.parseInt(objUsuario.tablaUsuarios.getValueAt(fila, 7).toString()));

                    if (conUsu.editarUsuarios(modUsu)) {
                        JOptionPane.showMessageDialog(null, "Usuario editado correctamente");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se selección un producto en la tabla", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            }

        } else if (evt.equals(objUsuario.tlEliminaUsu)) {
            int fila = objUsuario.tablaUsuarios.getSelectedRow();

            if (fila >= 0) {
                int o = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas eliminar el usuario?");
                if (o == 0) {
                    modUsu.setIdUsuario(Integer.parseInt(objUsuario.tablaUsuarios.getValueAt(fila, 0).toString()));
                    if (conUsu.eliminarUsuarios(modUsu)) {
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        objUsuario.tablaUsuarios.setModel(conUsu.modeloTablaUsuarios());
                    } else {
                    }
                } else {
                }

            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado un usuario", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            }

        } else if (evt.equals(objUsuario.actualizaTabla)) {
            objUsuario.tablaUsuarios.setModel(conUsu.modeloTablaUsuarios());
        } else if (evt.equals(objUsuario.btnBscarPro)) {
            //conUsu.filtrarUsuarios(Integer.parseInt(objUsuario.txtBuscarUsu.getText()));
            if (objUsuario.txtBuscarUsu.getText().equals("") || validarNumeros(objUsuario.txtBuscarUsu.getText()) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objUsuario.tablaUsuarios.setModel(conUsu.filtrarUsuarios(Integer.parseInt(objUsuario.txtBuscarUsu.getText())));
            }
        } else if (evt.equals(objUsuario.tlBuscar)) {
            String codigo = JOptionPane.showInputDialog("Digita el código del producto");
            if (codigo.equals("") || validarNumeros(codigo) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objUsuario.tablaUsuarios.setModel(conUsu.filtrarUsuarios(Integer.parseInt(codigo)));
            }
        } else if (evt.equals(objUsuario.btnInicio)) {
            frmPrincipal vPrn = new frmPrincipal();
            CtrlPrincipal cPrin = new CtrlPrincipal(vPrn);
            vPrn.setVisible(true);
            vPrn.setLocationRelativeTo(null);
            this.objUsuario.dispose();
        }

    }

}
