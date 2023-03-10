/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.ConsultasProveedor;
import Modelo.ConsultasRol;
import Modelo.Proveedor;
import Modelo.Rol;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class frmAñadeUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frmAñadeUsuario
     */
    public frmAñadeUsuario() {
        initComponents();
        llenarCombo();
    }
    
    private void llenarCombo(){
        ConsultasRol modRol = new ConsultasRol();
        ArrayList<Rol> lRol = modRol.getRol();
        
        for (int i = 0; i < lRol.size(); i++) {
            cmbRoles.addItem(new Rol(lRol.get(i).getIdRol(), lRol.get(i).getNombre()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscarUsu = new javax.swing.JTextField();
        btnBscarPro = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();
        actualizaTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        tlBuscar = new javax.swing.JButton();
        tlInsertarUsu = new javax.swing.JButton();
        tlActuUsu = new javax.swing.JButton();
        tlEliminaUsu = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnInicio = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));

        txtBuscarUsu.setBackground(new java.awt.Color(71, 71, 71));
        txtBuscarUsu.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarUsu.setBorder(null);

        btnBscarPro.setBackground(new java.awt.Color(71, 71, 71));
        btnBscarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBscarPro.setBorder(null);
        btnBscarPro.setBorderPainted(false);
        btnBscarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBscarPro.setFocusPainted(false);
        btnBscarPro.setFocusable(false);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));

        txtNombre.setBackground(new java.awt.Color(71, 71, 71));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Nombre");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(71, 71, 71));
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(102, 153, 255));

        txtTelefono.setBackground(new java.awt.Color(71, 71, 71));
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setBorder(null);

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Telefono");

        jSeparator7.setBackground(new java.awt.Color(102, 153, 255));

        jSeparator8.setBackground(new java.awt.Color(102, 153, 255));

        txtCorreo.setBackground(new java.awt.Color(71, 71, 71));
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setBorder(null);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Correo");

        jSeparator9.setBackground(new java.awt.Color(102, 153, 255));

        txtEstado.setBackground(new java.awt.Color(71, 71, 71));
        txtEstado.setForeground(new java.awt.Color(204, 204, 204));
        txtEstado.setBorder(null);

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Estado");

        jSeparator10.setBackground(new java.awt.Color(102, 153, 255));

        txtContraseña.setBackground(new java.awt.Color(71, 71, 71));
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setBorder(null);

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Contraseña");

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Rol");

        actualizaTabla.setBackground(new java.awt.Color(51, 51, 51));
        actualizaTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/undo.png"))); // NOI18N
        actualizaTabla.setBorderPainted(false);
        actualizaTabla.setFocusPainted(false);
        actualizaTabla.setFocusable(false);
        actualizaTabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizaTabla.setMaximumSize(new java.awt.Dimension(50, 50));
        actualizaTabla.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizaTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbRoles, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscarUsu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(0, 117, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jToolBar1.setBackground(new java.awt.Color(51, 51, 51));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        tlBuscar.setBackground(new java.awt.Color(51, 51, 51));
        tlBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscando.png"))); // NOI18N
        tlBuscar.setBorderPainted(false);
        tlBuscar.setFocusPainted(false);
        tlBuscar.setFocusable(false);
        tlBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlBuscar.setMaximumSize(new java.awt.Dimension(50, 50));
        tlBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(tlBuscar);

        tlInsertarUsu.setBackground(new java.awt.Color(51, 51, 51));
        tlInsertarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/insert.png"))); // NOI18N
        tlInsertarUsu.setBorderPainted(false);
        tlInsertarUsu.setFocusPainted(false);
        tlInsertarUsu.setFocusable(false);
        tlInsertarUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlInsertarUsu.setMaximumSize(new java.awt.Dimension(50, 50));
        tlInsertarUsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlInsertarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlInsertarUsuActionPerformed(evt);
            }
        });
        jToolBar1.add(tlInsertarUsu);

        tlActuUsu.setBackground(new java.awt.Color(51, 51, 51));
        tlActuUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        tlActuUsu.setBorderPainted(false);
        tlActuUsu.setFocusPainted(false);
        tlActuUsu.setFocusable(false);
        tlActuUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlActuUsu.setMaximumSize(new java.awt.Dimension(50, 50));
        tlActuUsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlActuUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlActuUsuActionPerformed(evt);
            }
        });
        jToolBar1.add(tlActuUsu);

        tlEliminaUsu.setBackground(new java.awt.Color(51, 51, 51));
        tlEliminaUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        tlEliminaUsu.setBorderPainted(false);
        tlEliminaUsu.setFocusPainted(false);
        tlEliminaUsu.setFocusable(false);
        tlEliminaUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlEliminaUsu.setMaximumSize(new java.awt.Dimension(50, 50));
        tlEliminaUsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlEliminaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlEliminaUsuActionPerformed(evt);
            }
        });
        jToolBar1.add(tlEliminaUsu);

        jButton9.setBackground(new java.awt.Color(51, 51, 51));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(57, 57, 57));

        jScrollPane1.setBackground(new java.awt.Color(57, 57, 57));

        tablaUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        tablaUsuarios.setForeground(new java.awt.Color(204, 204, 204));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuarios.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setForeground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("Opciones");
        jMenu1.add(jSeparator1);

        btnInicio.setText("Volver al inicio");
        jMenu1.add(btnInicio);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(51, 51, 51));
        jMenu3.setForeground(new java.awt.Color(204, 204, 204));
        jMenu3.setText("Edicion");

        jMenuItem7.setText("Copiar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Cortar");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Pegar");
        jMenu3.add(jMenuItem9);

        jMenuItem14.setText("Borrar");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void tlBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlBuscarActionPerformed

    private void tlInsertarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlInsertarUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlInsertarUsuActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tlActuUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlActuUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlActuUsuActionPerformed

    private void tlEliminaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlEliminaUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlEliminaUsuActionPerformed

    private void actualizaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizaTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizaTablaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAñadeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAñadeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAñadeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAñadeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAñadeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizaTabla;
    public javax.swing.JButton btnBscarPro;
    public javax.swing.JMenuItem btnInicio;
    public javax.swing.JComboBox<Rol> cmbRoles;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JTable tablaUsuarios;
    public javax.swing.JButton tlActuUsu;
    public javax.swing.JButton tlBuscar;
    public javax.swing.JButton tlEliminaUsu;
    public javax.swing.JButton tlInsertarUsu;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtBuscarUsu;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
