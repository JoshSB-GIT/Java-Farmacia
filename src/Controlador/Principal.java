/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.frmError;
import Vistas.frmLogin;
import Vistas.frmSplash;

/**
 *
 * @author User
 */
public class Principal {
    
    public static void main(String[] args) {
        
        frmSplash splash = new frmSplash();
        frmLogin login = new frmLogin();
        CtrlLogin cLogin = new CtrlLogin(login);
        splash.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                if (i == 100) {
                    login.setVisible(true);
                    splash.dispose();
                }
            }
        } catch (InterruptedException e) {
            frmError verror = new frmError();
            verror.setVisible(true);
            verror.setLocationRelativeTo(null);
            verror.lbErrorDuck2.setText(e.getMessage());
            System.err.println(""+e);
        }
    }
}
