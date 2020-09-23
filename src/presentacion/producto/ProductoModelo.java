package presentacion.producto;

import logica.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Ivan
 */
public class ProductoModelo extends Observable{
    Producto actual;
    List<Producto> lista;
    
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

    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }  
}