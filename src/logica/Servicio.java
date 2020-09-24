package logica;

import Datos.Datos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//Servicio se encarga de la configuración de XmlPersister para la correcta generación del XML utilizando los datos de la raíz(Datos.java)
public class Servicio {
    private static Servicio theInstance;
    private Datos datos;
    
    public static Servicio instance(){
        if (theInstance==null){ 
            theInstance=new Servicio();
        }
        return theInstance;
    }
    
    public Servicio() {
        try{
            datos=XmlPersister.TheinstanceXml().load();
        }
        catch(Exception e){
            datos =  new Datos();
        }
    }
    
    public List<Factura> getFacturas() {
        return datos.getFacturas();
    }
    
    public List<Producto> getProductos() {
        return datos.getProductos();
    }
    
    public List<Cliente> getClientes() {
        return datos.getClientes();
    }
      public Cliente consultarCliente(int index) {
        return datos.getClientes().get(index);
    }
     
    public List<Empresa> getEmpresas() {
        return datos.getEmpresas();
    }

    //Añade un Producto
    public void add(Producto p) {
        if (!this.EliminaRepeP(p)) 
            datos.getProductos().add(p);
    }

    //Añade una Empresa
    public void add(Empresa e) {
         if (!this.EliminaRepeE(e))
             datos.getEmpresas().add(e);
    }

    public void setPath(String u) {
        XmlPersister.TheinstanceXml(u).setPath(u);
    }

    //Añade un Cliente
    public void add(Cliente cli) {
        if (!this.EliminaRepeC(cli)) 
            datos.getClientes().add(cli);
        
    }

    //Añade Clientes después de asegurarse que su información no coincide con la de otro Cliente ya existente
    public void addAll1(List<Cliente> c) {
        if (!datos.getClientes().equals(c)) 
            datos.getClientes().addAll(c);        
    }

    //Añade Empresas después de asegurarse que su información no coincide con la de otra Empresa ya existente
    public void addAll2(List<Empresa> e) {
        if (!datos.getEmpresas().equals(e))
        datos.getEmpresas().addAll(e);
    }

    //Añade Productos después de asegurarse que su información no coincide con la de otro Producto ya existente
    public void addAll3(List<Producto> p) {
        if (!datos.getProductos().equals(p))
        datos.getProductos().addAll(p);
    }

    //Añade Facturas después de asegurarse que su información no coincide con la de otra Factura ya existente
    public void addAll4(List<Factura> f) {
        if (!datos.getFacturas().equals(f))
        datos.getFacturas().addAll(f);
    }

    //Añade una Factura
    public void add(Factura f) {        
        datos.getFacturas().add(f);
    }

    //Carga la información del XML
    public Datos load(String u) throws Exception {
        return logica.XmlPersister.TheinstanceXml(u).load();
    }

    //Almacena la información de la clase Datos.java para construir el XML
    public void store(String u) throws Exception {
        logica.XmlPersister.TheinstanceXml(u).store(datos);
    }

    //Busca elementos Específicos en la lista de Productos
    public List<Producto> buscar(Producto pro) {
        List<Producto> result = new ArrayList<>();
        for (Producto p : datos.getProductos()) {
            if (p.getDetalle().contains(pro.getDetalle())) {
                result.add(p);
            }
        };
        return result;
    }

    //Busca elementos Específicos en la lista de Clientes
    public List<Cliente> buscar(Cliente cli) {
        List<Cliente> result = new ArrayList<>();
        for (Cliente c : datos.getClientes()) {
            if (c.getId().contains(cli.getId())) {
                result.add(c);
            }
        };
        return result;
    }

    //Busca elementos Específicos en la lista de Empresas
    public List<Empresa> buscar(Empresa emp) {
        List<Empresa> result = new ArrayList<>();
        for (Empresa c : datos.getEmpresas()) {
            if (c.getId().contains(emp.getNombreComercial())) {
                result.add(c);
            }
        };
        return result;
    }

    //Elimina elementos repetidos en la lista de Clientes
    public boolean EliminaRepeC(Cliente cli) {
        List<Cliente> result = new ArrayList<>();
        for (Cliente c : datos.getClientes()) {
            if (c.getId().contains(cli.getId())) {
                return true;
            }
        };
        return false;
    }

    //Elimina elementos repetidos en la lista de Productos
    public boolean EliminaRepeP(Producto pro) {
        List<Producto> result = new ArrayList<>();
        for (Producto p : datos.getProductos()) {
            if (p.getDetalle().contains(pro.getDetalle())) {
                return true;
            }
        };
        return false;
    }

    //Elimina elementos repetidos en la lista de Empresas
    public boolean EliminaRepeE(Empresa emp) {
        List<Empresa> result = new ArrayList<>();
        for (Empresa c : datos.getEmpresas()) {
            if (c.getId().contains(emp.getNombreComercial())) {
                return true;
            }
        };
        return false;
    }     
}