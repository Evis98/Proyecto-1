package aplicacion;

//import static PDF.PDF_Factura.DEST;
//import static PDF.PDF_Factura.crearPdf;
//import Datos.Datos;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import logica.Factura;
//import logica.Producto;
//import presentacion.Cliente_TableModel;
//import presentacion.Empresa_TableModel;
//import presentacion.Producto_TableModel;
//import presentacion.cliente.Cliente_Control;
//import presentacion.cliente.Cliente_View;
//import presentacion.empresa.Empresa_Control;
//import presentacion.empresa.Empresa_View;
//import presentacion.producto.Producto_Control;
//import presentacion.producto.Producto_View;

/**
 *
 * @author PC
 */
public class Aplicacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {

        presentacion.aplicacion.AplicacionModelo aplicacion_Modelo;
        presentacion.aplicacion.AplicacionView aplicacion_View;
        presentacion.aplicacion.AplicacionControl aplicacion_Control;
   
        aplicacion_Modelo =  new presentacion.aplicacion.AplicacionModelo();
        aplicacion_View = new presentacion.aplicacion.AplicacionView();
        aplicacion_Control = new presentacion.aplicacion.AplicacionControl(aplicacion_Modelo,aplicacion_View);
        
        aplicacion_View.setVisible(true);
    }   
}