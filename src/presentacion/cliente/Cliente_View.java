package presentacion.cliente;

import Datos.Datos;
import java.io.FileInputStream;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import logica.Cliente;
import presentacion.Cliente_TableModel;
/**
 *
 * @author Eva
 */
public class Cliente_View extends javax.swing.JInternalFrame implements Observer {
    /**
     * Creates new form View
     */
    public Cliente_View() {      
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

        jLabel1 = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Id = new javax.swing.JLabel();
        jLabel_Numero = new javax.swing.JLabel();
        jLabel_Provincia = new javax.swing.JLabel();
        jLabel_Canton = new javax.swing.JLabel();
        jLabel_Distrito = new javax.swing.JLabel();
        jLabel_Correo = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldId = new javax.swing.JTextField();
        TextFieldNumero = new javax.swing.JTextField();
        TextFieldCorreo = new javax.swing.JTextField();
        TextFieldProvincia = new javax.swing.JTextField();
        TextFieldCanton = new javax.swing.JTextField();
        TextFieldDistrito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Clientes = new javax.swing.JTable();
        jButton_Agregar = new javax.swing.JButton();
        TextFieldBuscar = new javax.swing.JTextField();
        store = new javax.swing.JButton();
        cargar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel1.setText("Registrar un Cliente");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel_Nombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Nombre.setText("Nombre: ");

        jLabel_Id.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Id.setText("Identificación:");

        jLabel_Numero.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Numero.setText("Numero de telefono :");

        jLabel_Provincia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Provincia.setText("Provincia de residencia:");

        jLabel_Canton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Canton.setText("Cantón:");

        jLabel_Distrito.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Distrito.setText("Distrito:");

        jLabel_Correo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel_Correo.setText("Correo electronico:");

        TextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel2.setText("Buscar por identificación: ");

        jTable_Clientes.setBackground(new java.awt.Color(255, 255, 153));
        jTable_Clientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_Clientes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jTable_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clientes.setRowHeight(20);
        jTable_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Clientes);

        jButton_Agregar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jButton_Agregar.setText("Agregar");
        jButton_Agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });

        TextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBuscarActionPerformed(evt);
            }
        });

        store.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        store.setText("Store");
        store.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        store.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storeMouseClicked(evt);
            }
        });

        cargar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        cargar.setText("Load");
        cargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarMouseClicked(evt);
            }
        });
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Correo)
                                .addGap(7, 7, 7)
                                .addComponent(TextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Provincia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_Id)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFieldId))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Numero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_Nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Distrito)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextFieldDistrito))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Canton)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextFieldCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Nombre)
                            .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Correo)
                            .addComponent(TextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Provincia)
                            .addComponent(TextFieldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Canton)
                            .addComponent(TextFieldCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Distrito)
                            .addComponent(TextFieldDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Agregar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdActionPerformed

    private void jTable_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientesMouseClicked
        if (evt.getClickCount() == 7) {
            control.seleccionar(jTable_Clientes.getSelectedRow());
        }           
    }//GEN-LAST:event_jTable_ClientesMouseClicked

    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
        if (TextFieldNombre.getText().isEmpty() || TextFieldId.getText().isEmpty() || TextFieldNumero.getText().isEmpty()|| TextFieldCorreo.getText().isEmpty() || TextFieldProvincia.getText().isEmpty() || TextFieldCanton.getText().isEmpty() || TextFieldDistrito.getText().isEmpty())  return;
//        if(jTextField_Nombre.getText().isEmpty() || jTextField_Id.getText().isEmpty() || jTextField_Correo.getText().isEmpty() || jTextField_Provincia.getText().isEmpty()) return;
        Cliente cliente = new Cliente();
        cliente.setNombre(TextFieldNombre.getText());
        cliente.setId(TextFieldId.getText());
        cliente.setCorreo(TextFieldCorreo.getText());
        cliente.setProvincia(TextFieldProvincia.getText());
        cliente.setTelefono(TextFieldNumero.getText());
        cliente.setCanton(TextFieldCanton.getText());
        cliente.setDistrito(TextFieldDistrito.getText());
        try {
            control.agregar(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Cliente_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    private void TextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBuscarActionPerformed
        Cliente filtro = new Cliente();
        filtro.setId(TextFieldBuscar.getText());
        control.buscar(filtro);        
                   
    }//GEN-LAST:event_TextFieldBuscarActionPerformed

    private void cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarMouseClicked
        try {
            Datos c = control.load("DataBase.xml");
            control.agregarTodos(c.getClientes());
            jTable_Clientes.setModel(new Cliente_TableModel(c.getClientes()));
        } catch (Exception ex) {
            Logger.getLogger(Cliente_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargarMouseClicked

    private void storeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storeMouseClicked
        try {   
            control.store("DataBase.xml");        // TODO add your handling code here:
        } 
        catch (Exception ex) {
            Logger.getLogger(Cliente_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_storeMouseClicked

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    
    Cliente_Control control;
    Cliente_Modelo modelo;

    public void setControl(Cliente_Control control) {
        this.control = control;
    }

    public Cliente_Control getControl() {
        return control;
    }

    public void setModelo(Cliente_Modelo modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);

    }

    public Cliente_Modelo getModelo() {
        return modelo;
    }

      @Override
    public void update(Observable o, Object arg) {
        Cliente current = modelo.getCurrent();
        TextFieldNombre.setText(current.getNombre());
        TextFieldId.setText(current.getId());
        TextFieldNumero.setText(current.getTelefono());
        TextFieldCorreo.setText(current.getCorreo());
        TextFieldProvincia.setText(current.getProvincia());
        TextFieldCanton.setText(current.getCanton());        
        TextFieldDistrito.setText(current.getDistrito());
        jTable_Clientes.setModel(new Cliente_TableModel(modelo.getLista()));
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldBuscar;
    private javax.swing.JTextField TextFieldCanton;
    private javax.swing.JTextField TextFieldCorreo;
    private javax.swing.JTextField TextFieldDistrito;
    private javax.swing.JTextField TextFieldId;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldNumero;
    private javax.swing.JTextField TextFieldProvincia;
    private javax.swing.JButton cargar;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Canton;
    private javax.swing.JLabel jLabel_Correo;
    private javax.swing.JLabel jLabel_Distrito;
    private javax.swing.JLabel jLabel_Id;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Numero;
    private javax.swing.JLabel jLabel_Provincia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Clientes;
    private javax.swing.JButton store;
    // End of variables declaration//GEN-END:variables
 
}