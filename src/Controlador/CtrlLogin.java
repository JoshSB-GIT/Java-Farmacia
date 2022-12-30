/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasLogin;
import Modelo.Login;
import Vistas.frmLogin;
import Vistas.frmPrincipal;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlLogin implements ActionListener {
    
    // OBJETOS de clases que necesita este controlador
    private frmLogin objLogin; 
    private frmPrincipal objPrincipal;
    private ConsultasLogin conLog = new ConsultasLogin();
    private Login modLog = new Login();
    
    
    //Constructor de la clase 

    public CtrlLogin(frmLogin vistaLogin) {
        this.objLogin = vistaLogin;
        this.eventos(); //evento Action inicializado en el constructor de la clase
    }
    
    //Metodo de eventos
    public final void eventos(){
        objLogin.btnIngresar.addActionListener(this);
        objLogin.btnLoginExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if (evt.equals(objLogin.btnIngresar)) {
            if (objLogin.txtLoginUser.getText().equals("") && objLogin.txtLoginPass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "hay campos vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            }else if (objLogin.txtLoginUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo usuario vacío", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                objLogin.txtLoginUser.requestFocus();
            }else if (objLogin.txtLoginPass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo contraseña vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                objLogin.txtLoginPass.requestFocus();
            }else{
                modLog.setContraseña(objLogin.txtLoginPass.getText());
                modLog.setUsuario(objLogin.txtLoginUser.getText());
                if (conLog.verificarUsuario(modLog)) {
                    int rol = modLog.getIdRol();
                    
                    JOptionPane.showMessageDialog(null, "Has iniciado sesión correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                    objPrincipal = new frmPrincipal();
                    CtrlPrincipal ctrlPrin = new CtrlPrincipal(objPrincipal);
                    objPrincipal.setVisible(true);
                    objPrincipal.setLocationRelativeTo(null);
                    if (rol == 2) {
                        objPrincipal.tlUsuarios.setVisible(false);
                        objPrincipal.tlGesPro.setVisible(false);
                        objPrincipal.tlInventario.setVisible(false);
                        objPrincipal.tlUsuarios.setVisible(false);
                        objPrincipal.jSeparator1.setVisible(false);
                        objPrincipal.jSeparator2.setVisible(false);
                        objPrincipal.btnMenuInventario.setVisible(false);
                        objPrincipal.btnMenuUsu.setVisible(false);
                        objPrincipal.btnMenuPro.setVisible(false);
                    }
                    objLogin.dispose();
                    System.out.println("ROL de usuario: "+modLog.getIdRol());
                    
                    
                }
            }
        }else if (evt.equals(objLogin.btnLoginExit)) {
            System.exit(0);
        }
    }
    
    
    
}
