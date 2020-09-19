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
import presentacion.cliente.Cliente_View;
import presentacion.factura.Factura_Control;
import presentacion.factura.Factura_Modelo;

public class Factura_View extends javax.swing.JInternalFrame implements Observer {

     List<Producto> productos = new ArrayList<>();
    Factura factura = new Factura();
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
        ComboBoxProducto = new javax.swing.JComboBox<>();
        ButtonAgregarProducto = new javax.swing.JToggleButton();
        Label_Cantidad = new javax.swing.JLabel();
        TextFieldCantidadProductos = new javax.swing.JTextField();
        Label_FormaPago = new javax.swing.JLabel();
        ComboBoxFormaPago = new javax.swing.JComboBox<>();
        Label_Observaciones = new javax.swing.JLabel();
        TextFieldObservaciones = new javax.swing.JTextField();
        jButton_Facturar = new javax.swing.JButton();
        ButtonCambiarAtributosEmpresa = new javax.swing.JButton();
        Label_FechaEmision = new javax.swing.JLabel();
        FechaemisicionTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Productos = new javax.swing.JTable();
        ComboBoxEmpresa = new javax.swing.JComboBox<>();
        Load = new javax.swing.JButton();
        store = new javax.swing.JButton();

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

        ComboBoxProducto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        ComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProductoActionPerformed(evt);
            }
        });

        ButtonAgregarProducto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        ButtonAgregarProducto.setText("Agregar Producto");
        ButtonAgregarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAgregarProductoMouseClicked(evt);
            }
        });
        ButtonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarProductoActionPerformed(evt);
            }
        });

        Label_Cantidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Cantidad.setText("Cantidad:");

        TextFieldCantidadProductos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        TextFieldCantidadProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCantidadProductosActionPerformed(evt);
            }
        });

        Label_FormaPago.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_FormaPago.setText("Forma de pago:");

        ComboBoxFormaPago.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        ComboBoxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));

        Label_Observaciones.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Observaciones.setText("Observaciones:");

        TextFieldObservaciones.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TextFieldObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldObservacionesActionPerformed(evt);
            }
        });

        jButton_Facturar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jButton_Facturar.setText("Facturar");
        jButton_Facturar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacturarActionPerformed(evt);
            }
        });

        ButtonCambiarAtributosEmpresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        ButtonCambiarAtributosEmpresa.setText("Cambiar atributos");
        ButtonCambiarAtributosEmpresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCambiarAtributosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCambiarAtributosEmpresaMouseClicked(evt);
            }
        });
        ButtonCambiarAtributosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCambiarAtributosEmpresaActionPerformed(evt);
            }
        });

        Label_FechaEmision.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_FechaEmision.setText("Fecha de emision:");

        FechaemisicionTextField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        FechaemisicionTextField.setText("yy/mm/dd");

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

        ComboBoxEmpresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N

        Load.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Load.setText("Load");
        Load.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        store.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        store.setText("Store");
        store.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Empresa)
                                .addGap(31, 31, 31)
                                .addComponent(ComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonCambiarAtributosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addComponent(FechaemisicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Cantidad)
                                    .addComponent(Label_FormaPago)
                                    .addComponent(Label_Observaciones))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextFieldCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(ButtonAgregarProducto))
                                    .addComponent(TextFieldObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Cliente)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloJLabel)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Empresa)
                            .addComponent(ButtonCambiarAtributosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente)
                            .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_FormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_FechaEmision)
                            .addComponent(FechaemisicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarProductoActionPerformed
        double vces = Double.parseDouble(TextFieldCantidadProductos.getText());
            
        if (vces > 0) {
            for (int i = 0; i <vces;i++) {
             
               factura.setCantidad(vces);
                productos.add((Producto)ComboBoxProducto.getSelectedItem());    
              factura.setProductos(productos);
            }     
        }
      
    }//GEN-LAST:event_ButtonAgregarProductoActionPerformed

    private void TextFieldCantidadProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCantidadProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCantidadProductosActionPerformed

    private void jButton_FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturarActionPerformed
       if(TextFieldObservaciones.getText().isEmpty() ||FechaemisicionTextField.getText().isEmpty() ){
          return;
         }
        double im =0.0;  
       double sub = 0.0;
       double to = 0.0;
      String formapago = "";
      factura.setFechaEmision(FechaemisicionTextField.getText());
      factura.setObservaciones(TextFieldObservaciones.getText());
      factura.setNumeroFactura(1);  
      if(ComboBoxFormaPago.getSelectedIndex()== 0 ){
           formapago = "Efectivo";
      }
      if(ComboBoxFormaPago.getSelectedIndex()== 1 ){
           formapago = "Tarjeta";
      }
      factura.setFormadePago(formapago);
      factura.setCliente((Cliente)ComboBoxCliente.getSelectedItem());
      factura.setEmpresa((Empresa)ComboBoxEmpresa.getSelectedItem());
      factura.setProducto((Producto)ComboBoxProducto.getSelectedItem());
       im= factura.impuestos(productos);
       sub = factura.subtotal(productos);
       to = factura.totalNeto(productos);
       factura.setImpuestos(im);
       factura.setSubtotal(sub);
       factura.setTotalNeto(to);
      try {
            control.agregar(factura);
        } catch (Exception ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jButton_FacturarActionPerformed

    private void TextFieldObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldObservacionesActionPerformed
       
    }//GEN-LAST:event_TextFieldObservacionesActionPerformed

    private void ComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProductoActionPerformed
      
    }//GEN-LAST:event_ComboBoxProductoActionPerformed

    private void ComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxClienteActionPerformed
        
    }//GEN-LAST:event_ComboBoxClienteActionPerformed

    private void ComboBoxClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxClienteMouseClicked
      
    }//GEN-LAST:event_ComboBoxClienteMouseClicked

    private void ButtonCambiarAtributosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCambiarAtributosEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCambiarAtributosEmpresaActionPerformed

    private void ButtonCambiarAtributosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCambiarAtributosEmpresaMouseClicked

    }//GEN-LAST:event_ButtonCambiarAtributosEmpresaMouseClicked

    private void ButtonAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAgregarProductoMouseClicked


    }//GEN-LAST:event_ButtonAgregarProductoMouseClicked

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        carComboBoxCliente();
        carComboBoxProducto();
        CargaEmpresa();        // TODO add your handling code here:
    }//GEN-LAST:event_LoadActionPerformed

    private void storeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeActionPerformed
       try {   
            control.store("BaseData.xml");        // TODO add your handling code here:
        } 
        catch (Exception ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_storeActionPerformed

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
        TextFieldObservaciones.setText(current.getObservaciones());
        FechaemisicionTextField.setText(current.getFechaEmision());
        Table_Facturas.setModel(new Factura_TableModel(modelo.getLista()));
        Table_Productos.setModel(new Producto_TableModel(modelo.getListaProducto()));
        TextFieldCantidadProductos.setText(current.getString_Cantidad());
    }
    
    
public void CargaEmpresa(){
                List<Empresa> Eaux = new ArrayList<>();
        try {
            Datos c = control.load("DataBase.xml");
            Eaux = c.getEmpresas();
            modelo.setListaEmpresa(Eaux);
            this.ComboBoxEmpresa.setModel(new DefaultComboBoxModel<Empresa>(modelo.getListaEmpresa().toArray(new Empresa[0])));         
        } catch (Exception ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        
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
            this.ComboBoxProducto.setModel(new DefaultComboBoxModel<Producto>(modelo.getListaProducto().toArray(new Producto[0])));
            //     this.ComboBoxCliente.setSelectedItem(c.getCliente());
        } catch (Exception ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonAgregarProducto;
    private javax.swing.JButton ButtonCambiarAtributosEmpresa;
    private javax.swing.JComboBox<Cliente> ComboBoxCliente;
    private javax.swing.JComboBox<Empresa> ComboBoxEmpresa;
    private javax.swing.JComboBox<String> ComboBoxFormaPago;
    private javax.swing.JComboBox<Producto> ComboBoxProducto;
    private javax.swing.JTextField FechaemisicionTextField;
    private javax.swing.JLabel Label_Cantidad;
    private javax.swing.JLabel Label_Cliente;
    private javax.swing.JLabel Label_Cliente1;
    private javax.swing.JLabel Label_Empresa;
    private javax.swing.JLabel Label_FechaEmision;
    private javax.swing.JLabel Label_FormaPago;
    private javax.swing.JLabel Label_Observaciones;
    private javax.swing.JButton Load;
    private javax.swing.JTable Table_Facturas;
    private javax.swing.JTable Table_Productos;
    private javax.swing.JTextField TextFieldCantidadProductos;
    private javax.swing.JTextField TextFieldObservaciones;
    private javax.swing.JButton jButton_Facturar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton store;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables
}