/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import logica.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ivan
 */
public class Producto_TableModel extends AbstractTableModel implements TableModel {

    String[] cols = {"Descripción", "Código",/*"Precio"*/};               //
    List<Producto> rows;

    public Producto_TableModel(List<Producto> rows) {
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return 2;                               //SON 3
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
                return p.getCodigo();
            case 2:
                return p.getPrecio_unitario();           //
            default:
                return "";
        }
    }
}
