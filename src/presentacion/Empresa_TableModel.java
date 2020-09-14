package presentacion;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import logica.Empresa;
/**
 *
 * @author Daniel
 */
public class Empresa_TableModel extends AbstractTableModel implements TableModel{
    String[] cols = {"Codigo Actividad", "Nombre Comercial", "Identificacion", "Ubicacion", "Correo", "Telefono", "Fax"};               //
    List<Empresa> rows;   

    public Empresa_TableModel(List<Empresa> rows) {
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return 7;                               
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
    public Object getValueAt(int rowc, int col) {
        Empresa c = rows.get(rowc);
        java.text.DecimalFormat dc = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                return c.getCodigoActividad();
            case 1:
                return c.getNombreComercial();
            case 2:
                return c.getId();
            case 3:
                return c.getUbicacion();
            case 4:
                return c.getCorreo();
            case 5:
                return c.getTelefono();
            case 6:
                return c.getFax();
            default:
                return "";
        }
    }
}