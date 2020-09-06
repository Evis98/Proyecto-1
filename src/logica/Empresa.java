/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Daniel
 */
public class Empresa {
    
private String codigoActividad;
private String nombreComercial;
private String id;
private String ubicacion;
private String correo;
private String telefono; 
private String fax;

    public Empresa(String codigoActividad, String nombreComercial, String id, String ubicacion, String correo, String telefono, String fax) {
        this.codigoActividad = codigoActividad;
        this.nombreComercial = nombreComercial;
        this.id = id;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
        this.fax = fax;
    }

    public Empresa() {
    }

    @Override
    public String toString() {
        return "Empresa{" + "codigoActividad=" + codigoActividad + ", nombreComercial=" + nombreComercial + ", id=" + id + ", ubicacion=" + ubicacion + ", correo=" + correo + ", telefono=" + telefono + ", fax=" + fax + '}';
    }

    public String getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(String codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


}
