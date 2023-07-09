/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Eithel
 */
public class Diseño extends javax.swing.JFrame {

    /**
     * Creates new form Diseño
     */
    public Diseño() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblAFC = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpnCAF = new javax.swing.JTable();
        btnCAFpartidoXpartido = new javax.swing.JButton();
        btnCAFtodosLOSpartidos = new javax.swing.JButton();
        btnCAFsedeYpaises = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnCONCACAFpartidoXpartido = new javax.swing.JButton();
        btnCONCACAFsedesYpaises = new javax.swing.JButton();
        btnCONCACAFtodosLOSpartidos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnCOMEBOLtodosLOSpartidos = new javax.swing.JButton();
        btnCOMEBOLsedesYpaises = new javax.swing.JButton();
        btnCOMEBOLpartidoXpartido = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btnOFCtodosLOSpartidos = new javax.swing.JButton();
        btnOFCsedesYpaises = new javax.swing.JButton();
        btnOFCpartidoXpartido = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        btnUEFApartidoXpartido = new javax.swing.JButton();
        btnUEFAtodosLOSpartidos = new javax.swing.JButton();
        btnUEFAsedesYpaises = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        btnAFCpartidoXpartido = new javax.swing.JButton();
        btnAFCtodosLOSpartido = new javax.swing.JButton();
        btnAFCsedesYpaises = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpnCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos.", "Selección", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane1.setViewportView(tpnCAF);

        btnCAFpartidoXpartido.setText("Simular partido por partido");

        btnCAFtodosLOSpartidos.setText("Simular todos los partidos");

        btnCAFsedeYpaises.setText("Ver sedes y paises");
        btnCAFsedeYpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAFsedeYpaisesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCAFtodosLOSpartidos)
                    .addComponent(btnCAFsedeYpaises)
                    .addComponent(btnCAFpartidoXpartido))
                .addContainerGap(775, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCAFpartidoXpartido)
                .addGap(23, 23, 23)
                .addComponent(btnCAFtodosLOSpartidos)
                .addGap(18, 18, 18)
                .addComponent(btnCAFsedeYpaises)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        tblAFC.addTab("CAF", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos.", "Seleccion ", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnCONCACAFpartidoXpartido.setText("Simular partido por partido");

        btnCONCACAFsedesYpaises.setText("Ver sedes y paises");
        btnCONCACAFsedesYpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCONCACAFsedesYpaisesActionPerformed(evt);
            }
        });

        btnCONCACAFtodosLOSpartidos.setText("Simular todos los partidos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCONCACAFpartidoXpartido)
                    .addComponent(btnCONCACAFtodosLOSpartidos)
                    .addComponent(btnCONCACAFsedesYpaises))
                .addGap(0, 774, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCONCACAFpartidoXpartido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCONCACAFtodosLOSpartidos)
                .addGap(18, 18, 18)
                .addComponent(btnCONCACAFsedesYpaises)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        tblAFC.addTab("CONCACAF", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Seleccion", "Pts", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        btnCOMEBOLtodosLOSpartidos.setText("Simular todos los partidos");

        btnCOMEBOLsedesYpaises.setText("Ver sedes y paises");
        btnCOMEBOLsedesYpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOMEBOLsedesYpaisesActionPerformed(evt);
            }
        });

        btnCOMEBOLpartidoXpartido.setText("Simular partido por partido");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCOMEBOLpartidoXpartido)
                    .addComponent(btnCOMEBOLtodosLOSpartidos)
                    .addComponent(btnCOMEBOLsedesYpaises))
                .addContainerGap(757, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCOMEBOLpartidoXpartido)
                .addGap(18, 18, 18)
                .addComponent(btnCOMEBOLtodosLOSpartidos)
                .addGap(18, 18, 18)
                .addComponent(btnCOMEBOLsedesYpaises)
                .addContainerGap(431, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        tblAFC.addTab("CONMEBOL", jPanel3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF."
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        btnOFCtodosLOSpartidos.setText("Simular todos los partidos");

        btnOFCsedesYpaises.setText("Ver sedes y paises");
        btnOFCsedesYpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOFCsedesYpaisesActionPerformed(evt);
            }
        });

        btnOFCpartidoXpartido.setText("Simular partido por partido");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOFCsedesYpaises)
                    .addComponent(btnOFCtodosLOSpartidos)
                    .addComponent(btnOFCpartidoXpartido))
                .addContainerGap(758, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnOFCpartidoXpartido)
                .addGap(33, 33, 33)
                .addComponent(btnOFCtodosLOSpartidos)
                .addGap(29, 29, 29)
                .addComponent(btnOFCsedesYpaises)
                .addGap(0, 392, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        tblAFC.addTab("OFC", jPanel5);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Seleccion", "Pts.", "PJ", "PG", "PE", "PE", "GF", "GC", "DIF"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        btnUEFApartidoXpartido.setText("Simular partido por partido");

        btnUEFAtodosLOSpartidos.setText("Simular todos los partidos");

        btnUEFAsedesYpaises.setText("Ver sedes y paises");
        btnUEFAsedesYpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUEFAsedesYpaisesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUEFApartidoXpartido)
                    .addComponent(btnUEFAtodosLOSpartidos)
                    .addComponent(btnUEFAsedesYpaises))
                .addContainerGap(774, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnUEFApartidoXpartido)
                        .addGap(18, 18, 18)
                        .addComponent(btnUEFAtodosLOSpartidos)
                        .addGap(18, 18, 18)
                        .addComponent(btnUEFAsedesYpaises))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblAFC.addTab("UEFA", jPanel4);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Seleccion", "Pts", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        btnAFCpartidoXpartido.setText("Simular partido por partido");

        btnAFCtodosLOSpartido.setText("Simular todos los partidos");

        btnAFCsedesYpaises.setText("Ver sedes y paises");
        btnAFCsedesYpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAFCsedesYpaisesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAFCpartidoXpartido)
                    .addComponent(btnAFCsedesYpaises)
                    .addComponent(btnAFCtodosLOSpartido))
                .addContainerGap(775, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAFCpartidoXpartido)
                        .addGap(18, 18, 18)
                        .addComponent(btnAFCtodosLOSpartido)
                        .addGap(18, 18, 18)
                        .addComponent(btnAFCsedesYpaises))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblAFC.addTab("AFC", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblAFC)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblAFC, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCAFsedeYpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAFsedeYpaisesActionPerformed
        mostrarSedes frame2 = new mostrarSedes(); // Crear una instancia del frame mostrarSedes
        frame2.setVisible(true); // Hacer visible el frame mostrarSedes
        this.dispose(); // Cerrar el frame diseño
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCAFsedeYpaisesActionPerformed

    private void btnCONCACAFsedesYpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCONCACAFsedesYpaisesActionPerformed
        mostrarSedes frame2 = new mostrarSedes(); // Crear una instancia del frame mostrarSedes
        frame2.setVisible(true); // Hacer visible el frame mostrarSedes
        this.dispose(); // Cerrar el frame diseño
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCONCACAFsedesYpaisesActionPerformed

    private void btnCOMEBOLsedesYpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOMEBOLsedesYpaisesActionPerformed
        mostrarSedes frame2 = new mostrarSedes(); // Crear una instancia del frame mostrarSedes
        frame2.setVisible(true); // Hacer visible el frame mostrarSedes
        this.dispose(); // Cerrar el frame diseño
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCOMEBOLsedesYpaisesActionPerformed

    private void btnOFCsedesYpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOFCsedesYpaisesActionPerformed
        mostrarSedes frame2 = new mostrarSedes(); // Crear una instancia del frame mostrarSedes
        frame2.setVisible(true); // Hacer visible el frame mostrarSedes
        this.dispose(); // Cerrar el frame diseño
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnOFCsedesYpaisesActionPerformed

    private void btnUEFAsedesYpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUEFAsedesYpaisesActionPerformed
        mostrarSedes frame2 = new mostrarSedes(); // Crear una instancia del frame mostrarSedes
        frame2.setVisible(true); // Hacer visible el frame mostrarSedes
        this.dispose(); // Cerrar el frame diseño
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnUEFAsedesYpaisesActionPerformed

    private void btnAFCsedesYpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAFCsedesYpaisesActionPerformed
        mostrarSedes frame2 = new mostrarSedes(); // Crear una instancia del frame mostrarSedes
        frame2.setVisible(true); // Hacer visible el frame mostrarSedes
        this.dispose(); // Cerrar el frame diseño
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAFCsedesYpaisesActionPerformed

    /**
     * @param args the command line arguments
     */
    // Botones
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAFCpartidoXpartido;
    private javax.swing.JButton btnAFCsedesYpaises;
    private javax.swing.JButton btnAFCtodosLOSpartido;
    private javax.swing.JButton btnCAFpartidoXpartido;
    private javax.swing.JButton btnCAFsedeYpaises;
    private javax.swing.JButton btnCAFtodosLOSpartidos;
    private javax.swing.JButton btnCOMEBOLpartidoXpartido;
    private javax.swing.JButton btnCOMEBOLsedesYpaises;
    private javax.swing.JButton btnCOMEBOLtodosLOSpartidos;
    private javax.swing.JButton btnCONCACAFpartidoXpartido;
    private javax.swing.JButton btnCONCACAFsedesYpaises;
    private javax.swing.JButton btnCONCACAFtodosLOSpartidos;
    private javax.swing.JButton btnOFCpartidoXpartido;
    private javax.swing.JButton btnOFCsedesYpaises;
    private javax.swing.JButton btnOFCtodosLOSpartidos;
    private javax.swing.JButton btnUEFApartidoXpartido;
    private javax.swing.JButton btnUEFAsedesYpaises;
    private javax.swing.JButton btnUEFAtodosLOSpartidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTabbedPane tblAFC;
    private javax.swing.JTable tpnCAF;
    // End of variables declaration//GEN-END:variables
}
