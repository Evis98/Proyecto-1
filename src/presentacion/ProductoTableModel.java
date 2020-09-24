package presentacion;

import logica.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//Las clases TableModel definen la forma de las tablas utilizadas en la interfaz
public class ProductoTableModel extends AbstractTableModel implements TableModel {
    //Define el nombre de las columnas
    String[] cols = {"Descripción", "Tipo de unidad", "Código", "Precio"};               
    List<Producto> rows;

    public ProductoTableModel(List<Producto> rows) {
        this.rows = rows;
    }

    //Define la cantidad de columbas para el TableModel de Producto
    @Override
    public int getColumnCount() {
        return 4;                               
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    //Define en qué columna ubicar la información de la clase Producto
    @Override
    public Object getValueAt(int row, int col) {
        Producto p = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                return p.getDetalle();
            case 1:
                return p.getMedida();
            case 2:
                return p.getCodigo();
            case 3:
                return p.getPrecio_unitario();
            default:
                return "";
        }
    }
}