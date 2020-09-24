package presentacion;

import logica.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
//Las clases TableModel definen la forma de las tablas utilizadas en la interfaz
public class ClienteTableModel extends AbstractTableModel implements TableModel {
    //Define el nombre de las columnas
    String[] cols = {"Nombre", "Id", "Correo", "Provincia", "Canton", "Distrito", "Telefono"};               
    List<Cliente> rows;

    public ClienteTableModel(List<Cliente> rows) {
        this.rows = rows;
    }

    //Define la cantidad de columbas para el TableModel de Cliente
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
    
    //Define en qué columna ubicar la información de la clase Cliente
    @Override
    public Object getValueAt(int rowc, int col) {
        Cliente c = rows.get(rowc);
        java.text.DecimalFormat dc = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                return c.getNombre();
            case 1:
                return c.getId();
            case 2:
                return c.getCorreo();
            case 3:
                return c.getProvincia();
            case 4:
                return c.getCanton();
            case 5:
                return c.getDistrito();
            case 6:
                return c.getTelefono();
            default:
                return "";
        }
    }    
}