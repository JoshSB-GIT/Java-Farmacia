/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.ConsultasProveedor;
import Modelo.ConsultasUsuario;
import Modelo.Proveedor;
import Modelo.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class frmIngresos extends javax.swing.JFrame {

    /**
     * Creates new form frmIngresos
     */
    public frmIngresos() {
        initComponents();
        llenarCombo();
        llenarComboUsu();
    }
    
    private void llenarCombo(){
        ConsultasProveedor modPro = new ConsultasProveedor();
        ArrayList<Proveedor> lPro = modPro.getProveedor();
        
        for (int i = 0; i < lPro.size(); i++) {
            cmbProveedores.addItem(new Proveedor(lPro.get(i).getIdProveedor(), lPro.get(i).getNombre(), lPro.get(i).getDescripcion()));
        }
    }
    
     private void llenarComboUsu(){
         ConsultasUsuario modUsu = new ConsultasUsuario();
        ArrayList<Usuarios> lUsu = modUsu.getUsuarios();
        
        for (int i = 0; i < lUsu.size(); i++) {
            cmbUsuarios.addItem(new Usuarios(lUsu.get(i).getIdUsuario(), lUsu.get(i).getNombre(), lUsu.get(i).getApellido(), lUsu.get(i).getTelefono(), lUsu.get(i).getCorreo(), lUsu.get(i).getEstado(), lUsu.get(i).getContraseña(), lUsu.get(i).getRol()));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPro = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        tlBuscar = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtTotalIngreso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarPedido = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbUsuarios = new javax.swing.JComboBox<>();
        cmbProveedores = new javax.swing.JComboBox<>();
        actualizaTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tablaPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jToolBar1.setBackground(new java.awt.Color(51, 51, 51));
        jToolBar1.setBorder(null);
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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Código del producto");

        txtCodigoPro.setBackground(new java.awt.Color(51, 51, 51));
        txtCodigoPro.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoPro.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(102, 153, 255));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Escribe tu ID de usuario");

        txtEstado.setBackground(new java.awt.Color(51, 51, 51));
        txtEstado.setForeground(new java.awt.Color(204, 204, 204));
        txtEstado.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(102, 153, 255));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Estado del producto (Opcional)");

        txtTotalIngreso.setBackground(new java.awt.Color(51, 51, 51));
        txtTotalIngreso.setForeground(new java.awt.Color(204, 204, 204));
        txtTotalIngreso.setBorder(null);

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Total de ingreso");

        jSeparator10.setBackground(new java.awt.Color(102, 153, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Recibir pedidos");

        btnGuardarPedido.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardarPedido.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardarPedido.setText("Guardar pedido");
        btnGuardarPedido.setBorder(null);
        btnGuardarPedido.setBorderPainted(false);
        btnGuardarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPedido.setFocusPainted(false);
        btnGuardarPedido.setFocusable(false);

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Proveedor");

        cmbUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        cmbUsuarios.setForeground(new java.awt.Color(204, 204, 204));
        cmbUsuarios.setBorder(null);
        cmbUsuarios.setFocusable(false);

        cmbProveedores.setBackground(new java.awt.Color(51, 51, 51));
        cmbProveedores.setForeground(new java.awt.Color(204, 204, 204));
        cmbProveedores.setBorder(null);
        cmbProveedores.setFocusable(false);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(actualizaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnGuardarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigoPro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalIngreso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbProveedores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(actualizaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnGuardarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tlBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlBuscarActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizaTabla;
    public javax.swing.JButton btnGuardarPedido;
    public javax.swing.JComboBox<Proveedor> cmbProveedores;
    public javax.swing.JComboBox<Usuarios> cmbUsuarios;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JTable tablaPro;
    public javax.swing.JButton tlBuscar;
    public javax.swing.JTextField txtCodigoPro;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtTotalIngreso;
    // End of variables declaration//GEN-END:variables
}