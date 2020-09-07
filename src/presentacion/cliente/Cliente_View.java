/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.cliente;


import java.util.Observable;
import logica.Cliente;
import presentacion.Cliente_TableModel;
/**
 *
 * @author Eva
 */
public class Cliente_View extends javax.swing.JDialog implements java.util.Observer {

    /**
     * Creates new form View
     */
    public Cliente_View(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        this.setLocation(100, 100);
        this.getContentPane().setBackground(new java.awt.Color(204, 255, 204));
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
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_Numero = new javax.swing.JTextField();
        jTextField_Correo = new javax.swing.JTextField();
        jTextField_Provincia = new javax.swing.JTextField();
        jTextField_Canton = new javax.swing.JTextField();
        jTextField_Distrito = new javax.swing.JTextField();
        Button_Agregar_Cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_buscar = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("Registrar un Cliente");

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

        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        Button_Agregar_Cliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button_Agregar_Cliente.setText("Agregar");
        Button_Agregar_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Button_Agregar_ClienteMousePressed(evt);
            }
        });

        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Cliente);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel2.setText("Buscar por identificación: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_Nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_Correo)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_Provincia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Distrito)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Distrito))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Canton)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Canton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_Id)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(Button_Agregar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(129, 129, 129))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Numero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Nombre)
                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Correo)
                            .addComponent(jTextField_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Provincia)
                            .addComponent(jTextField_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Canton)
                            .addComponent(jTextField_Canton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Distrito)
                            .addComponent(jTextField_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Button_Agregar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {                                        
      if(jTextField_Id.getText().isEmpty() || jTextField_Nombre.getText().isEmpty() || jTextField_Provincia.getText().isEmpty() ) return;
       Cliente cliente = new Cliente();
       cliente.setId(jTextField_Id.getText());
       cliente.setNombre(jTextField_Nombre.getText());
       cliente.setProvincia(jTextField_Nombre.getText());
    
       //producto.setPrecio_unitario(Textfield_Precio.getText());                                                                            //
       control.agregar(cliente);
    }                                       

    private void filtroBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Cliente filtro= new Cliente();
        filtro.setId(jTextField_Id.getText());
        filtro.setNombre(jTextField_Nombre.getText());
        filtro.setProvincia(jTextField_Provincia.getText());
        control.buscar(filtro);
    }                                            
    
    private void listaMouseClicked(java.awt.event.MouseEvent evt) {                                   
        if(evt.getClickCount()==3){
           control.seleccionar(jTable_Cliente.getSelectedRow());
        }
    }
    private void Button_Agregar_ClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Agregar_ClienteMousePressed
        
// TODO add your handling code here:
    }//GEN-LAST:event_Button_Agregar_ClienteMousePressed

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Agregar_Cliente;
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
    private javax.swing.JTable jTable_Cliente;
    private javax.swing.JTextField jTextField_Canton;
    private javax.swing.JTextField jTextField_Correo;
    private javax.swing.JTextField jTextField_Distrito;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Numero;
    private javax.swing.JTextField jTextField_Provincia;
    private javax.swing.JTextField jTextField_buscar;
    // End of variables declaration//GEN-END:variables

    Cliente_Control control;
    Cliente_Modelo modelo;
    
    public void setControl(Cliente_Control control){
        this.control =control;
    }

    public Cliente_Control getControl() {
        return control;
    }
    
    public void setModelo(Cliente_Modelo modelo){
        this.modelo = modelo;
        modelo.addObserver(this);

    }

    public Cliente_Modelo getModelo() {
        return modelo;
    }

    @Override
    public void update(Observable o, Object arg) {
        
      }

}
