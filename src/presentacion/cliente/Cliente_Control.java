/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;

/**
 *
 * @author Eva
 */
public class Cliente_Control {
    Cliente_Modelo modelo;
    Cliente_View view;

    public Cliente_Control(Cliente_Modelo modelo, Cliente_View view) {
        this.modelo = modelo;
        this.view = view;
        modelo.setLista(logica.Servicio.instance().getClientes());
        view.setModelo(modelo);
        view.setControl(this);
        
    }
    
    public void agregar(Cliente c){
    
            logica.Servicio.instance().add(c);
            modelo.setCurrent(new Cliente());
            modelo.setLista(logica.Servicio.instance().getClientes());
            modelo.commit();
       
    } 
    
    public void buscar(Cliente c){    
        modelo.setLista(logica.Servicio.instance().buscar(c));
        modelo.commit();        
    }

    public void seleccionar(int row){
        modelo.setCurrent(modelo.getLista().get(row));
        modelo.commit();        
    }
    
    
     public void load() throws Exception {
        logica.Servicio.instance().load();
         modelo.commit();
    }

    public void store() throws Exception {
        logica.Servicio.instance().store();
        modelo.commit();
    }
    
    public void show(){
        view.setVisible(true);
    }    
}
