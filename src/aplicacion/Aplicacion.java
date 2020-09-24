package aplicacion;

import java.io.IOException;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
public class Aplicacion {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {

        //Declara a las clases AplicacionControl, AplicacionModelo y AplicacionView
        presentacion.aplicacion.AplicacionModelo aplicacion_Modelo;
        presentacion.aplicacion.AplicacionView aplicacion_View;
        presentacion.aplicacion.AplicacionControl aplicacion_Control;
   
        //Llama a las clases AplicacionControl, AplicacionModelo y AplicacionView
        aplicacion_Modelo =  new presentacion.aplicacion.AplicacionModelo();
        aplicacion_View = new presentacion.aplicacion.AplicacionView();
        aplicacion_Control = new presentacion.aplicacion.AplicacionControl(aplicacion_Modelo,aplicacion_View);
        
        //Muestra la pantalla AplcacionView al complicar el programa
        aplicacion_View.setVisible(true);
    }   
}