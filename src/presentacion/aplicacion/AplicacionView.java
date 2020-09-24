package presentacion.aplicacion;

import Datos.Datos;
import java.awt.Graphics;
import logica.Servicio;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import presentacion.ClienteTableModel;
import presentacion.EmpresaTableModel;
import presentacion.ProductoTableModel;
import presentacion.cliente.ClienteControl;
import presentacion.producto.ProductoView;
import presentacion.cliente.ClienteView;
import presentacion.empresa.EmpresaControl;
import presentacion.empresa.EmpresaView;
import presentacion.producto.ProductoControl;
/**
 *
 * @author Ivan
 */
public class AplicacionView extends javax.swing.JFrame implements java.util.Observer{

    /**
     * Creates new form View
     */
    public AplicacionView() {
        initComponents();
        this.LogoIcon();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
         this.setTitle("FACTURACION-Eva Miguel Daniel");
    }
    
    public void LogoIcon() {
        ImageIcon ImageIcon = new ImageIcon("F.png");
        Image image = ImageIcon.getImage();
        this.setIconImage(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new FondoPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Producto = new javax.swing.JMenu();
        jMenu_Cliente = new javax.swing.JMenu();
        jMenu_Empresa = new javax.swing.JMenu();
        jMenu_Farturacion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );

        jMenu_Producto.setBorder(null);
        jMenu_Producto.setText("Producto");
        jMenu_Producto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jMenu_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_ProductoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Producto);

        jMenu_Cliente.setBorder(null);
        jMenu_Cliente.setText("Cliente");
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

        jMenu_Farturacion.setBorder(null);
        jMenu_Farturacion.setText("Facturación");
        jMenu_Farturacion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jMenu_Farturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_FarturacionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Farturacion);

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

    private void jMenu_FarturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_FarturacionMouseClicked
        this.control.facturaShow();
    }//GEN-LAST:event_jMenu_FarturacionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Cliente;
    private javax.swing.JMenu jMenu_Empresa;
    private javax.swing.JMenu jMenu_Farturacion;
    private javax.swing.JMenu jMenu_Producto;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    AplicacionControl control;
    AplicacionModelo modelo;
    
    public void setControl(AplicacionControl control){
        this.control = control;
    }

    public AplicacionControl getControl() {
        return control;
    }
    
    public void setModelo(AplicacionModelo modelo){
        this.modelo = modelo;
        modelo.addObserver(this);
    }

    public AplicacionModelo getModelo() {
        return modelo;
    }
    
    public void update(java.util.Observable updatedModel,Object parametros){
    
    }
    class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(),getHeight() ,this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
