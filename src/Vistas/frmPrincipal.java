/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author User
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
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
        tablaProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbFiltrar = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        btnHacerFiltro = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        actualizaTabla = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        tlBuscar = new javax.swing.JButton();
        tlVender = new javax.swing.JButton();
        tlPedidos = new javax.swing.JButton();
        tlInventario = new javax.swing.JButton();
        tlGesPro = new javax.swing.JButton();
        tlUsuarios = new javax.swing.JButton();
        tlInformacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnMenuInventario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnMenuUsu = new javax.swing.JMenuItem();
        btnMenuPro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnMenuReVenta = new javax.swing.JMenuItem();
        btnMenuRePro = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        btnMenuCerrarSesion = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnMenuCerrarSistem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WindMill Inventory");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        jScrollPane1.setOpaque(false);

        tablaProductos.setBackground(new java.awt.Color(102, 102, 102));
        tablaProductos.setForeground(new java.awt.Color(204, 204, 204));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos.setGridColor(new java.awt.Color(51, 51, 51));
        tablaProductos.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 153, 153)));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 231, 231));
        jLabel1.setText("Buscar producto");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(231, 231, 231));
        jLabel2.setText("Filtrar producto");

        cmbFiltrar.setBackground(new java.awt.Color(51, 51, 51));
        cmbFiltrar.setForeground(new java.awt.Color(231, 231, 231));
        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Codigo", "Nombre", "Vencimiento", "Valor", "Cantidad" }));

        txtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscar.setForeground(new java.awt.Color(231, 231, 231));
        txtBuscar.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setForeground(new java.awt.Color(231, 231, 231));
        jLabel3.setText("Información de producto");

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);

        btnHacerFiltro.setBackground(new java.awt.Color(51, 51, 51));
        btnHacerFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filter.png"))); // NOI18N
        btnHacerFiltro.setToolTipText("");
        btnHacerFiltro.setBorder(null);
        btnHacerFiltro.setBorderPainted(false);
        btnHacerFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHacerFiltro.setFocusPainted(false);
        btnHacerFiltro.setFocusable(false);

        btnVender.setBackground(new java.awt.Color(0, 0, 0));
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setText("Realizar venta");
        btnVender.setBorder(null);
        btnVender.setBorderPainted(false);
        btnVender.setFocusPainted(false);
        btnVender.setFocusable(false);

        btnRecibir.setBackground(new java.awt.Color(0, 0, 0));
        btnRecibir.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibir.setText("Registrar un pedido");
        btnRecibir.setBorder(null);
        btnRecibir.setBorderPainted(false);
        btnRecibir.setFocusPainted(false);
        btnRecibir.setFocusable(false);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFiltrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(actualizaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHacerFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecibir, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(actualizaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHacerFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jToolBar1.setBackground(new java.awt.Color(51, 51, 51));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setMargin(new java.awt.Insets(0, 4, 0, 0));

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

        tlVender.setBackground(new java.awt.Color(51, 51, 51));
        tlVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        tlVender.setBorder(null);
        tlVender.setBorderPainted(false);
        tlVender.setFocusPainted(false);
        tlVender.setFocusable(false);
        tlVender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlVender.setMaximumSize(new java.awt.Dimension(50, 50));
        tlVender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlVenderActionPerformed(evt);
            }
        });
        jToolBar1.add(tlVender);

        tlPedidos.setBackground(new java.awt.Color(51, 51, 51));
        tlPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedido.png"))); // NOI18N
        tlPedidos.setBorder(null);
        tlPedidos.setBorderPainted(false);
        tlPedidos.setFocusable(false);
        tlPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlPedidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tlPedidos);

        tlInventario.setBackground(new java.awt.Color(51, 51, 51));
        tlInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orden.png"))); // NOI18N
        tlInventario.setBorder(null);
        tlInventario.setBorderPainted(false);
        tlInventario.setFocusPainted(false);
        tlInventario.setFocusable(false);
        tlInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlInventario.setMaximumSize(new java.awt.Dimension(50, 50));
        tlInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlInventarioActionPerformed(evt);
            }
        });
        jToolBar1.add(tlInventario);

        tlGesPro.setBackground(new java.awt.Color(51, 51, 51));
        tlGesPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicamento.png"))); // NOI18N
        tlGesPro.setBorder(null);
        tlGesPro.setBorderPainted(false);
        tlGesPro.setFocusPainted(false);
        tlGesPro.setFocusable(false);
        tlGesPro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlGesPro.setMaximumSize(new java.awt.Dimension(50, 50));
        tlGesPro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlGesPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlGesProActionPerformed(evt);
            }
        });
        jToolBar1.add(tlGesPro);

        tlUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        tlUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo.png"))); // NOI18N
        tlUsuarios.setBorder(null);
        tlUsuarios.setBorderPainted(false);
        tlUsuarios.setFocusPainted(false);
        tlUsuarios.setFocusable(false);
        tlUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlUsuarios.setMaximumSize(new java.awt.Dimension(50, 50));
        tlUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlUsuariosActionPerformed(evt);
            }
        });
        jToolBar1.add(tlUsuarios);

        tlInformacion.setBackground(new java.awt.Color(51, 51, 51));
        tlInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        tlInformacion.setBorder(null);
        tlInformacion.setBorderPainted(false);
        tlInformacion.setFocusPainted(false);
        tlInformacion.setFocusable(false);
        tlInformacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlInformacion.setMaximumSize(new java.awt.Dimension(50, 50));
        tlInformacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlInformacionActionPerformed(evt);
            }
        });
        jToolBar1.add(tlInformacion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(237, 237, 237));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Opciones");

        btnMenuInventario.setText("Ver inventario");
        jMenu1.add(btnMenuInventario);
        jMenu1.add(jSeparator2);

        btnMenuUsu.setText("Gestion de usuarios");
        btnMenuUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuUsuActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuUsu);

        btnMenuPro.setText("Gestion de productos");
        btnMenuPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuPro);
        jMenu1.add(jSeparator1);

        btnMenuReVenta.setText("Realizar venta");
        btnMenuReVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuReVentaActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuReVenta);

        btnMenuRePro.setText("Registrar pedido");
        btnMenuRePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuReProActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuRePro);
        jMenu1.add(jSeparator5);

        btnMenuCerrarSesion.setText("Cerrar sesión");
        btnMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuCerrarSesion);
        jMenu1.add(jSeparator3);

        btnMenuCerrarSistem.setText("Exit");
        jMenu1.add(btnMenuCerrarSistem);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Edicion");

        jMenuItem7.setText("Copiar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Cortar");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Pegar");
        jMenu2.add(jMenuItem9);

        jMenuItem14.setText("Borrar");
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Ayuda");

        jMenuItem10.setText("Manual de usuario");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Acerca de");

        jMenuItem11.setText("Información");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuUsuActionPerformed

    private void btnMenuProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuProActionPerformed

    private void btnMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuCerrarSesionActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void tlBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlBuscarActionPerformed

    private void tlVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlVenderActionPerformed

    private void tlInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlInventarioActionPerformed

    private void tlGesProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlGesProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlGesProActionPerformed

    private void tlUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlUsuariosActionPerformed

    private void tlInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlInformacionActionPerformed

    private void btnMenuReVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuReVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuReVentaActionPerformed

    private void btnMenuReProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuReProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuReProActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizaTabla;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnHacerFiltro;
    public javax.swing.JMenuItem btnMenuCerrarSesion;
    public javax.swing.JMenuItem btnMenuCerrarSistem;
    public javax.swing.JMenuItem btnMenuInventario;
    public javax.swing.JMenuItem btnMenuPro;
    public javax.swing.JMenuItem btnMenuRePro;
    public javax.swing.JMenuItem btnMenuReVenta;
    public javax.swing.JMenuItem btnMenuUsu;
    public javax.swing.JButton btnRecibir;
    public javax.swing.JButton btnVender;
    public javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem10;
    public javax.swing.JMenuItem jMenuItem11;
    public javax.swing.JMenuItem jMenuItem14;
    public javax.swing.JMenuItem jMenuItem7;
    public javax.swing.JMenuItem jMenuItem8;
    public javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JTable tablaProductos;
    public javax.swing.JButton tlBuscar;
    public javax.swing.JButton tlGesPro;
    public javax.swing.JButton tlInformacion;
    public javax.swing.JButton tlInventario;
    public javax.swing.JButton tlPedidos;
    public javax.swing.JButton tlUsuarios;
    public javax.swing.JButton tlVender;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
