package aplicacion;

//import static PDF.PDF_Factura.DEST;
//import static PDF.PDF_Factura.crearPdf;
import Datos.Datos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import logica.Factura;
import logica.Producto;
import presentacion.Cliente_TableModel;
import presentacion.Empresa_TableModel;
import presentacion.Producto_TableModel;
import presentacion.cliente.Cliente_Control;
import presentacion.cliente.Cliente_View;
import presentacion.empresa.Empresa_Control;
import presentacion.empresa.Empresa_View;
import presentacion.producto.Producto_Control;
import presentacion.producto.Producto_View;

/**
 *
 * @author PC
 */
public class Aplicacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
//        Factura F = new Factura();
//        Producto p = new Producto("H","H","H",10.5);
//        List<Producto> productos = new ArrayList<>();
//        System.out.println(F.linea(p,2));
//        productos.add(p);
//        System.out.println(F.impuestos(productos));
        presentacion.aplicacion.Aplicacion_Modelo aplicacion_Modelo;
        presentacion.aplicacion.Aplicacion_View aplicacion_View;
        presentacion.aplicacion.Aplicacion_Control aplicacion_Control;
   
        aplicacion_Modelo =  new presentacion.aplicacion.Aplicacion_Modelo();
        aplicacion_View = new presentacion.aplicacion.Aplicacion_View();
        aplicacion_Control = new presentacion.aplicacion.Aplicacion_Control(aplicacion_Modelo,aplicacion_View);
        
        aplicacion_View.setVisible(true);
        
        //crearPdf(DEST);
    }   
}