/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasProducto;
import Vistas.frmAñadeProducto;
import Vistas.frmInventario;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlInventario implements ActionListener {

    //Objetos
    private frmInventario objInventario;
    ConsultasProducto conPro = new ConsultasProducto();

    //cnstructor de la clase
    public CtrlInventario(frmInventario objInventario) {
        this.objInventario = objInventario;
        this.objInventario.tablaInvPrin.setModel(conPro.modeloInventario());
        this.objInventario.tablaVentas.setModel(conPro.modeloMasVentas());
        this.objInventario.tablaIngresos.setModel(conPro.modeloIngresos());
        eventos();
    }
    //Metodo para los eventos AcrionListener - Actionperformed

    public final void eventos() {
        //Botones de la vista
        objInventario.btnBuscar.addActionListener(this);
        objInventario.btnInfo.addActionListener(this);
        objInventario.btnProductos.addActionListener(this);
        objInventario.actualizaTabla3.addActionListener(this);
        objInventario.btnMenuInicio.addActionListener(this);
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
        //boton para llamar al jframe de productos
        if (evt.equals(objInventario.btnProductos)) {
            frmAñadeProducto vistaPro = new frmAñadeProducto();
            CtrlAñadeProducto conPro = new CtrlAñadeProducto(vistaPro);
            vistaPro.setVisible(true);
            vistaPro.setLocationRelativeTo(null);
            //Boton para buscar productos
        } else if (evt.equals(objInventario.btnBuscar)) {
            String codigo = JOptionPane.showInputDialog(null, "Escribe el código del producto: ", "", JOptionPane.YES_NO_CANCEL_OPTION);
            if (codigo.equals("") || validarNumeros(codigo) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objInventario.tablaInvPrin.setModel(conPro.filtrarDatosPro(1,codigo));
            }
        } else if (evt.equals(objInventario.actualizaTabla3)) {
            objInventario.tablaInvPrin.setModel(conPro.modeloInventario());
            objInventario.tablaVentas.setModel(conPro.modeloMasVentas());
            objInventario.tablaIngresos.setModel(conPro.modeloIngresos());
        } else if (evt.equals(objInventario.btnMenuInicio)) {
            frmPrincipal vPrin = new frmPrincipal();
            CtrlPrincipal cPrin = new CtrlPrincipal(vPrin);
            vPrin.setVisible(true);
            vPrin.setLocationRelativeTo(null);
            this.objInventario.dispose();
        }
    }

}
