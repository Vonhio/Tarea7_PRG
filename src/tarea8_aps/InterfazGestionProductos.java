package tarea8_aps;

public class InterfazGestionProductos extends javax.swing.JFrame {

    public InterfazGestionProductos() {
        initComponents();
    }

    private void limpiarCampos() {
        codigoTf.setText("");
        nombreTf.setText("");
        cantidadTf.setText("");
        descripcionTf.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoLb = new javax.swing.JLabel();
        nombreLb = new javax.swing.JLabel();
        cantidadLb = new javax.swing.JLabel();
        descripcionLb = new javax.swing.JLabel();
        codigoTf = new javax.swing.JTextField();
        cantidadTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        descripcionTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoTa = new javax.swing.JTextArea();
        insertarBt = new javax.swing.JButton();
        modificarBt = new javax.swing.JButton();
        buscarBt = new javax.swing.JButton();
        borrarBt = new javax.swing.JButton();
        mostrarBt = new javax.swing.JButton();
        salirBt = new javax.swing.JButton();
        infoLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoLb.setText("Codigo");

        nombreLb.setText("Nombre");

        cantidadLb.setText("Cantidad");

        descripcionLb.setText("Descripción");

        codigoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTfActionPerformed(evt);
            }
        });

        listadoTa.setColumns(20);
        listadoTa.setRows(5);
        jScrollPane1.setViewportView(listadoTa);

        insertarBt.setText("Insertar");
        insertarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtActionPerformed(evt);
            }
        });

        modificarBt.setText("Modificar");
        modificarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtActionPerformed(evt);
            }
        });

        buscarBt.setText("Buscar");
        buscarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtActionPerformed(evt);
            }
        });

        borrarBt.setText("Borrar");
        borrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtActionPerformed(evt);
            }
        });

        mostrarBt.setText("Mostrar");
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        salirBt.setText("Salir");
        salirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtActionPerformed(evt);
            }
        });

        infoLb.setText("Bienvenido al gestor de Articulos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mostrarBt)
                .addGap(151, 151, 151)
                .addComponent(salirBt)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLb)
                            .addComponent(nombreLb)
                            .addComponent(cantidadLb)
                            .addComponent(descripcionLb))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadTf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modificarBt)
                                .addGap(59, 59, 59)
                                .addComponent(borrarBt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertarBt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscarBt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(infoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLb)
                            .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLb)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadLb)
                            .addComponent(cantidadTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionLb)
                            .addComponent(descripcionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarBt)
                    .addComponent(buscarBt))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarBt)
                    .addComponent(salirBt))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarBt)
                    .addComponent(borrarBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(infoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed
        int codigo = Integer.parseInt(codigoTf.getText());
        String nombre = nombreTf.getText();
        int cantidad = Integer.parseInt(cantidadTf.getText());
        String descripcion = descripcionTf.getText();

        Productos p1 = new Productos(codigo, nombre, cantidad, descripcion);

        GestorBD db = new GestorBD();
        String mensaje = db.alta(p1);
        infoLb.setText(mensaje);
        limpiarCampos();
    }//GEN-LAST:event_insertarBtActionPerformed

    private void codigoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTfActionPerformed

    private void buscarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtActionPerformed
        int codigo = Integer.parseInt(codigoTf.getText());
        GestorBD db = new GestorBD();
        Productos p1 = db.buscar(codigo);

        if (p1 != null) {
            nombreTf.setText(p1.getNombre());
            cantidadTf.setText(String.valueOf(p1.getCantidad()));
            descripcionTf.setText(p1.getDescripcion());
        } else {
            infoLb.setText("No se ha encontrado ningun producto con dicho codigo.");
        }

    }//GEN-LAST:event_buscarBtActionPerformed

    private void modificarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtActionPerformed
        try {
            int codigo = Integer.parseInt(codigoTf.getText());
            String nombre = nombreTf.getText();
            int cantidad = Integer.parseInt(cantidadTf.getText());
            String descripcion = descripcionTf.getText();

            if (codigoTf.getText().isEmpty() || nombre.isEmpty() || cantidadTf.getText().isEmpty() || descripcion.isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            Productos p1 = new Productos(codigo, nombre, cantidad, descripcion);

            GestorBD db = new GestorBD();
            String mensaje = db.Modificar(codigo, nombre, cantidad, descripcion);
            infoLb.setText(mensaje);
            limpiarCampos();
        } catch (NumberFormatException e) {
            infoLb.setText("Error: Uno o más campos no son números enteros.");
        } catch (IllegalArgumentException e) {
            infoLb.setText("Error: " + e.getMessage());
        }

    }//GEN-LAST:event_modificarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        Productos p1 = new Productos();

        GestorBD db = new GestorBD();
        String mensaje = db.Mostrar();
        listadoTa.setText(mensaje);
        limpiarCampos();
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed
        int codigo = Integer.parseInt(codigoTf.getText());

        Productos p1 = new Productos(codigo, null, 0, null);

        GestorBD db = new GestorBD();
        String mensaje = db.borrar(codigo);
        infoLb.setText(mensaje);
        limpiarCampos();
    }//GEN-LAST:event_borrarBtActionPerformed

    private void salirBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGestionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBt;
    private javax.swing.JButton buscarBt;
    private javax.swing.JLabel cantidadLb;
    private javax.swing.JTextField cantidadTf;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigoTf;
    private javax.swing.JLabel descripcionLb;
    private javax.swing.JTextField descripcionTf;
    private javax.swing.JLabel infoLb;
    private javax.swing.JButton insertarBt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listadoTa;
    private javax.swing.JButton modificarBt;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JButton salirBt;
    // End of variables declaration//GEN-END:variables
}
