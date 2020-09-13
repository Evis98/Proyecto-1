/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Datos.Datos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javafx.scene.chart.PieChart.Data;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.PropertyException;
import  javax.xml.bind.annotation.XmlAccessType;
import  javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Daniel
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlPersister {
     private String path;
    private static XmlPersister theInstanceXml;
    public static XmlPersister TheinstanceXml()
        {
        if (theInstanceXml==null){ 
            theInstanceXml=new XmlPersister();
        }
        return theInstanceXml;
    }
    public XmlPersister() {
        path="pruebaNuevoXmlTipoCliente.xml";
    }    

    public XmlPersister(String path) {
        this.path = path;
    }

    public Datos load() throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Datos.class);
        FileInputStream is = new FileInputStream(path);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Datos result = (Datos) unmarshaller.unmarshal(is);
        is.close();
        return result;
    }

    public void store(Datos d) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Datos.class);
        FileOutputStream os = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(d, os);
        os.flush();
        os.close();
    }
}

