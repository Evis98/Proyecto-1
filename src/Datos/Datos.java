/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import logica.Cliente;
import logica.Producto;
import logica.Empresa;


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

    public Datos() {
        productos = new ArrayList<>();     
        clientes = new ArrayList<>();
        empresas = new ArrayList<>();
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

    public List<Cliente> getClientes(){
        return clientes;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes =clientes;
    }
    
}
