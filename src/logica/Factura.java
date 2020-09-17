package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author PC
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {

    @XmlID
     String FechaEmision;
     Cliente Cliente;
     Empresa empresa;
    
    @XmlIDREF
    List<Producto> productos;
    @XmlIDREF
    List<Cliente> clientes;
    @XmlIDREF
    List<Empresa> empresas;
    
    String observaciones;
    String formadePago;
    int numeroFactura;

    public Factura(String FechaEmision, Cliente Cliente, Empresa empresa,  String observaciones, String formadePago, int numeroFactura) {
        this.FechaEmision = FechaEmision;
        this.Cliente = Cliente;
        this.empresa = empresa;
        this.observaciones = observaciones;
        this.formadePago = formadePago;
        this.numeroFactura = numeroFactura;
        productos = new ArrayList<>();
    }

    public Factura() {   productos = new ArrayList<>();
    }
    
    public double subtotal() {
        double newSubtotal = 0;
        if (this.productos.isEmpty()) 
            return (double) 0.0;
         else {
            for (Producto p: productos) 
                newSubtotal +=p.getPrecio_unitario();   
            return (double) newSubtotal;
        }
    }
    
     public double impuestos() {
        double newImpuestos = 0;
        if (this.productos.isEmpty()) 
            return (double) 0.0;
         else {
            for (Producto p: productos) 
                newImpuestos +=p.getPrecio_unitario()*0.13;  
            return (double) newImpuestos;
        }
    }
      public String getString_impuestos(){
        String stringPrecio = String.valueOf(this.impuestos());
        return stringPrecio;
    }
     
      
    public String getString_subtotal(){
        String stringPrecio = String.valueOf(this.subtotal());
        return stringPrecio;
    }

     public String getString_totalNeto(){
        String stringPrecio = String.valueOf(this.totalNeto());
        return stringPrecio;
    }
    
    public double descuento(double desc) {
        return (double) this.subtotal() * (100 / desc);
    }

    public double totalNeto(){
        return (double)this.subtotal()-this.impuestos() ;
    }
    
    
    public  boolean agregarProducto(Producto p){        
        return this.productos.add(p);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(String formadePago) {
        this.formadePago = formadePago;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(String FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

   
 

    public Cliente getCliente() {
        return Cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

}