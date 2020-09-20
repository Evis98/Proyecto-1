package presentacion;

import java.util.List;
import logica.Factura;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * 
 * @author Ivan
 */
public class Factura_TableModel extends AbstractTableModel implements TableModel {
    String[] cols = {"Numero", "Cliente", "FormadePago", "Total","Subtotal", "Impuesto"};               
    List<Factura> rows;

    public Factura_TableModel(List<Factura> rows) {
        this.rows = rows;
    }

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

    @Override
    public Object getValueAt(int row, int col) {
        Factura f = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                return f.getNumeroFactura();
            case 1:
                return f.getCliente().getNombre();
            case 2:
                return f.getFormadePago();
            case 3:
                return f.getString_subtotal();
            case 4:
                return f.getString_totalNeto();
            case 5:
                return f.getString_impuestos();
            default:
                return "";
        }
    }
}
