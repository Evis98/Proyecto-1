package presentacion.aplicacion;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//La clase Modelo se encarga de la estructuración de lo mostrado en pantalla para Aplicación
//extends Observable permite que el modelo pueda ser monitoreado en busca de cambios, para actualizar información y refrescarla para poder mostrarla en pantalla 
public class AplicacionModelo extends Observable { 
    //addObserver funciona como un elemento pendiente de los cambios dentro de las listas y los actualiza para mostrar en pantalla
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.setChanged();
        this.notifyObservers();
    }  
}