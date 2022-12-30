/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasProducto;
import Vistas.frmAñadeProducto;
import Vistas.frmAñadeUsuario;
import Vistas.frmIngresos;
import Vistas.frmInventario;
import Vistas.frmLogin;
import Vistas.frmPrincipal;
import Vistas.frmVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlPrincipal implements ActionListener {

    frmPrincipal objPrincipal;
    frmVentas objVentas = new frmVentas();
    frmIngresos objIngresos = new frmIngresos();
    ConsultasProducto mcProducto = new ConsultasProducto();
    frmInventario objInventario = new frmInventario();
    frmAñadeProducto objAproductos = new frmAñadeProducto();
    frmAñadeUsuario objAusuario = new frmAñadeUsuario();

    public CtrlPrincipal(frmPrincipal vistaPrincipal) {
        this.objPrincipal = vistaPrincipal;
        this.objPrincipal.tablaProductos.setModel(mcProducto.modeloTablaProductos());
        this.eventos();
    }

    public final void eventos() {
        objPrincipal.btnBuscar.addActionListener(this);
        objPrincipal.btnHacerFiltro.addActionListener(this);
        objPrincipal.btnRecibir.addActionListener(this);
        objPrincipal.btnVender.addActionListener(this);
        objPrincipal.btnMenuCerrarSesion.addActionListener(this);
        objPrincipal.btnMenuCerrarSistem.addActionListener(this);
        objPrincipal.btnMenuInventario.addActionListener(this);
        objPrincipal.btnMenuPro.addActionListener(this);
        objPrincipal.btnMenuUsu.addActionListener(this);
        objPrincipal.btnMenuRePro.addActionListener(this);
        objPrincipal.btnMenuReVenta.addActionListener(this);
        objPrincipal.tlVender.addActionListener(this);
        objPrincipal.tlBuscar.addActionListener(this);
        objPrincipal.tlGesPro.addActionListener(this);
        objPrincipal.tlInformacion.addActionListener(this);
        objPrincipal.tlInventario.addActionListener(this);
        objPrincipal.tlUsuarios.addActionListener(this);
        objPrincipal.tlPedidos.addActionListener(this);
        objPrincipal.actualizaTabla.addActionListener(this);
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
    public boolean validarFecha(String txt) {
    return txt.matches ("^\\d{4}([\\-/.])(0?[1-9]|1[1-2])\\1(3[01]|[12][0-9]|0?[1-9])$");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(objPrincipal.btnVender) || evt.equals(objPrincipal.btnMenuReVenta) || evt.equals(objPrincipal.tlVender)) {
            CtrlVentas cVen = new CtrlVentas(objVentas);
            objVentas.setVisible(true);
            objVentas.setLocationRelativeTo(null);
        } else if (evt.equals(objPrincipal.btnRecibir) || evt.equals(objPrincipal.btnMenuRePro) || evt.equals(objPrincipal.tlPedidos)) {
            Ctrlingresos cIng = new Ctrlingresos(objIngresos);
            objIngresos.setVisible(true);
            objIngresos.setLocationRelativeTo(null);
        } else if (evt.equals(objPrincipal.tlBuscar)) {
            String productoJO = JOptionPane.showInputDialog("Escribe el código de producto:");
            if (productoJO.equals("") || validarNumeros(productoJO) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objPrincipal.tablaProductos.setModel(mcProducto.filtrarDatosPro(1, productoJO));
            }

        } else if (evt.equals(objPrincipal.btnMenuCerrarSistem)) {
            int oSistema = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres salir?");
            if (oSistema == 0) {
                System.exit(0);
            } else if (oSistema == 1 || oSistema == 2) {

            }

        } else if (evt.equals(objPrincipal.btnMenuCerrarSesion)) {
            int oSesion = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres cerrar sesión?");
            if (oSesion == 0) {
                frmLogin vlog = new frmLogin();
                CtrlLogin clog = new CtrlLogin(vlog);
                vlog.setVisible(true);
                vlog.setLocationRelativeTo(null);
                objPrincipal.dispose();
            } else if (oSesion == 1 || oSesion == 2) {

            }
        } else if (evt.equals(objPrincipal.btnMenuInventario) || evt.equals(objPrincipal.tlInventario)) {
            frmInventario vIn = new frmInventario();
            CtrlInventario cIn = new CtrlInventario(vIn);
            vIn.setVisible(true);
            vIn.setLocationRelativeTo(null);
            this.objPrincipal.dispose();
        } else if (evt.equals(objPrincipal.btnMenuPro) || evt.equals(objPrincipal.tlGesPro)) {
            frmAñadeProducto objAñadePro = new frmAñadeProducto();
            CtrlAñadeProducto añaProducto = new CtrlAñadeProducto(objAproductos);
            objAproductos.setVisible(true);
            objAproductos.setLocationRelativeTo(null);
            this.objPrincipal.dispose();
        } else if (evt.equals(objPrincipal.btnMenuUsu) || evt.equals(objPrincipal.tlUsuarios)) {
            CtrlAñadeUsuarios cUsu = new CtrlAñadeUsuarios(objAusuario);
            objAusuario.setVisible(true);
            objAusuario.setLocationRelativeTo(null);
            this.objPrincipal.dispose();
        } else if (evt.equals(objPrincipal.actualizaTabla)) {
            objPrincipal.tablaProductos.setModel(mcProducto.modeloTablaProductos());
        } else if (evt.equals(objPrincipal.btnBuscar)) {
            int filtro = objPrincipal.cmbFiltrar.getSelectedIndex();
            String buscar = objPrincipal.txtBuscar.getText();
            if (filtro == 0) {
                JOptionPane.showMessageDialog(null, "Selecciona un filtro", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else if (filtro == 1) {
                if (validarNumeros(buscar) != true) {
                    JOptionPane.showMessageDialog(null, "El codigo debe ser un numero", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    objPrincipal.tablaProductos.setModel(mcProducto.filtrarDatosPro(filtro, buscar));
                }
            } else if (filtro == 2) {
                if (validarLetras(buscar) != true) {
                    JOptionPane.showMessageDialog(null, "El nommbre debe contener letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    objPrincipal.tablaProductos.setModel(mcProducto.filtrarDatosPro(filtro, buscar));
                }
            } else if (filtro == 3) {
                if (validarFecha(buscar) != true) {
                    JOptionPane.showMessageDialog(null, "Esa no es una feha válida (AAAA-MM-DD)", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    objPrincipal.tablaProductos.setModel(mcProducto.filtrarDatosPro(filtro, buscar));
                }
            }else if (filtro == 4) {
                if (validarDouble(buscar) != true) {
                    JOptionPane.showMessageDialog(null, "Los valores tienen decimales", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    objPrincipal.tablaProductos.setModel(mcProducto.filtrarDatosPro(filtro, buscar));
                }
            }else if (filtro == 5) {
                if (validarNumeros(buscar) != true) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser un numero entero", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    objPrincipal.tablaProductos.setModel(mcProducto.filtrarDatosPro(filtro, buscar));
                }
            }
            if (objPrincipal.txtBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo de busqueda vacío", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {

                //mcProducto.filtrarDatosPro(filtro, buscar);
            }
        }
    }

}
