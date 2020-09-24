package logica;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlAccessType;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//Todo lo que esté debajo de @XmlAccessorType(XmlAccessType.FIELD), será vinculado al XML
@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
    //@XmlID registra las variables declaradas debajo de él como propiedades para un XML
    @XmlID
    private String detalle;
    private String medida;
    private String codigo;
    private double precio_unitario;
    private double cantidad = 0.0;
    
    //Sirve para crear listas de Clientes con los datosdeclarados con @XmlID
    @XmlIDREF
    private List<Producto> productos;
    
    public Producto(String detalle,  String medida, String codigo, double precio_unitario) {
        this.detalle = detalle;
        this.medida = medida;
        this.codigo = codigo;
        this.precio_unitario = precio_unitario;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public Producto() {       
    }
    
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
 
    @Override
    public String toString() {
        return  codigo ;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
    
    public String getString_Precio_unitario(){
        String stringPrecio = String.valueOf(precio_unitario);
        return stringPrecio;
    }
      public String getString_Cantidad(){
        String stringC = String.valueOf(cantidad);
        return stringC;
    }
}