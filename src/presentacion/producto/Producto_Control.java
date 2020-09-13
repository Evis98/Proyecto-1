/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.producto;

import logica.Producto;

/**
 *
 * @author Ivan
 */
public class Producto_Control {
    Producto_Modelo modelo;
    Producto_View view;

    public Producto_Control(Producto_Modelo modelo, Producto_View view) {
        this.modelo = modelo;
        this.view = view;
        modelo.setLista(logica.Servicio.instance().getProductos());
        view.setModelo(modelo);
        view.setControl(this);
    }
    
    public void agregar(Producto p){
        logica.Servicio.instance().add(p);
        modelo.setCurrent(new Producto());
        modelo.setLista(logica.Servicio.instance().getProductos());        
        modelo.commit();
    }
    
    public void buscar(Producto p){    
        modelo.setLista(logica.Servicio.instance().buscar(p));
        modelo.commit();        
    }

    public void seleccionar(int row){
        modelo.setCurrent(modelo.getLista().get(row));
        modelo.commit();        
    }
    
    public void show(){
        view.setVisible(true);
    }  
      public void load() throws Exception {
        logica.Servicio.instance().load();
         modelo.commit();
    }

    public void store() throws Exception {
        logica.Servicio.instance().store();
        modelo.commit();
    }
    
}
