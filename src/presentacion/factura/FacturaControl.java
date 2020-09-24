package presentacion.factura;

import Datos.Datos;
import java.util.List;
import logica.Factura;
//import logica.Producto;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
public class FacturaControl {
    FacturaModelo modelo;
    FacturaView view;

    public FacturaControl(FacturaModelo modelo, FacturaView view) {
        this.modelo = modelo;
        this.view = view;
        modelo.setLista(logica.Servicio.instance().getFacturas());
        view.setModelo(modelo);
        view.setControl(this);
    }
    
    //Permite la acción de agregar una Factura
    public void agregar(Factura f){
        logica.Servicio.instance().add(f);
        modelo.setCurrent(new Factura());
        modelo.setLista(logica.Servicio.instance().getFacturas());        
        modelo.commit();
    }

    public void agregarTodos(List<Factura> c) {
        logica.Servicio.instance().addAll4(c);
        modelo.setCurrent(new Factura());
        modelo.setLista(logica.Servicio.instance().getFacturas());
        modelo.commit();
    }
    
    public void seleccionar(int row){
        modelo.setCurrent(modelo.getLista().get(row));
        modelo.commit();
    }

    public void show() {
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
