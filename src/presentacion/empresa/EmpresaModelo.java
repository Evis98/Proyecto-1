package presentacion.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import logica.Empresa;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//La clase Modelo se encarga de la estructuración de lo mostrado en pantalla para Empresa
//extends Observable permite que el modelo pueda ser monitoreado en busca de cambios, para actualizar información y refrescarla para poder mostrarla en pantalla 
public class EmpresaModelo  extends Observable{
    Empresa actual;
    List<Empresa> lista;
    
    //addObserver funciona como un elemento pendiente de los cambios dentro de las listas y los actualiza para mostrar en pantalla
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }

    public EmpresaModelo() {
        actual = new Empresa();
        lista = new ArrayList<>();
    }

    public EmpresaModelo(Empresa actual, List<Empresa> lista) {
        this.actual = actual;
        this.lista = lista;
    }
    
    public Empresa getCurrent() {
        return actual;
    }
    
    public void setCurrent(Empresa current) {
        this.actual = current;
    }

    public List<Empresa> getLista() {
        return lista;
    }

    public void setLista(List<Empresa> lista) {
        this.lista = lista;
    }
       
    //Actualiza la lista con los cambios realizados  informa sobre ellos
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }   
}