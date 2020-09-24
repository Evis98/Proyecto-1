package presentacion.cliente;

import logica.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//La clase Modelo se encarga de la estructuración de lo mostrado en pantalla para Empresa
//extends Observable permite que el modelo pueda ser monitoreado en busca de cambios, para actualizar información y refrescarla para poder mostrarla en pantalla 
public class ClienteModelo extends Observable{
    Cliente actual;
    List<Cliente> lista;
    
    //addObserver funciona como un elemento pendiente de los cambios dentro de las listas y los actualiza para mostrar en pantalla
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }

    public ClienteModelo() {
        actual = new Cliente();
        lista = new ArrayList<>();
    }

    public Cliente getCurrent() {
        return actual;
    }
    
    public void setCurrent(Cliente current) {
        this.actual = current;
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    //Actualiza la lista con los cambios realizados  informa sobre ellos
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    } 
}