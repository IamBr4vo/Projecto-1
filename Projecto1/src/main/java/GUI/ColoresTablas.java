/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

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

        component.setForeground(Color.white);

        if (row < int1) {//for the color green
            component.setBackground(Color.green);
        
        } else if (row == int2) {//for the color yellow
            component.setBackground(Color.yellow); 
        }else if (row==int3){ //for the color yellow
            component.setBackground(Color.yellow);
        } else {
            
            component.setBackground(Color.red);
         
        }
        return component;
        
    }
}
