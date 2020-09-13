/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

import javax.xml.bind.annotation.XmlIDREF;

import javax.xml.bind.annotation.XmlAccessType;
/**
 *
 * @author Ivan
 */
 @XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
    @XmlID
    private String detalle;
    private int capacidad;
    private String medida;
    private String codigo;
    private double precio_unitario;
    public double setPrecio_unitario;
@XmlIDREF
private List<Producto> productos;
    public Producto(String detalle, int capacidad, String medida, String codigo, double precio_unitario) {
        this.detalle = detalle;
        this.capacidad = capacidad;
        this.medida = medida;
        this.codigo = codigo;
        this.precio_unitario = precio_unitario;
    }
    
    public Producto() {
        
    }
    
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
  
}
