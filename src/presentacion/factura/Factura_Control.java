/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.factura;

import Datos.Datos;
import logica.Factura;

/**
 *
 * @author PC
 */
public class Factura_Control {
    Factura_Modelo modelo;
   Factura_View view;

    public Factura_Control(Factura_Modelo modelo, Factura_View view) {
        this.modelo = modelo;
        this.view = view;
        modelo.setLista(logica.Servicio.instance().getFacturas());
        view.setModelo(modelo);
        view.setControl(this);
    }
    
    public void agregar(Factura f){
        logica.Servicio.instance().add(f);
        modelo.setCurrent(new Factura());
        modelo.setLista(logica.Servicio.instance().getFacturas());        
        modelo.commit();
    }
    
    public void seleccionar(int row){
        modelo.setCurrent(modelo.getLista().get(row));
        modelo.commit();        
    }
    
    public void show(){
        view.setVisible(true);
    }  
      public Datos load(String u) throws Exception {
       modelo.commit();
         return logica.Servicio.instance().load(u);
    }
         
    

    public void store(String u) throws Exception {
        logica.Servicio.instance().store(u);
        modelo.commit();
    }
    
}
