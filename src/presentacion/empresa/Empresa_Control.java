package presentacion.empresa;
import Datos.Datos;
import java.util.List;
import logica.Empresa;
/**
 *
 * @author Daniel
 */
public class Empresa_Control {
    Empresa_Modelo modelo;
    Empresa_View view;

    public Empresa_Control(Empresa_Modelo modelo, Empresa_View view) {
        this.modelo = modelo;
        this.view = view;
        view.setModelo(modelo);
        view.setControl(this);
    }
  
    public void agregar(Empresa p) {
        logica.Servicio.instance().add(p);
        modelo.setCurrent(new Empresa());
        modelo.setLista(logica.Servicio.instance().getEmpresas());
        modelo.commit();
    }

    public void agregarTodos(List<Empresa> c) {
        logica.Servicio.instance().addAll2(c);
        modelo.setCurrent(new Empresa());
        modelo.setLista(logica.Servicio.instance().getEmpresas());
        modelo.commit();
    }

       
    public void buscar(Empresa p){    
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
        logica.Servicio.instance().load(u);
        modelo.commit();
        return  logica.Servicio.instance().load(u);
    }

    public void store(String u) throws Exception {
        logica.Servicio.instance().store(u);
        modelo.commit();
    }  
}