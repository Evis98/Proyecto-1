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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ivan
 */
public class Factura_Modelo extends Observable{
    Factura actual;
    List<Factura> lista;
    List<Producto> listaProducto;
    List<Cliente> listaCliente;
    List<Empresa> listaEmpresa;

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public Factura_Modelo() {
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

    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }   
}