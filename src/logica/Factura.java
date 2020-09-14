/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


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
//    public double cantidad;

    public String observaciones;
    public String formadePago;


    
    Producto p;
//    public double Precio_x_Cantidad(){
//        return p.getPrecio_unitario()*cantidad;
//    }
  

//   public float subtotal(){
//    
//   }
//   public double impuesto(){
//       double i;
//       i=subtotal()*1,13;
//  
//       return i;
//   }
}
