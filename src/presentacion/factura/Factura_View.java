package presentacion.factura;

import Datos.Datos;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import logica.Factura;
import logica.Cliente;
import logica.Empresa;
import logica.Producto;
import presentacion.Factura_TableModel;
import presentacion.Producto_TableModel;
import presentacion.factura.Factura_Control;
import presentacion.factura.Factura_Modelo;

public class Factura_View extends javax.swing.JInternalFrame implements Observer {

    public Factura_View() {
        initComponents();
        
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Facturas = new javax.swing.JTable();
        tituloJLabel = new javax.swing.JLabel();
        Label_Cliente = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<>();
        Label_Empresa = new javax.swing.JLabel();
        Label_Cliente1 = new javax.swing.JLabel();
        jComboBox_Producto = new javax.swing.JComboBox<>();
        Button_AgregarProducto = new javax.swing.JToggleButton();
        Label_Cantidad = new javax.swing.JLabel();
        jTextField_CantidadProductos = new javax.swing.JTextField();
        Label_Moneda = new javax.swing.JLabel();
        Label_FormaPago = new javax.swing.JLabel();
        jComboBox_FormaPago = new javax.swing.JComboBox<>();
        Label_Observaciones = new javax.swing.JLabel();
        jTextField_Observaciones = new javax.swing.JTextField();
        jComboBox_Moneda = new javax.swing.JComboBox<>();
        jButton_Facturar = new javax.swing.JButton();
        jLabel1Empresa = new javax.swing.JLabel();
        CambiarAtributosEmpresaButton = new javax.swing.JButton();
        Label_FechaEmision = new javax.swing.JLabel();
        FechaemiciosnTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Productos = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        Table_Facturas.setBackground(new java.awt.Color(153, 255, 204));
        Table_Facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_Facturas.setOpaque(false);
        jScrollPane1.setViewportView(Table_Facturas);

        tituloJLabel.setBackground(new java.awt.Color(51, 255, 204));
        tituloJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        tituloJLabel.setText("Sistema de Facturación");
        tituloJLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloJLabel.setOpaque(true);

        Label_Cliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Cliente.setText("Cliente:");

        ComboBoxCliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        ComboBoxCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboBoxClienteMouseClicked(evt);
            }
        });
        ComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxClienteActionPerformed(evt);
            }
        });

        Label_Empresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Empresa.setText("Empresa:");

        Label_Cliente1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Cliente1.setText("Producto:");

        jComboBox_Producto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jComboBox_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ProductoActionPerformed(evt);
            }
        });

        Button_AgregarProducto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Button_AgregarProducto.setText("Agregar Prodcuto");
        Button_AgregarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button_AgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_AgregarProductoMouseClicked(evt);
            }
        });
        Button_AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarProductoActionPerformed(evt);
            }
        });

        Label_Cantidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Cantidad.setText("Cantidad:");

        jTextField_CantidadProductos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jTextField_CantidadProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CantidadProductosActionPerformed(evt);
            }
        });

        Label_Moneda.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Moneda.setText("Tipo de moneda:");

        Label_FormaPago.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_FormaPago.setText("Forma de pago:");

        jComboBox_FormaPago.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jComboBox_FormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));

        Label_Observaciones.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Observaciones.setText("Observaciones:");

        jTextField_Observaciones.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jTextField_Observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ObservacionesActionPerformed(evt);
            }
        });

        jComboBox_Moneda.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jComboBox_Moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colones", "Dolares" }));

        jButton_Facturar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jButton_Facturar.setText("Facturar");
        jButton_Facturar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacturarActionPerformed(evt);
            }
        });

        jLabel1Empresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1Empresa.setText("jLabel1");

        CambiarAtributosEmpresaButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        CambiarAtributosEmpresaButton.setText("Cambiar atributos");
        CambiarAtributosEmpresaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CambiarAtributosEmpresaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarAtributosEmpresaButtonMouseClicked(evt);
            }
        });
        CambiarAtributosEmpresaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarAtributosEmpresaButtonActionPerformed(evt);
            }
        });

        Label_FechaEmision.setText("FechaEmision");

        FechaemiciosnTextField.setText("yy/mm/dd");

        Table_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table_Productos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tituloJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Empresa)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CambiarAtributosEmpresaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Cantidad)
                                .addGap(68, 68, 68)
                                .addComponent(jTextField_CantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Button_AgregarProducto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jComboBox_Producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Cliente)
                                .addGap(82, 82, 82)
                                .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_FormaPago)
                                .addGap(25, 25, 25)
                                .addComponent(jComboBox_FormaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Moneda)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Observaciones)
                                    .addComponent(Label_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField_Observaciones)
                                    .addComponent(FechaemiciosnTextField))))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloJLabel)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Empresa)
                            .addComponent(jLabel1Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CambiarAtributosEmpresaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente)
                            .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_FormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_FormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_FechaEmision)
                            .addComponent(FechaemiciosnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_AgregarProductoActionPerformed

    private void jTextField_CantidadProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CantidadProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CantidadProductosActionPerformed

    private void jButton_FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturarActionPerformed
      
       
        
        
        
        
    }//GEN-LAST:event_jButton_FacturarActionPerformed

    private void jTextField_ObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ObservacionesActionPerformed
       
    }//GEN-LAST:event_jTextField_ObservacionesActionPerformed

    private void jComboBox_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ProductoActionPerformed
      
    }//GEN-LAST:event_jComboBox_ProductoActionPerformed

    private void ComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxClienteActionPerformed
        
    }//GEN-LAST:event_ComboBoxClienteActionPerformed

    private void ComboBoxClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxClienteMouseClicked
      
    }//GEN-LAST:event_ComboBoxClienteMouseClicked

    private void CambiarAtributosEmpresaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarAtributosEmpresaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambiarAtributosEmpresaButtonActionPerformed

    private void CambiarAtributosEmpresaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarAtributosEmpresaButtonMouseClicked

    }//GEN-LAST:event_CambiarAtributosEmpresaButtonMouseClicked

    private void Button_AgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AgregarProductoMouseClicked
//        double vces = Double.parseDouble(jTextField_CantidadProductos.getText());
//        if (vces > 0) {
//            for (int i = 0; i <vces;i++) {
//                control.agregarProducto(p1);
//            }
//        }
 carComboBoxCliente();
carComboBoxProducto();
    }//GEN-LAST:event_Button_AgregarProductoMouseClicked

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
            java.util.logging.Logger.getLogger(Factura_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_View().setVisible(true);
            }
        });
    }
    
    Factura_Control control;
    Factura_Modelo modelo;
    
    public void setControl(Factura_Control control){
        this.control =control;
    }

    public Factura_Control getControl() {
        return control;
    }
    
    public void setModelo(Factura_Modelo modelo){
        this.modelo = modelo;
        modelo.addObserver(this);
    }

    public Factura_Modelo getModelo() {
        return modelo;
    }

    @Override
    public void update(Observable o, Object o1) {
        Factura current = modelo.getCurrent();
        jTextField_Observaciones.setText(current.getObservaciones());
        FechaemiciosnTextField.setText(current.getFechaEmision());
        //jComboBox_FormaPago.setText(current.getMedida());
        Table_Facturas.setModel(new Factura_TableModel(modelo.getLista()));
        Table_Productos.setModel(new Producto_TableModel(modelo.getListaProducto()));
        
//        this.carComboBoxCliente();
//        this.carComboBoxProducto();
    }

    public void CargaEmpresa(){
//                List<Empresa> Eaux = new ArrayList<>();
//        try {
//            Datos c = control.load("DataBase.xml");
//            Eaux = c.getEmpresas();
//            modelo.setListaEmpresa(Eaux);
//            this.ComboBoxCliente.setModel(new DefaultComboBoxModel<Cliente>(modelo.().toArray(new Cliente[0])));
//            //     this.ComboBoxCliente.setSelectedItem(c.getCliente());
//        } catch (Exception ex) {
//            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        jLabel1Empresa
    }
    
    
    public void carComboBoxCliente() {
        List<Cliente> laux = new ArrayList<>();
        try {
            Datos c = control.load("DataBase.xml");
            laux = c.getClientes();
            modelo.setListaCliente(laux);
            this.ComboBoxCliente.setModel(new DefaultComboBoxModel<Cliente>(modelo.getListaCliente().toArray(new Cliente[0])));
            //     this.ComboBoxCliente.setSelectedItem(c.getCliente());
        } catch (Exception ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        public void carComboBoxProducto() {            
            
        List<Producto> Paux = new ArrayList<>();
        try {
            Datos c = control.load("DataBase.xml");
            Paux = c.getProductos();
            modelo.setListaProducto(Paux);
            this.jComboBox_Producto.setModel(new DefaultComboBoxModel<Producto>(modelo.getListaProducto().toArray(new Producto[0])));
            //     this.ComboBoxCliente.setSelectedItem(c.getCliente());
        } catch (Exception ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_AgregarProducto;
    private javax.swing.JButton CambiarAtributosEmpresaButton;
    private javax.swing.JComboBox<Cliente> ComboBoxCliente;
    private javax.swing.JTextField FechaemiciosnTextField;
    private javax.swing.JLabel Label_Cantidad;
    private javax.swing.JLabel Label_Cliente;
    private javax.swing.JLabel Label_Cliente1;
    private javax.swing.JLabel Label_Empresa;
    private javax.swing.JLabel Label_FechaEmision;
    private javax.swing.JLabel Label_FormaPago;
    private javax.swing.JLabel Label_Moneda;
    private javax.swing.JLabel Label_Observaciones;
    private javax.swing.JTable Table_Facturas;
    private javax.swing.JTable Table_Productos;
    private javax.swing.JButton jButton_Facturar;
    private javax.swing.JComboBox<String> jComboBox_FormaPago;
    private javax.swing.JComboBox<String> jComboBox_Moneda;
    private javax.swing.JComboBox<Producto> jComboBox_Producto;
    private javax.swing.JLabel jLabel1Empresa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_CantidadProductos;
    private javax.swing.JTextField jTextField_Observaciones;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables
}