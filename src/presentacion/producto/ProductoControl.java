package presentacion.producto;

import Datos.Datos;
import java.util.List;
import logica.Producto;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
public class ProductoControl {
    ProductoModelo modelo;
    ProductoView view;

    public ProductoControl(ProductoModelo modelo, ProductoView view) {
        this.modelo = modelo;
        this.view = view;
        modelo.setLista(logica.Servicio.instance().getProductos());
        view.setModelo(modelo);
        view.setControl(this);
    }
    
    //Permite la acción de agregar un Producto 
    public void agregar(Producto p){
        logica.Servicio.instance().add(p);
        modelo.setCurrent(new Producto());
        modelo.setLista(logica.Servicio.instance().getProductos());        
        modelo.commit();
    }
    
    public void agregarTodos(List<Producto> c) {
        
        logica.Servicio.instance().addAll3(c);
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
      public Datos load(String u) throws Exception {
       modelo.commit();
         return logica.Servicio.instance().load(u);
    }         

    public void store(String u) throws Exception {
        logica.Servicio.instance().store(u);
        modelo.commit();
    }   
}