/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.aplicacion;

/**
 *
 * @author Ivan
 */
public class Aplicacion_Control {

    Aplicacion_Modelo modelo;
    Aplicacion_View view;

    public Aplicacion_Control(Aplicacion_Modelo modelo, Aplicacion_View view) {
        this.modelo = modelo;
        this.view = view;
        view.setModelo(modelo);
        view.setControl(this);
        this.initOptions();
    }

    presentacion.producto.Producto_Modelo producto_Modelo;
    presentacion.producto.Producto_View producto_View;
    presentacion.producto.Producto_Control producto_Control;

    presentacion.cliente.Cliente_Modelo cliente_Modelo;
    presentacion.cliente.Cliente_View cliente_View;
    presentacion.cliente.Cliente_Control cliente_Control;
    
    presentacion.empresa.Empresa_Modelo empresa_Modelo;
    presentacion.empresa.Empresa_View empresa_View;
    presentacion.empresa.Empresa_Control empresa_Control;

    public void initOptions() {
        producto_Modelo = new presentacion.producto.Producto_Modelo();
        producto_View = new presentacion.producto.Producto_View();
        producto_Control = new presentacion.producto.Producto_Control(producto_Modelo, producto_View);

        cliente_Modelo = new presentacion.cliente.Cliente_Modelo();
        cliente_View = new presentacion.cliente.Cliente_View();
        cliente_Control = new presentacion.cliente.Cliente_Control(cliente_Modelo, cliente_View);
        
        empresa_Modelo = new presentacion.empresa.Empresa_Modelo();
        empresa_View = new presentacion.empresa.Empresa_View();
        empresa_Control = new presentacion.empresa.Empresa_Control(empresa_Modelo, empresa_View);
        
        this.view.panel.add(cliente_View);
        this.view.panel.add(producto_View);
        this.view.panel.add(empresa_View);
    }

    public void productoShow() {
        this.producto_Control.show();
    }

    public void clienteShow() {
        this.cliente_Control.show();
    }

    public void empresaShow() {
     this.empresa_View.show();
    }
}
