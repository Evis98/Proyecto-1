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
    String[] cols ={"Descripción","Unidad", "Código",/*"Precio"*/ };               //
    List<Producto> rows;

    public  Producto_TableModel(List<Producto> rows){
        this.rows=rows;
    }

    public int getColumnCount() {
        return 3;                               //SON 3
    }

    public String getColumnName(int col){
        return cols[col];
    }

    public int getRowCount() {
        return rows.size();
    }
    
    public Object getValueAt(int row, int col) {
        Producto p = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col){
            case 0: return p.getDetalle();
            case 1: return p.getCodigo();
            case 2: return p.getMedida();
            //case 2:return p.getPrecio_unitario();           //
            default: return "";
        }
    }    
}
/**
 *
 * @author Ivan
 */