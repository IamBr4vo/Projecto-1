/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Logica.Confederacion;
import Logica.Equipo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eithel
 */
public class Diseño extends javax.swing.JFrame {

    /**
     * Creates new form Diseño
     */
      List<Equipo> africa;
        List<Equipo> america;
        List<Equipo> surAmerica;
        List<Equipo> oceania;
        List<Equipo> europa;
        List<Equipo> asia;
    public Diseño(Confederacion caf,Confederacion concacaf,Confederacion conmebol,Confederacion ofc,Confederacion uefa,Confederacion afc) {
        initComponents();
        africa = caf.getListaEquipos();
        america = concacaf.getListaEquipos();
        surAmerica = conmebol.getListaEquipos();
        oceania = ofc.getListaEquipos();
        europa = uefa.getListaEquipos();
        asia = afc.getListaEquipos();
        llenarTabla(africa);
    }

    public void llenarTabla(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) selecciones.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 1; i < equiposConfederacion.size(); i++) {
            rowData[0] = i;
            rowData[1] = equiposConfederacion.get(i).getNombre();
            rowData[2] = equiposConfederacion.get(i).getPTS();
            rowData[3] = equiposConfederacion.get(i).getPJ();
            rowData[4] = equiposConfederacion.get(i).getPG();
            rowData[5] = equiposConfederacion.get(i).getPE();
            rowData[6] = equiposConfederacion.get(i).getPP();
            rowData[7] = equiposConfederacion.get(i).getGF();
            rowData[8] = equiposConfederacion.get(i).getGC();
            rowData[9] = equiposConfederacion.get(i).getDF();
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        concacaf = new javax.swing.JButton();
        caf = new javax.swing.JButton();
        conmebol = new javax.swing.JButton();
        ofc = new javax.swing.JButton();
        uefa = new javax.swing.JButton();
        afc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selecciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Simular Partido");

        jButton2.setText("Simular Todos Los Partidos");

        jButton3.setText("Ver Sedes Y Paises");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(0, 678, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(59, 59, 59)
                .addComponent(jButton2)
                .addGap(66, 66, 66)
                .addComponent(jButton3)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        concacaf.setText("CONCACAF");
        concacaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concacafActionPerformed(evt);
            }
        });

        caf.setText("CAF");
        caf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafActionPerformed(evt);
            }
        });

        conmebol.setText("CONMEBOL");
        conmebol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conmebolActionPerformed(evt);
            }
        });

        ofc.setText("OFC");
        ofc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofcActionPerformed(evt);
            }
        });

        uefa.setText("UEFA");
        uefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uefaActionPerformed(evt);
            }
        });

        afc.setText("AFC");
        afc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(caf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(concacaf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conmebol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ofc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afc)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concacaf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conmebol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ofc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        selecciones.setBackground(new java.awt.Color(153, 204, 255));
        selecciones.setForeground(new java.awt.Color(153, 204, 255));
        selecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Seleccion", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane1.setViewportView(selecciones);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 460, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void concacafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concacafActionPerformed
       llenarTabla(america);
    }//GEN-LAST:event_concacafActionPerformed

    private void cafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafActionPerformed
       llenarTabla(africa);
    }//GEN-LAST:event_cafActionPerformed

    private void ofcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofcActionPerformed
        llenarTabla(oceania);
    }//GEN-LAST:event_ofcActionPerformed

    private void afcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afcActionPerformed
        llenarTabla(asia);
    }//GEN-LAST:event_afcActionPerformed

    private void uefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uefaActionPerformed
        llenarTabla(europa);
    }//GEN-LAST:event_uefaActionPerformed

    private void conmebolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conmebolActionPerformed
        llenarTabla(surAmerica);
    }//GEN-LAST:event_conmebolActionPerformed

    /**
     * @param args the command line arguments
     */
    // Botones
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afc;
    private javax.swing.JButton caf;
    private javax.swing.JButton concacaf;
    private javax.swing.JButton conmebol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ofc;
    private javax.swing.JTable selecciones;
    private javax.swing.JButton uefa;
    // End of variables declaration//GEN-END:variables
}
