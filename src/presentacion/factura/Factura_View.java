package presentacion.factura;

import Datos.Datos;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import logica.Factura;
import logica.Cliente;
import logica.Empresa;
import logica.Producto;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import presentacion.Factura_TableModel;
import presentacion.Producto_TableModel;


public class Factura_View extends javax.swing.JInternalFrame implements Observer {
    double aux = 0.0;
     List<Producto> productos;
    Factura facturaAux ;
    double vces = 0.0;
     Producto p = new Producto();
    
    public Factura_View() {
        initComponents();
        productos = new ArrayList<>();
        facturaAux = new Factura();
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
        Label_FechaEmision = new javax.swing.JLabel();
        FechaemisicionTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Productos = new javax.swing.JTable();
        ComboBoxEmpresa = new javax.swing.JComboBox<>();
        Load = new javax.swing.JButton();
        store = new javax.swing.JButton();
        Numero = new javax.swing.JLabel();
        NumerodeFactura = new javax.swing.JTextField();

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
        ComboBoxEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEmpresaActionPerformed(evt);
            }
        });

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

        Numero.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Numero.setText("Numero de factura:");

        NumerodeFactura.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        NumerodeFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerodeFacturaActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FechaemisicionTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Numero)
                                .addGap(64, 64, 64)
                                .addComponent(NumerodeFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_Empresa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_Observaciones)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_FormaPago, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Label_Cantidad)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ComboBoxFormaPago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextFieldObservaciones)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(TextFieldCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                            .addComponent(ButtonAgregarProducto))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_Cliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(44, 44, Short.MAX_VALUE)
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero)
                            .addComponent(NumerodeFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Empresa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Cliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
     
       vces = Double.parseDouble(TextFieldCantidadProductos.getText());
//        p.setCantidad(Double.parseDouble(TextFieldCantidadProductos.getText()));
        p = (Producto)ComboBoxProducto.getSelectedItem();       
                facturaAux.linea(p,vces);
                productos.add(p);
    }//GEN-LAST:event_ButtonAgregarProductoActionPerformed

    private void TextFieldCantidadProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCantidadProductosActionPerformed
    }//GEN-LAST:event_TextFieldCantidadProductosActionPerformed

    private void jButton_FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturarActionPerformed
        if (TextFieldObservaciones.getText().isEmpty() || FechaemisicionTextField.getText().isEmpty()) {
            return;
        }    

        String formapago = "";
         List<Producto> productosAux= new ArrayList<>();
        if (ComboBoxFormaPago.getSelectedIndex() == 0) {
            formapago = "Efectivo";
        }
        if (ComboBoxFormaPago.getSelectedIndex() == 1) {
            formapago = "Tarjeta";
        }

        double im =  facturaAux.impuestos(productos);
        double sub = facturaAux.subtotal(productos);
        double to = facturaAux.totalNeto(productos);
        productosAux.addAll(productos);
        
        
         
        facturaAux = new Factura(FechaemisicionTextField.getText(), NumerodeFactura.getText(), (Empresa) ComboBoxEmpresa.getSelectedItem(), (Cliente) ComboBoxCliente.getSelectedItem(), (Producto) ComboBoxProducto.getSelectedItem(), TextFieldObservaciones.getText(), formapago, im, sub, to,productosAux);


        try {
            control.agregar(facturaAux);
            this.crearXmlFactura(im, sub, to);
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

    private void NumerodeFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerodeFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumerodeFacturaActionPerformed

    private void ComboBoxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEmpresaActionPerformed

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
        ComboBoxCliente.setSelectedItem(current.getCliente());
        ComboBoxEmpresa.setSelectedItem(current.getEmpresa());
        ComboBoxProducto.setSelectedItem(current.getProducto());
        NumerodeFactura.setText(current.getNumeroFactura());
        TextFieldCantidadProductos.setText(current.getNumeroFactura());
        ComboBoxFormaPago.setSelectedItem(current.getFormadePago());
        
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
    private javax.swing.JLabel Numero;
    private javax.swing.JTextField NumerodeFactura;
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


 
 public void crearXmlFactura(double impuesto, double subtotal, double total1) throws ParserConfigurationException, TransformerConfigurationException {
        double im ;
        double sub ;
        double to ;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;

            builder = factory.newDocumentBuilder();

            DOMImplementation implementation = builder.getDOMImplementation();
            Document documento = implementation.createDocument(null, "Factura", null);
            documento.setXmlVersion("1.0");

            Element Facturaelectronica = documento.createElement("FacturaElectronica");

            Element emisor = documento.createElement("Emisor");
            Element receptor = documento.createElement("Receptor");
            Element factura = documento.createElement("Factura");
            Element ubicacion = documento.createElement("Ubicacion");

            Element FechaEmision = documento.createElement("FechaEmision");
            Text textFechaEmision = documento.createTextNode(this.facturaAux.getFechaEmision());
            FechaEmision.appendChild(textFechaEmision);
            Facturaelectronica.appendChild(FechaEmision);

            Element FormadePago = documento.createElement("FormadePago");
            Text textFormadePago = documento.createTextNode(this.facturaAux.getFormadePago());
            FormadePago.appendChild(textFormadePago);
            Facturaelectronica.appendChild(FormadePago);

            Element Observaciones = documento.createElement("Observaciones");
            Text textObservaciones = documento.createTextNode(this.facturaAux.getObservaciones());
            Observaciones.appendChild(textObservaciones);
            Facturaelectronica.appendChild(Observaciones);

            //------------------Emisor-------------------------------------
            Element NombreComercial = documento.createElement("Nombre");
            Text textNombreComercial = documento.createTextNode(this.facturaAux.getEmpresa().getNombreComercial());
            NombreComercial.appendChild(textNombreComercial);
            emisor.appendChild(NombreComercial);

            Element ID = documento.createElement("Identificacion");
            Text textID = documento.createTextNode(this.facturaAux.getEmpresa().getId());
            ID.appendChild(textID);
            emisor.appendChild(ID);

            Element Ubicacion = documento.createElement("Ubicacion");
            Text textUbicacion = documento.createTextNode(this.facturaAux.getEmpresa().getUbicacion());
            Ubicacion.appendChild(textUbicacion);
            emisor.appendChild(Ubicacion);

            Element Correo = documento.createElement("Correo");
            Text textCorreo = documento.createTextNode(this.facturaAux.getEmpresa().getCorreo());
            Correo.appendChild(textCorreo);
            emisor.appendChild(Correo);

            Element Fax = documento.createElement("Fax");
            Text textFax = documento.createTextNode(this.facturaAux.getEmpresa().getFax());
            Correo.appendChild(textFax);
            emisor.appendChild(Fax);
            Facturaelectronica.appendChild(emisor);

            //-----------------Receptor-------------------------------------
            Element Nombre1 = documento.createElement("Nombre");
            Text textNombre1 = documento.createTextNode(this.facturaAux.getCliente().getNombre());
            Nombre1.appendChild(textNombre1);
            receptor.appendChild(Nombre1);

            Element Identificacion = documento.createElement("Identificacion");
            Text textIdentificacion = documento.createTextNode(this.facturaAux.getCliente().getId());
            Identificacion.appendChild(textIdentificacion);
            receptor.appendChild(Identificacion);

            Element Correo1 = documento.createElement("Correo");
            Text textCorreo1 = documento.createTextNode(this.facturaAux.getCliente().getCorreo());
            Correo1.appendChild(textCorreo1);
            receptor.appendChild(Correo1);

            Element Provincia = documento.createElement("Provincia");
            Text textProvincia = documento.createTextNode(this.facturaAux.getCliente().getProvincia());
            Provincia.appendChild(textProvincia);
            ubicacion.appendChild(Provincia);

            Element Canton = documento.createElement("Canton");
            Text textCanton = documento.createTextNode(this.facturaAux.getCliente().getCanton());
            Canton.appendChild(textCanton);
            ubicacion.appendChild(Canton);

            Element Distrito = documento.createElement("Distrito");
            Text textDistrito = documento.createTextNode(this.facturaAux.getCliente().getDistrito());
            Distrito.appendChild(textDistrito);
            ubicacion.appendChild(Distrito);

            Element Telefono = documento.createElement("Telefono");
            Text textTelefono = documento.createTextNode(this.facturaAux.getCliente().getTelefono());
            Telefono.appendChild(textTelefono);
            receptor.appendChild(Telefono);

            receptor.appendChild(ubicacion);
            Facturaelectronica.appendChild(receptor);
        //------------------------------------------Linea de Detalle
            for (Producto p : this.facturaAux.getProductos()) {
               
                Element Cantidad = documento.createElement("Cantidad");
                Text textCantidad = documento.createTextNode(p.getString_Cantidad());
                Cantidad.appendChild(textCantidad);
                factura.appendChild(Cantidad);      
                
                Element Detalle = documento.createElement("Detalle");
                Text textDetalle = documento.createTextNode(p.getDetalle());
                Detalle.appendChild(textDetalle);
                factura.appendChild(Detalle);
                
                 

                Element Medida = documento.createElement("Medida");
                Text textMedida = documento.createTextNode(p.getMedida());
                Medida.appendChild(textMedida);
                factura.appendChild(Medida);

                Element Codigo = documento.createElement("Codigo");
                Text textCodigo = documento.createTextNode(p.getCodigo());
                Codigo.appendChild(textCodigo);
                factura.appendChild(Codigo);

                Element Precio_unitario = documento.createElement("PrecioUnitario");
                Text textPrecio_unitario = documento.createTextNode(p.getString_Precio_unitario());
                Precio_unitario.appendChild(textPrecio_unitario);
                factura.appendChild(Precio_unitario);
                
                Facturaelectronica.appendChild(factura);
              
            }
            im = facturaAux.impuestos(productos);
            String stringimim = String.valueOf(impuesto);
            sub = facturaAux.subtotal(productos);
            String stringsubtotal = String.valueOf(subtotal);
            to = facturaAux.totalNeto(productos);
            String stringtotal = String.valueOf(total1);
           // double impuesto, double subtotal, double total
            
            System.out.println(impuesto+ "nn");
            System.out.println(stringimim + "wwww");

            Element impuestos = documento.createElement("Impuestos");
            Text textimpuestos = documento.createTextNode(stringimim);
            impuestos.appendChild(textimpuestos);
            factura.appendChild(impuestos);

            Element Subtotal = documento.createElement("Subtotal");
            Text textSubtotal = documento.createTextNode(stringtotal);
            Subtotal.appendChild(textSubtotal);
            factura.appendChild(Subtotal);

            Element total = documento.createElement("Total");
            Text texttotal = documento.createTextNode(stringsubtotal);
            total.appendChild(texttotal);
            factura.appendChild(total);
            
            
            Facturaelectronica.appendChild(factura);

            documento.getDocumentElement().appendChild(Facturaelectronica);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("FacturaElectronica_" + this.facturaAux.getNumeroFactura()+ ".xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            transformer.transform(source, result);
        } catch (TransformerException ex) {
            Logger.getLogger(Factura_View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}