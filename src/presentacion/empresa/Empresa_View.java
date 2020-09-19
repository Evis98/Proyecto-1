package presentacion.empresa;

import Datos.Datos;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import presentacion.Producto_TableModel;
import logica.Empresa;
import presentacion.Cliente_TableModel;
import presentacion.Empresa_TableModel;
import presentacion.producto.Producto_View;
/**
 * @author Daniel
 */
public class Empresa_View extends javax.swing.JInternalFrame implements Observer  {
    /**
     * Creates new form
     */
    public Empresa_View() {
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

        tituloJLabel = new javax.swing.JLabel();
        Label_CodigoActividad = new javax.swing.JLabel();
        Label_Nombre = new javax.swing.JLabel();
        Label_Id = new javax.swing.JLabel();
        Label_Ubicacion = new javax.swing.JLabel();
        Label_Correo = new javax.swing.JLabel();
        Label_Telefono = new javax.swing.JLabel();
        Label_Fax = new javax.swing.JLabel();
        TextfieldCodigoActividad = new javax.swing.JTextField();
        TextfieldNombreComercial = new javax.swing.JTextField();
        TextfieldId = new javax.swing.JTextField();
        TextfieldUbicacion = new javax.swing.JTextField();
        TextfieldCorreo = new javax.swing.JTextField();
        TextfieldTelefono = new javax.swing.JTextField();
        TextfieldFax = new javax.swing.JTextField();
        Label_Buscar = new javax.swing.JLabel();
        TextfieldBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Empresas = new javax.swing.JTable();
        Button_Agregar = new javax.swing.JButton();
        store = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        tituloJLabel.setBackground(new java.awt.Color(153, 153, 255));
        tituloJLabel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        tituloJLabel.setText("Registro empresa");
        tituloJLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloJLabel.setOpaque(true);

        Label_CodigoActividad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_CodigoActividad.setText("Codigo actividad:");

        Label_Nombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Label_Nombre.setText("Nombre comercial:");

        Label_Id.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Id.setText("Identificacion:");

        Label_Ubicacion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Ubicacion.setText("Ubicacion:");

        Label_Correo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Correo.setText("Correo:");

        Label_Telefono.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Telefono.setText("Telefono:");

        Label_Fax.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Fax.setText("Fax:");

        TextfieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldIdActionPerformed(evt);
            }
        });

        TextfieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldUbicacionActionPerformed(evt);
            }
        });

        TextfieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldCorreoActionPerformed(evt);
            }
        });

        Label_Buscar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Buscar.setText("Buscar:");

        TextfieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldBuscarActionPerformed(evt);
            }
        });

        Table_Empresas.setBackground(new java.awt.Color(204, 204, 255));
        Table_Empresas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Table_Empresas.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Table_Empresas.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Empresas.setRowHeight(20);
        Table_Empresas.setRowMargin(2);
        Table_Empresas.setRowSelectionAllowed(false);
        Table_Empresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_EmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Empresas);

        Button_Agregar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Button_Agregar.setText("Agregar");
        Button_Agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarActionPerformed(evt);
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
        store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeActionPerformed(evt);
            }
        });

        jButtonLoad.setText("Mostrar Empresas Registradas");
        jButtonLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoadMouseClicked(evt);
            }
        });
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextfieldId))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Correo)
                        .addGap(30, 30, 30)
                        .addComponent(TextfieldCorreo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Telefono)
                        .addGap(18, 18, 18)
                        .addComponent(TextfieldTelefono))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Ubicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextfieldUbicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Nombre)
                            .addComponent(Label_CodigoActividad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextfieldNombreComercial)
                            .addComponent(TextfieldCodigoActividad)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Fax)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextfieldFax)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonLoad)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 50, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextfieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(tituloJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(tituloJLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_CodigoActividad)
                            .addComponent(TextfieldCodigoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Nombre)
                            .addComponent(TextfieldNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Id)
                            .addComponent(TextfieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Ubicacion)
                            .addComponent(TextfieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Correo)
                            .addComponent(TextfieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Telefono)
                            .addComponent(TextfieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Fax)
                            .addComponent(TextfieldFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLoad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Label_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(TextfieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextfieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldIdActionPerformed

    private void TextfieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldUbicacionActionPerformed

    private void TextfieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldCorreoActionPerformed

    private void Button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AgregarActionPerformed
        if (TextfieldCodigoActividad.getText().isEmpty() || TextfieldNombreComercial.getText().isEmpty() || TextfieldId.getText().isEmpty() || TextfieldUbicacion.getText().isEmpty() || TextfieldCorreo.getText().isEmpty()
            || TextfieldTelefono.getText().isEmpty() || TextfieldFax.getText().isEmpty()) return;            
        Empresa empresa = new Empresa();
        empresa.setCodigoActividad(TextfieldCodigoActividad.getText());
        empresa.setNombreComercial(TextfieldNombreComercial.getText());
        empresa.setId(TextfieldId.getText());
        empresa.setUbicacion(TextfieldUbicacion.getText());
        empresa.setCorreo(TextfieldCorreo.getText());
        empresa.setTelefono(TextfieldTelefono.getText());
        empresa.setFax(TextfieldFax.getText());
        try {
            control.agregar(empresa);
        } catch (Exception ex) {
            Logger.getLogger(Empresa_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_AgregarActionPerformed

    private void Table_EmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_EmpresasMouseClicked
        if (evt.getClickCount() == 7) {
            control.seleccionar(Table_Empresas.getSelectedRow());
        }
    }//GEN-LAST:event_Table_EmpresasMouseClicked

    private void TextfieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldBuscarActionPerformed
        Empresa filtro = new Empresa();
        filtro.setNombreComercial(TextfieldBuscar.getText());
        control.buscar(filtro);        
                
    }//GEN-LAST:event_TextfieldBuscarActionPerformed

    private void storeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeActionPerformed
  
    }//GEN-LAST:event_storeActionPerformed

    private void storeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storeMouseClicked
        try {
            control.store("DataBase.xml");       
        } 
        catch (Exception ex) {
            Logger.getLogger(Empresa_View.class.getName()).log(Level.SEVERE, null, ex);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_storeMouseClicked

    private void jButtonLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoadMouseClicked
           try {
            Datos c = control.load("DataBase.xml");
            control.agregarTodos(c.getEmpresas());
            this.Table_Empresas.setModel(new Empresa_TableModel(c.getEmpresas()));
        } catch (Exception ex) {
            Logger.getLogger(Empresa_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLoadMouseClicked

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoadActionPerformed
   
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
            java.util.logging.Logger.getLogger(Empresa_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */  
    }
    
    Empresa_Control control;
    Empresa_Modelo modelo;

    public Empresa_Control getControl() {
        return control;
    }

    public void setControl(Empresa_Control control) {
        this.control = control;
    }

    public Empresa_Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Empresa_Modelo modelo) {
        this.modelo = modelo;        
         modelo.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        Empresa current = modelo.getCurrent();
        TextfieldCodigoActividad.setText(current.getCodigoActividad());
        TextfieldNombreComercial.setText(current.getNombreComercial());
        TextfieldId.setText(current.getId());
        TextfieldUbicacion.setText(current.getUbicacion());
        TextfieldCorreo.setText(current.getCorreo());
        TextfieldTelefono.setText(current.getTelefono());        
        TextfieldFax.setText(current.getFax());       
        Table_Empresas.setModel(new Empresa_TableModel(modelo.getLista()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Agregar;
    private javax.swing.JLabel Label_Buscar;
    private javax.swing.JLabel Label_CodigoActividad;
    private javax.swing.JLabel Label_Correo;
    private javax.swing.JLabel Label_Fax;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JLabel Label_Telefono;
    private javax.swing.JLabel Label_Ubicacion;
    private javax.swing.JTable Table_Empresas;
    private javax.swing.JTextField TextfieldBuscar;
    private javax.swing.JTextField TextfieldCodigoActividad;
    private javax.swing.JTextField TextfieldCorreo;
    private javax.swing.JTextField TextfieldFax;
    private javax.swing.JTextField TextfieldId;
    private javax.swing.JTextField TextfieldNombreComercial;
    private javax.swing.JTextField TextfieldTelefono;
    private javax.swing.JTextField TextfieldUbicacion;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton store;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables
}