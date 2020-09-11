/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Objects;

/**
 *
 * @author Eva
 */
public class Cliente {
    String nombre;
    String id;
    String correo;
    String provincia;
    String canton;
    String distrito;
    String telefono;

    public Cliente() {
        
    }
    
   
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", id=" + id + ", correo=" + correo + ", provincia=" + provincia + ", canton=" + canton + ", distrito=" + distrito + ", telefono=" + telefono + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public Cliente(String nombre, String id, String correo, String provincia, String canton, String distrito, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTelefono() {
        return telefono;
    }
   
     @Override
   public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.id, other.id);
    }
    
}
