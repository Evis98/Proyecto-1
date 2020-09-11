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

/**
 *
 * @author Daniel
 */
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

    public Data load() throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
        FileInputStream is = new FileInputStream(path);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Data result = (Data) unmarshaller.unmarshal(is);
        is.close();
        return result;
    }

    public void store(Datos d) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
        FileOutputStream os = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(d, os);
        os.flush();
        os.close();
    }
}
