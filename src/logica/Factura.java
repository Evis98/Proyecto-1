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
    String numeroFactura;
    Empresa empresa;
    Cliente Cliente;
    Producto producto;
    String observaciones;
    String formadePago;
    double impuestos;
    double subtotal;
    double totalNeto;
    double precioTP;
    @XmlIDREF
    List<Producto> productos;

    

   
    public Factura(String FechaEmision, String numeroFactura, Empresa empresa, Cliente Cliente, Producto producto, String observaciones, String formadePago, double impuestos, double subtotal, double totalNeto, List<Producto> productos) {
        this.FechaEmision = FechaEmision;
        this.numeroFactura = numeroFactura;
        this.empresa = empresa;
        this.Cliente = Cliente;
        this.producto = producto;
        this.observaciones = observaciones;
        this.formadePago = formadePago;
        this.impuestos = impuestos;
        this.subtotal = subtotal;
        this.totalNeto = totalNeto;
         this.productos = productos;
         
    }
    

    public Factura() {   productos = new ArrayList<>();  }
      
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
   

    public double getImpuestos() {
        return impuestos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

 

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }
    public double subtotal(List<Producto> productos) {
        double newSubtotal = 0;
        if (this.productos.isEmpty()) 
            return (double) 0.0;
         else {
            for (Producto p: productos) 
//                newSubtotal +=p.getPrecio_unitario(); 
                 newSubtotal +=precioTP;
            return (double) newSubtotal;
        }
    }
    
     public double impuestos(List<Producto> productos) {
        double newImpuestos = 0;
        if (this.productos.isEmpty()) 
            return (double) 0.0;
         else {
            for (Producto p: productos) 
//                newImpuestos +=p.getPrecio_unitario()*0.13;  
                newImpuestos+=precioTP*0.13;
            return (double) newImpuestos;
        }
    }
    
      public String getString_impuestos(){
        String stringPrecio = String.valueOf(this.impuestos(productos));
        return stringPrecio;
    }
     

    public String getString_subtotal(){
        String stringPrecio = String.valueOf(this.subtotal(productos));
        return stringPrecio;
    }

     public String getString_totalNeto(){
        String stringPrecio = String.valueOf(this.totalNeto(productos));
        return stringPrecio;
    }
    
    public double descuento(double desc) {
        return (double) this.subtotal(productos) * (100 / desc);
    }

    public double totalNeto(List<Producto> productos){
        return (double)this.subtotal(productos)-this.impuestos(productos) ;
    }
    
    
    public  boolean agregarProducto(Producto p){        
        return this.productos.add(p);
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

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
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

    public void linea(Producto p,double cantidad){
        if(!p.getCodigo().equals(p))
        p.setCantidad(cantidad);
        agregarProducto(p);
        precioTP= p.getPrecio_unitario()*p.getCantidad();
        
        
        
        }
    }
