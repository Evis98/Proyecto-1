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
    String[] cols = {"Numero", "Cliente", "FormadePago", "Impuesto","Total","Subtotal", };               
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
                return stringTotal;
            case 5:
                return stringSub;
            default:
                return "";
        }
    }
}
