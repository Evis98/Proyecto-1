package presentacion.producto;

import logica.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//La clase Modelo se encarga de la estructuración de lo mostrado en pantalla para Producto
//extends Observable permite que el modelo pueda ser monitoreado en busca de cambios, para actualizar información y refrescarla para poder mostrarla en pantalla 
public class ProductoModelo extends Observable{
    Producto actual;
    List<Producto> lista;
    
    //addObserver funciona como un elemento pendiente de los cambios dentro de las listas y los actualiza para mostrar en pantalla
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }

    public ProductoModelo() {
        actual = new Producto();
        lista = new ArrayList<>();
    }

    public Producto getCurrent() {
        return actual;
    }
    
    public void setCurrent(Producto current) {
        this.actual = current;
    }

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    //Actualiza la lista con los cambios realizados  informa sobre ellos
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }  
}