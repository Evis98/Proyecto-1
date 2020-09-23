package presentacion.aplicacion;

//import javax.swing.JTable;
//import presentacion.Factura_TableModel;

/**
 *
 * @author Ivan
 */
public class AplicacionControl {
    AplicacionModelo modelo;
    AplicacionView view;

    public AplicacionControl(AplicacionModelo modelo, AplicacionView view) {
        this.modelo = modelo;
        this.view = view;
        view.setModelo(modelo);
        view.setControl(this);
        this.initOptions();
    }

    presentacion.producto.ProductoModelo producto_Modelo;
    presentacion.producto.ProductoView producto_View;
    presentacion.producto.ProductoControl producto_Control;

    presentacion.cliente.ClienteModelo cliente_Modelo;
    presentacion.cliente.ClienteView cliente_View;
    presentacion.cliente.ClienteControl cliente_Control;
    
    presentacion.empresa.EmpresaModelo empresa_Modelo;
    presentacion.empresa.EmpresaView empresa_View;
    presentacion.empresa.EmpresaControl empresa_Control;
       
    presentacion.factura.FacturaModelo factura_Modelo;
    presentacion.factura.FacturaView factura_View;
    presentacion.factura.FacturaControl factura_Control;

    public void initOptions() {
        producto_Modelo = new presentacion.producto.ProductoModelo();
        producto_View = new presentacion.producto.ProductoView();
        producto_Control = new presentacion.producto.ProductoControl(producto_Modelo, producto_View);

        cliente_Modelo = new presentacion.cliente.ClienteModelo();
        cliente_View = new presentacion.cliente.ClienteView();
        cliente_Control = new presentacion.cliente.ClienteControl(cliente_Modelo, cliente_View);
        
        empresa_Modelo = new presentacion.empresa.EmpresaModelo();
        empresa_View = new presentacion.empresa.EmpresaView();
        empresa_Control = new presentacion.empresa.EmpresaControl(empresa_Modelo, empresa_View);
        
        factura_Modelo = new presentacion.factura.FacturaModelo();
        factura_View = new presentacion.factura.FacturaView();
        factura_Control = new presentacion.factura.FacturaControl(factura_Modelo, factura_View);

        this.view.panel.add(cliente_View);
        this.view.panel.add(producto_View);
        this.view.panel.add(empresa_View);
        this.view.panel.add(factura_View);
    }
    
    public void productoShow() {
        this.producto_Control.show();
    }

    public void clienteShow() {
        this.cliente_Control.show();
    }
    
    public void facturaShow() {
        this.factura_Control.show();
    }
    
    public void empresaShow() {
        this.empresa_Control.show();
    }  
}
