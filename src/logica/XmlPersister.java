package logica;

import Datos.Datos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import  javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//@XmlRootElement Convierte "Datos" en la raíz de la base para los XML
@XmlRootElement
//Todo lo que esté debajo de @XmlAccessorType(XmlAccessType.FIELD), será vinculado al XML
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlPersister {
    private String path;
    private static XmlPersister theInstanceXml;

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
 
    //Define el nombre del archivo .xml que funge como base de datos
    public static XmlPersister TheinstanceXml() {
        if (theInstanceXml==null){ 
            theInstanceXml=new XmlPersister("DataBase.xml");
        }
        return theInstanceXml;
    }
    
    //Permite definir el nombre del archivo .xml que funge como base de datos, según el nombre ingresado
    public static XmlPersister TheinstanceXml(String ruta) {
        if (theInstanceXml==null){ 
            theInstanceXml=new XmlPersister(ruta);
        }
        return theInstanceXml;
    }
    
    public XmlPersister() {
        path=" ";
    }    

    public XmlPersister(String path) {
        this.path = path;
    }

    //Carga la informacion de un XML, convitiendo los datos legible para formato XML, a de información el las clases
    public Datos load() throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Datos.class);
        FileInputStream is = new FileInputStream(path);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Datos result = (Datos) unmarshaller.unmarshal(is);
        is.close();
        return result;
    }

    //Guarda la informacion en un XML, convitiendo los datos, de información el las clases a datos legible para formato XML
    public void store(Datos d) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Datos.class);
        FileOutputStream os = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(d, os);
        os.flush();
        os.close();
    }
}