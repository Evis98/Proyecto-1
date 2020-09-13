/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import Datos.Datos;
import java.io.File;
import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Ivan
 */
public class Servicio {
    private static Servicio theInstance;
    
    public static Servicio instance(){
        if (theInstance==null){ 
            theInstance=new Servicio();
        }
        return theInstance;
    }
    
    private Datos datos;
    
    public Servicio() {
       datos =  new Datos();
    }

    public List<Producto> getProductos() {
        return datos.getProductos();
    }
     public List<Cliente> getClientes() {
        return datos.getClientes();
    }
     
     public List<Empresa> getEmpresas() {
        return datos.getEmpresas();
    }

    public void add(Producto o){
        datos.getProductos().add(o);
    }
    
    public void add(Empresa o){
        datos.getEmpresas().add(o);
    }
    
    
     public void add(Cliente c){
        datos.getClientes().add(c);
    } 
     
     public void load() throws Exception{
          logica.XmlPersister.TheinstanceXml().load();
     }
     
     
     
     public void store() throws Exception{
          logica.XmlPersister.TheinstanceXml().store(datos);
     }

    public List<Producto> buscar(Producto pro){
        List<Producto> result = new ArrayList<>();
        for(Producto p:datos.getProductos()) {if (p.getDetalle().contains(pro.getDetalle())) result.add(p);};
        
        return result;
    } 
    public List<Cliente> buscar(Cliente cli){
        List<Cliente> result = new ArrayList<>();
        for(Cliente c:datos.getClientes()) {if (c.getId().contains(cli.getId())) result.add(c);};
        return result;
    } 
    
      public List<Empresa> buscar(Empresa emp){
        List<Empresa> result = new ArrayList<>();
        for(Empresa c:datos.getEmpresas()) {if (c.getId().contains(emp.getNombreComercial())) result.add(c);};
        return result;
    } 
}
