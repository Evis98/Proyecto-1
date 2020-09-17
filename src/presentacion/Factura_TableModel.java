package presentacion;

import java.util.List;
import logica.Factura;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import logica.Producto;

/**
 *
 * @author Ivan
 */
public class Factura_TableModel extends AbstractTableModel implements TableModel {
    String[] cols = {"Cantidad", "Código", "Descripción", "Precio", "Total"};               
    List<Producto> rows;

    public Factura_TableModel(List<Producto> rows) {
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return 5;                               
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public Object getValueAt(int row, int col) {
        Producto p = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                //return f.getDetalle();
            case 1:
                //return f.getMedida();
            case 2:
                //return f.getCodigo();
            case 3:
                //return f.getPrecio_unitario();

            default:
                return "";
        }
    }
}
