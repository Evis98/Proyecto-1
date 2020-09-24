package presentacion;

import java.util.List;
import logica.Factura;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * 
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//Las clases TableModel definen la forma de las tablas utilizadas en la interfaz
public class FacturaTableModel extends AbstractTableModel implements TableModel {
    //Define el nombre de las columnas
    String[] cols = {"Numero", "Cliente", "FormadePago", "Impuesto","Total","Subtotal", };               
    List<Factura> rows;

    public FacturaTableModel(List<Factura> rows) {
        this.rows = rows;
    }

    //Define la cantidad de columbas para el TableModel de Factura
    @Override
    public int getColumnCount() {
        return 6;                               
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    //Define en qué columna ubicar la información de la clase Factura
    @Override
    public Object getValueAt(int row, int col) {
        Factura f = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
       
        //Convierte los tipos de dato double a String para poder ser impresas en pantalla
        String stringImpuesto = String.valueOf(f.getImpuestos());
        String stringTotal = String.valueOf(f.getTotalNeto());
        String stringSub = String.valueOf(f.getSubtotal());
  
        switch (col) {
            case 0:
                return f.getNumeroFactura();
            case 1:
                return f.getCliente().getNombre();
            case 2:
                return f.getFormadePago();
            case 3:
                return stringImpuesto;
            case 4:
                return stringSub;
                        
            case 5:
                return stringTotal;
            default:
                return "";
        }
    }
}
