package presentacion.factura;

import Datos.Datos;
import logica.Factura;
import logica.Producto;
import logica.Cliente;
import logica.Empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//La clase Modelo se encarga de la estructuración de lo mostrado en pantalla para Factura
//extends Observable permite que el modelo pueda ser monitoreado en busca de cambios, para actualizar información y refrescarla para poder mostrarla en pantalla 
public class FacturaModelo extends Observable{
    Factura actual;
    List<Factura> lista;
    List<Producto> listaProducto;
    List<Cliente> listaCliente;
    List<Empresa> listaEmpresa;
    Datos datos;
    Producto ps;

    //addObserver funciona como un elemento pendiente de los cambios dentro de las listas y los actualiza para mostrar en pantalla
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public FacturaModelo() {
        actual = new Factura();
        lista = new ArrayList<>();
        listaProducto = new ArrayList<>();
        listaCliente = new ArrayList<>();
        listaEmpresa = new ArrayList<>();
    }

    public Factura getActual() {
        return actual;
    }

    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    
    public void setActual(Factura actual) {
        this.actual = actual;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
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

    //Actualiza la lista con los cambios realizados  informa sobre ellos
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }    
}