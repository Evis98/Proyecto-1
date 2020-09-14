package presentacion.factura;

import logica.Factura;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Ivan
 */
public class Factura_Modelo extends Observable{
    Factura actual;
    List<Factura> lista;
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }

    public Factura_Modelo() {
        actual = new Factura();
        lista = new ArrayList<>();
    }

    public Factura getCurrent() {
        return actual;
    }
    
    public void setCurrent(Factura current) {
        this.actual = current;
    }

    public List<Factura> getLista() {
        return lista;
    }

    public void setLista(List<Factura> lista) {
        this.lista = lista;
    }

    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }   
}