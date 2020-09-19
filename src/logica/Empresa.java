package logica;

import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlIDREF;
/**
 *
 * @author Daniel
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Empresa {
    @XmlID    
    private String codigoActividad;
    private String nombreComercial;
    private String id;
    private String ubicacion;
    private String correo;
    private String telefono; 
    private String fax;
    @XmlIDREF
    private List<Empresa> empresas;

    public Empresa(String codigoActividad, String nombreComercial, String id, String ubicacion, String correo, String telefono, String fax) {
        this.codigoActividad = codigoActividad;
        this.nombreComercial = nombreComercial;
        this.id = id;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
        this.fax = fax;
    }
    
    public Empresa() {   }

    @Override
    public String toString() {
        return  nombreComercial;
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.id, other.id);
    }  
}