/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

//Holi

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
    public int cantidad;
    public String moneda; //metodo de pago
    public String observaciones;
    public String formadePago;
    public String plazo= " ";
    public double TipodeCambio=589.76;
    
    Producto p;
    public double Precio_x_Cantidad(){
        return p.getPrecio_unitario()*cantidad;
    }
  

//   public float subtotal(){
//    Daniel??   
//   }
//   public double impuesto(){
//       double i;
//       i=subtotal()*1,13;
//  
//       return i;
//   }
}
