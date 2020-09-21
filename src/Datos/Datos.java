package Datos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import logica.Cliente;
import logica.Producto;
import logica.Empresa;
import logica.Factura;

/**
 *
 * @author Ivan
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Datos {
    List<Producto> productos;   
    List<Cliente> clientes;
    List<Empresa> empresas;
    List<Factura> facturas;

    public Datos() {
        productos = new ArrayList<>();     
        clientes = new ArrayList<>();
        empresas = new ArrayList<>();
        facturas=new ArrayList<>();
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
    
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public List<Cliente> getClientes(){
        return clientes;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes =clientes;
    }   
       
}