package presentacion.factura;

import java.util.Observable;
import java.util.Observer;
import logica.Factura;
import presentacion.factura.Factura_Control;
import presentacion.factura.Factura_Modelo;
/**
 *
 * @author PC
 */
public class Factura_View extends javax.swing.JInternalFrame implements Observer {
    /**
     * Creates new form_View
     */
    public Factura_View() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tituloJLabel = new javax.swing.JLabel();
        Label_Cliente = new javax.swing.JLabel();
        jComboBox_Cliente = new javax.swing.JComboBox<>();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(153, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        tituloJLabel.setBackground(new java.awt.Color(51, 255, 204));
        tituloJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        tituloJLabel.setText("Sistema de Facturación");
        tituloJLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloJLabel.setOpaque(true);

        Label_Cliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Cliente.setText("Cliente:");

        jComboBox_Cliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jComboBox_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_ClienteMouseClicked(evt);
            }
        });
        jComboBox_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ClienteActionPerformed(evt);
            }
        });

        Label_Empresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Empresa.setText("Empresa:");

        Label_Cliente1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Cliente1.setText("Producto:");

        jComboBox_Producto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jComboBox_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ProductoActionPerformed(evt);
            }
        });

        Button_AgregarProducto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Button_AgregarProducto.setText("Agregar Prodcuto");
        Button_AgregarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jButton1.setText("Cambiar atributos");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Empresa)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Observaciones)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jTextField_Observaciones))))
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
                                .addComponent(jComboBox_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_FormaPago)
                                .addGap(25, 25, 25)
                                .addComponent(jComboBox_FormaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Moneda)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tituloJLabel)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloJLabel)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Empresa)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente)
                            .addComponent(jComboBox_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_FacturarActionPerformed

    private void jTextField_ObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ObservacionesActionPerformed
       
    }//GEN-LAST:event_jTextField_ObservacionesActionPerformed

    private void jComboBox_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ProductoActionPerformed
       
    }//GEN-LAST:event_jComboBox_ProductoActionPerformed

    private void jComboBox_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ClienteActionPerformed
        
    }//GEN-LAST:event_jComboBox_ClienteActionPerformed

    private void jComboBox_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_ClienteMouseClicked
      
    }//GEN-LAST:event_jComboBox_ClienteMouseClicked

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
//        Producto current = modelo.getCurrent();
//        Textfield_Detalle.setText(current.getDetalle());
//        Textfield_Codigo.setText(current.getCodigo());
//        Textfield_Unidad.setText(current.getMedida());
//        Textfield_Precio.setText(current.getString_Precio_unitario());
//        Table_Productos.setModel(new Producto_TableModel(modelo.getLista()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_AgregarProducto;
    private javax.swing.JLabel Label_Cantidad;
    private javax.swing.JLabel Label_Cliente;
    private javax.swing.JLabel Label_Cliente1;
    private javax.swing.JLabel Label_Empresa;
    private javax.swing.JLabel Label_FormaPago;
    private javax.swing.JLabel Label_Moneda;
    private javax.swing.JLabel Label_Observaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Facturar;
    private javax.swing.JComboBox<String> jComboBox_Cliente;
    private javax.swing.JComboBox<String> jComboBox_FormaPago;
    private javax.swing.JComboBox<String> jComboBox_Moneda;
    private javax.swing.JComboBox<String> jComboBox_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_CantidadProductos;
    private javax.swing.JTextField jTextField_Observaciones;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables
}