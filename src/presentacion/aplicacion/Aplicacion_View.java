/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.aplicacion;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ivan
 */
public class Aplicacion_View extends javax.swing.JFrame implements java.util.Observer{

    /**
     * Creates new form View
     */
    public Aplicacion_View() {
        initComponents();
        this.LogoIcon();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }
  public void LogoIcon() {
        ImageIcon ImageIcon = new ImageIcon("F.png");
        Image image = ImageIcon.getImage();
        this.setIconImage(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eleccion = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Producto = new javax.swing.JMenu();
        jMenu_Cliente = new javax.swing.JMenu();
        jMenu_Empresa = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jMenu_Producto.setBorder(null);
        jMenu_Producto.setText("Producto");
        Eleccion.add(jMenu_Producto);
        jMenu_Producto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jMenu_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_ProductoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Producto);

        jMenu_Cliente.setBorder(null);
        jMenu_Cliente.setText("Cliente");
        Eleccion.add(jMenu_Cliente);
        jMenu_Cliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jMenu_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_ClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Cliente);

        jMenu_Empresa.setBorder(null);
        jMenu_Empresa.setText("Empresa");
        jMenu_Empresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jMenu_Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_EmpresaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Empresa);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_ProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_ProductoMouseClicked
        this.control.productoShow();
    }//GEN-LAST:event_jMenu_ProductoMouseClicked

    private void jMenu_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_ClienteMouseClicked
       this.control.clienteShow();
       
    }//GEN-LAST:event_jMenu_ClienteMouseClicked

    private void jMenu_EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_EmpresaMouseClicked
        this.control.empresaShow();
    }//GEN-LAST:event_jMenu_EmpresaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Eleccion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenu_Cliente;
    private javax.swing.JMenu jMenu_Empresa;
    private javax.swing.JMenu jMenu_Producto;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    Aplicacion_Control control;
    Aplicacion_Modelo modelo;
    
    public void setControl(Aplicacion_Control control){
        this.control = control;
    }

    public Aplicacion_Control getControl() {
        return control;
    }
    
    public void setModelo(Aplicacion_Modelo modelo){
        this.modelo = modelo;
         modelo.addObserver(this);
    }

    public Aplicacion_Modelo getModelo() {
        return modelo;
    }
    
    public void update(java.util.Observable updatedModel,Object parametros){
   }
}
