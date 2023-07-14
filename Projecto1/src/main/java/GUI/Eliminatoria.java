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
public class Eliminatoria extends javax.swing.JFrame {

    /**
     * Creates new form Diseño
     */
      List<Equipo> africa;
      List<Equipo> america;
      List<Equipo> surAmerica;
      List<Equipo> oceania;
      List<Equipo> europa;
      List<Equipo> asia;
        
    public Eliminatoria(Confederacion caf,Confederacion concacaf,Confederacion conmebol,Confederacion ofc,Confederacion uefa,Confederacion afc) {
    initComponents();
    africa = caf.getListaEquipos();
    america = concacaf.getListaEquipos();
    surAmerica = conmebol.getListaEquipos();
    oceania = ofc.getListaEquipos();
    europa = uefa.getListaEquipos();
    asia = afc.getListaEquipos();
    
    llenarTablaCAF(africa);       // Llena la tabla de África
    llenarTablaCONCACAF(america);      // Llena la tabla de América
    llenarTablaCONMEBOL(surAmerica);   // Llena la tabla de Suramérica
    llenarTablaOFC(oceania);      // Llena la tabla de Oceanía
    llenarTablaUEFA(europa);       // Llena la tabla de Europa
    llenarTablaAFC(asia);         // Llena la tabla de Asia
}
    //Metodo para llenar la tabla CAF
    public void llenarTablaCAF(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) tblCAF.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 0; i < equiposConfederacion.size(); i++) {
            rowData[0] = i + 1;
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
    //Metodo para llenar la tabla CONCACAF
    public void llenarTablaCONCACAF(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) tblCONCACAF.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 0; i < equiposConfederacion.size(); i++) {
            rowData[0] = i + 1;
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
    //Metodo para llenar la tabla CONMEBOL
    public void llenarTablaCONMEBOL(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) tblCONMEBOL.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 0; i < equiposConfederacion.size(); i++) {
            rowData[0] = i + 1;
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
    //Metodo para llenar la tabla OFC
    public void llenarTablaOFC(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) tblOFC.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 0; i < equiposConfederacion.size(); i++) {
            rowData[0] = i + 1;
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
    //Metodo para llenar la tabla UEFA
    public void llenarTablaUEFA(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) tblUEFA.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 0; i < equiposConfederacion.size(); i++) {
            rowData[0] = i + 1;
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
    //Metodo para llenar la tabla AFC
    public void llenarTablaAFC(List<Equipo> equiposConfederacion) {
        DefaultTableModel model = (DefaultTableModel) tblAFC.getModel();
        model.getDataVector().removeAllElements();
        Object rowData[] = new Object[10];
        for (int i = 0; i < equiposConfederacion.size(); i++) {
            rowData[0] = i + 1;
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

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCAF = new javax.swing.JTable();
        btnSimularUnoCAF = new javax.swing.JButton();
        btnSimularTodosCAF = new javax.swing.JButton();
        btnVerSedesCAF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSimularUnoCONCACAF = new javax.swing.JButton();
        btnSimularTodosCONCACAF = new javax.swing.JButton();
        btnVerSedesCONCACAF = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCONCACAF = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCONMEBOL = new javax.swing.JTable();
        btnSimularUnoCONMEBOL = new javax.swing.JButton();
        btnSimularTodosCONMEBOL = new javax.swing.JButton();
        btnVerSedesCONMEBOL = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOFC = new javax.swing.JTable();
        btnSimularUnoOFC = new javax.swing.JButton();
        btnSimularTodosOFC = new javax.swing.JButton();
        btnVerSedesOFC = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblUEFA = new javax.swing.JTable();
        btnSimularUnoUEFA = new javax.swing.JButton();
        btnSimularTodosUEFA = new javax.swing.JButton();
        btnVerSedesUEFA = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAFC = new javax.swing.JTable();
        btnSimularUnoAFC = new javax.swing.JButton();
        btnSimularTodosAFC = new javax.swing.JButton();
        btnVerSedesAFC = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCAF);

        btnSimularUnoCAF.setText("Simular Partido");
        btnSimularUnoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCAFActionPerformed(evt);
            }
        });

        btnSimularTodosCAF.setText("Simular Todos Los Partidos");

        btnVerSedesCAF.setText("Ver Sedes y Paises");
        btnVerSedesCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCAFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoCAF)
                    .addComponent(btnSimularTodosCAF)
                    .addComponent(btnVerSedesCAF))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnSimularUnoCAF)
                .addGap(56, 56, 56)
                .addComponent(btnSimularTodosCAF)
                .addGap(66, 66, 66)
                .addComponent(btnVerSedesCAF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAF", jPanel1);

        btnSimularUnoCONCACAF.setText("Simular Partido");

        btnSimularTodosCONCACAF.setText("Simular Todos Los Partidos");
        btnSimularTodosCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosCONCACAFActionPerformed(evt);
            }
        });

        btnVerSedesCONCACAF.setText("Ver Sedes y Paises");
        btnVerSedesCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCONCACAFActionPerformed(evt);
            }
        });

        tblCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCONCACAF);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoCONCACAF)
                    .addComponent(btnSimularTodosCONCACAF)
                    .addComponent(btnVerSedesCONCACAF))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnSimularUnoCONCACAF)
                .addGap(56, 56, 56)
                .addComponent(btnSimularTodosCONCACAF)
                .addGap(66, 66, 66)
                .addComponent(btnVerSedesCONCACAF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CONCACAF", jPanel2);

        tblCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCONMEBOL);

        btnSimularUnoCONMEBOL.setText("Simular Partido");

        btnSimularTodosCONMEBOL.setText("Simular Todos Los Partidos");

        btnVerSedesCONMEBOL.setText("Ver Sedes y Paises");
        btnVerSedesCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCONMEBOLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoCONMEBOL)
                    .addComponent(btnSimularTodosCONMEBOL)
                    .addComponent(btnVerSedesCONMEBOL))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnSimularUnoCONMEBOL)
                .addGap(56, 56, 56)
                .addComponent(btnSimularTodosCONMEBOL)
                .addGap(66, 66, 66)
                .addComponent(btnVerSedesCONMEBOL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONMEBOL", jPanel4);

        tblOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblOFC);

        btnSimularUnoOFC.setText("Simular Partido");

        btnSimularTodosOFC.setText("Simular Todos Los Partidos");

        btnVerSedesOFC.setText("Ver Sedes y Paises");
        btnVerSedesOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesOFCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoOFC)
                    .addComponent(btnSimularTodosOFC)
                    .addComponent(btnVerSedesOFC))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnSimularUnoOFC)
                .addGap(56, 56, 56)
                .addComponent(btnSimularTodosOFC)
                .addGap(66, 66, 66)
                .addComponent(btnVerSedesOFC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OFC", jPanel5);

        tblUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblUEFA);

        btnSimularUnoUEFA.setText("Simular Partido");

        btnSimularTodosUEFA.setText("Simular Todos Los Partidos");

        btnVerSedesUEFA.setText("Ver Sedes y Paises");
        btnVerSedesUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesUEFAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoUEFA)
                    .addComponent(btnSimularTodosUEFA)
                    .addComponent(btnVerSedesUEFA))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnSimularUnoUEFA)
                .addGap(56, 56, 56)
                .addComponent(btnSimularTodosUEFA)
                .addGap(66, 66, 66)
                .addComponent(btnVerSedesUEFA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UEFA", jPanel6);

        tblAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pos", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblAFC);

        btnSimularUnoAFC.setText("Simular Partido");
        btnSimularUnoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoAFCActionPerformed(evt);
            }
        });

        btnSimularTodosAFC.setText("Simular Todos Los Partidos");
        btnSimularTodosAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosAFCActionPerformed(evt);
            }
        });

        btnVerSedesAFC.setText("Ver Sedes y Paises");
        btnVerSedesAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesAFCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoAFC)
                    .addComponent(btnSimularTodosAFC)
                    .addComponent(btnVerSedesAFC))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnSimularUnoAFC)
                .addGap(56, 56, 56)
                .addComponent(btnSimularTodosAFC)
                .addGap(66, 66, 66)
                .addComponent(btnVerSedesAFC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AFC", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerSedesCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSedesCAFActionPerformed

    private void btnVerSedesCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesCONCACAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSedesCONCACAFActionPerformed

    private void btnVerSedesCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesCONMEBOLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSedesCONMEBOLActionPerformed

    private void btnVerSedesOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSedesOFCActionPerformed

    private void btnVerSedesUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesUEFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSedesUEFAActionPerformed

    private void btnVerSedesAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSedesAFCActionPerformed

    private void btnSimularTodosCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosCONCACAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodosCONCACAFActionPerformed

    private void btnSimularTodosAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodosAFCActionPerformed

    private void btnSimularUnoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularUnoAFCActionPerformed

    private void btnSimularUnoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularUnoCAFActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimularTodosAFC;
    private javax.swing.JButton btnSimularTodosCAF;
    private javax.swing.JButton btnSimularTodosCONCACAF;
    private javax.swing.JButton btnSimularTodosCONMEBOL;
    private javax.swing.JButton btnSimularTodosOFC;
    private javax.swing.JButton btnSimularTodosUEFA;
    private javax.swing.JButton btnSimularUnoAFC;
    private javax.swing.JButton btnSimularUnoCAF;
    private javax.swing.JButton btnSimularUnoCONCACAF;
    private javax.swing.JButton btnSimularUnoCONMEBOL;
    private javax.swing.JButton btnSimularUnoOFC;
    private javax.swing.JButton btnSimularUnoUEFA;
    private javax.swing.JButton btnVerSedesAFC;
    private javax.swing.JButton btnVerSedesCAF;
    private javax.swing.JButton btnVerSedesCONCACAF;
    private javax.swing.JButton btnVerSedesCONMEBOL;
    private javax.swing.JButton btnVerSedesOFC;
    private javax.swing.JButton btnVerSedesUEFA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAFC;
    private javax.swing.JTable tblCAF;
    private javax.swing.JTable tblCONCACAF;
    private javax.swing.JTable tblCONMEBOL;
    private javax.swing.JTable tblOFC;
    private javax.swing.JTable tblUEFA;
    // End of variables declaration//GEN-END:variables
}
