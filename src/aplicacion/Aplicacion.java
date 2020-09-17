package aplicacion;

import static PDF.PDF_Factura.DEST;
import static PDF.PDF_Factura.crearPdf;
import java.io.IOException;
import logica.Factura;

/**
 *
 * @author PC
 */
public class Aplicacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Factura F= new Factura();
        F.impuestos();
        presentacion.aplicacion.Aplicacion_Modelo aplicacion_Modelo;
        presentacion.aplicacion.Aplicacion_View aplicacion_View;
        presentacion.aplicacion.Aplicacion_Control aplicacion_Control;
   
        aplicacion_Modelo =  new presentacion.aplicacion.Aplicacion_Modelo();
        aplicacion_View = new presentacion.aplicacion.Aplicacion_View();
        aplicacion_Control = new presentacion.aplicacion.Aplicacion_Control(aplicacion_Modelo,aplicacion_View);
        
        aplicacion_View.setVisible(true);
        
        crearPdf(DEST);
    }   
}