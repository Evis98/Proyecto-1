package presentacion;

import logica.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Ivan
 */
public class ProductoTableModel extends AbstractTableModel implements TableModel {
    String[] cols = {"Descripción", "Tipo de unidad", "Código", "Precio"};               
    List<Producto> rows;

    public ProductoTableModel(List<Producto> rows) {
        this.rows = rows;
    }

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