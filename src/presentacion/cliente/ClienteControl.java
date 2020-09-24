package presentacion.cliente;

import Datos.Datos;
import java.util.List;
import logica.Cliente;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
public class ClienteControl {
    ClienteModelo modelo;
    ClienteView view;

    public ClienteControl(ClienteModelo modelo, ClienteView view) {
        this.modelo = modelo;
        this.view = view;
        modelo.setLista(logica.Servicio.instance().getClientes());
        view.setModelo(modelo);
        view.setControl(this);    
    }
    
    //Permite la acción de agregar un Cliente 
    public void agregar(Cliente c) throws Exception{
    
        logica.Servicio.instance().add(c);
        modelo.setCurrent(new Cliente());
        modelo.setLista(logica.Servicio.instance().getClientes());
        modelo.commit();  
    }

    public void agregarTodos(List<Cliente> c){
    
        logica.Servicio.instance().addAll1(c);
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
    
    public Datos load(String u) throws Exception {       
         modelo.commit();         
         logica.Servicio.instance().setPath(u);
         return  logica.Servicio.instance().load(u);
    }

    public void store(String u) throws Exception {
        logica.Servicio.instance().store(u);
        logica.Servicio.instance().setPath(u);
        modelo.commit();
    }
    
    public void show(){
        view.setVisible(true);
    }    
}