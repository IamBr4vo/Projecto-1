package Logica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author fabri
 */
public class ColoresTablas extends DefaultTableCellRenderer {

    private int int1;
    private int int2;
    private int int3;

    public ColoresTablas(int int1, int int2, int int3) {
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        component.setForeground(Color.black);

        if (row < getInt1()) {
            component.setBackground(new Color(153, 255, 84)); // Green color
        } else if (row == getInt2() || row == getInt3()) {
            component.setBackground(new Color(255, 255, 84)); // Yellow color
        } else {
            component.setBackground(new Color(255, 72, 84)); // Red color
        }

        return component;

    }

    /**
     * @return the int1
     */
    public int getInt1() {
        return int1;
    }

    /**
     * @param int1 the int1 to set
     */
    public void setInt1(int int1) {
        this.int1 = int1;
    }

    /**
     * @return the int2
     */
    public int getInt2() {
        return int2;
    }

    /**
     * @param int2 the int2 to set
     */
    public void setInt2(int int2) {
        this.int2 = int2;
    }

    /**
     * @return the int3
     */
    public int getInt3() {
        return int3;
    }

    /**
     * @param int3 the int3 to set
     */
    public void setInt3(int int3) {
        this.int3 = int3;
    }
}
