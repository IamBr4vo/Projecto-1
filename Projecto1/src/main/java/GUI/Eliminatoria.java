package GUI;

import Logica.ColoresTablas;
import Logica.Confederacion;
import Logica.Equipo;
import Logica.Partido;
import Logica.Sede;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eithel
 */
public class Eliminatoria extends javax.swing.JFrame {

    private boolean partidoJugadoCAF = false;
    private boolean partidoJugadoCONCACAF = false;
    private boolean partidoJugadoCONMEBOL = false;
    private boolean partidoJugadoOFC = false;
    private boolean partidoJugadoUEFA = false;
    private boolean partidoJugadoAFC = false;

    private List<Equipo> equiposCONCACAF;
    private List<Equipo> equiposCAF;
    private List<Equipo> equiposCONMEBOL;
    private List<Equipo> equiposOFC;
    private List<Equipo> equiposUEFA;
    private List<Equipo> equiposAFC;
    private List<Partido> enfrentamientosCAF;
    private List<Partido> enfrentamientosCONCACAF;
    private List<Partido> enfrentamientosCONMEBOL;
    private List<Partido> enfrentamientosOFC;
    private List<Partido> enfrentamientosUEFA;
    private List<Partido> enfrentamientosAFC;

    private int enfrentamientoActualCAF;
    private int enfrentamientoActualCONCACAF;
    private int enfrentamientoActualCONMEBOL;
    private int enfrentamientoActualOFC;
    private int enfrentamientoActualUEFA;
    private int enfrentamientoActualAFC;

    // Array to keep track of the teams that have already played each other
    private boolean[][] equiposYaJugaronCAF;
    private boolean[][] equiposYaJugaronCONCACAF;
    private boolean[][] equiposYaJugaronCONMEBOL;
    private boolean[][] equiposYaJugaronOFC;
    private boolean[][] equiposYaJugaronUEFA;
    private boolean[][] equiposYaJugaronAFC;

    List<Equipo> africa;
    List<Equipo> america;
    List<Equipo> surAmerica;
    List<Equipo> oceania;
    List<Equipo> europa;
    List<Equipo> asia;
    
    private List<Sede> listaSedes;

    private String informeMarcadoresCAF = "";
    private String informeMarcadoresCONCACAF = "";
    private String informeMarcadoresCONMEBOL = "";
    private String informeMarcadoresOFC = "";
    private String informeMarcadoresUEFA = "";
    private String informeMarcadoresAFC = "";


    public Eliminatoria(Confederacion caf, Confederacion concacaf, Confederacion conmebol, Confederacion ofc, Confederacion uefa, Confederacion afc) {
    initComponents();
    
    listaSedes = new ArrayList<>();
    
    // Crear sedes para Estados Unidos
    Sede USA1 = new Sede("Atlanta", "Estados Unidos");
    Sede USA2 = new Sede("Boston", "Estados Unidos");
    Sede USA3 = new Sede("Dallas", "Estados Unidos");
    Sede USA4 = new Sede("Houston", "Estados Unidos");
    Sede USA5 = new Sede("Kansas City", "Estados Unidos");
    Sede USA6 = new Sede("Los Ángeles", "Estados Unidos");
    Sede USA7 = new Sede("Miami", "Estados Unidos");
    Sede USA8 = new Sede("Nueva York/Nueva Jersey", "Estados Unidos");
    Sede USA9 = new Sede("Filadelfia", "Estados Unidos");
    Sede USA10 = new Sede("San Francisco", "Estados Unidos");
    Sede USA11 = new Sede("Seattle", "Estados Unidos");
    
    // Agregar sedes de Estados Unidos a la lista
    listaSedes.add(USA1);
    listaSedes.add(USA2);
    listaSedes.add(USA3);
    listaSedes.add(USA4);
    listaSedes.add(USA5);
    listaSedes.add(USA6);
    listaSedes.add(USA7);
    listaSedes.add(USA8);
    listaSedes.add(USA9);
    listaSedes.add(USA10);
    listaSedes.add(USA11);
    
    // Crear sedes para México
    Sede MEX1 = new Sede("Guadalajara", "México");
    Sede MEX2 = new Sede("Ciudad de México", "México");
    Sede MEX3 = new Sede("Monterrey", "México");
    
    // Agregar sedes de México a la lista
    listaSedes.add(MEX1);
    listaSedes.add(MEX2);
    listaSedes.add(MEX3);
       
    // Crear sedes para Canadá
    Sede CAN1 = new Sede("Vancouver", "Canadá");
    Sede CAN2 = new Sede("Toronto", "Canadá");
        
    // Agregar sedes de Canadá a la lista
    listaSedes.add(CAN1);
    listaSedes.add(CAN2);

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

    inicializarEnfrentamientosAleatoriosCONCACAF();
    inicializarEnfrentamientosAleatoriosCONMEBOL();
    inicializarEnfrentamientosAleatoriosCAF();
    inicializarEnfrentamientosAleatoriosOFC();
    inicializarEnfrentamientosAleatoriosUEFA();
    inicializarEnfrentamientosAleatoriosAFC();
}
    //Method to fill the CAF table
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
        tblCAF.setShowGrid(false); // Quitar las líneas de la tabla
    }

    //Method to fill the CONCACAF table
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
        tblCONCACAF.setShowGrid(false); // Quitar las líneas de la tabla
    }

    //Method to fill the CONMEBOL table
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
        tblCONMEBOL.setShowGrid(false); // Quitar las líneas de la tabla
    }

    //Method to fill the OFC table
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
        tblOFC.setShowGrid(false); // Quitar las líneas de la tabla
    }

    //Method to fill the UEFA table
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
        tblUEFA.setShowGrid(false); // Quitar las líneas de la tabla
    }

    //Method to fill the AFC table
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
        tblAFC.setShowGrid(false); // Quitar las líneas de la tabla
    }

//Method to update the position tables of each team
    private void actualizarTablaCAF(List<Equipo> equipos) {
        // Sort the list of teams based on points and goal difference
        equipos.sort((equipo1, equipo2) -> {
            // Compare the points
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // In case of a tie on points, compare the goal difference
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Clean a table
        DefaultTableModel model = (DefaultTableModel) tblCAF.getModel();
        model.getDataVector().removeAllElements();

        // Fill the table with the sorted data
        Object rowData[] = new Object[10];
        for (int i = 0; i < equipos.size(); i++) {
            rowData[0] = i + 1;
            rowData[1] = equipos.get(i).getNombre();
            rowData[2] = equipos.get(i).getPTS();
            rowData[3] = equipos.get(i).getPJ();
            rowData[4] = equipos.get(i).getPG();
            rowData[5] = equipos.get(i).getPE();
            rowData[6] = equipos.get(i).getPP();
            rowData[7] = equipos.get(i).getGF();
            rowData[8] = equipos.get(i).getGC();
            rowData[9] = equipos.get(i).getDF();
            model.addRow(rowData);
        }
    }

    private void actualizarTablaCONCACAF(List<Equipo> equipos) {
        // Sort the list of teams based on points and goal difference
        equipos.sort((equipo1, equipo2) -> {
            // Compare the points
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // In case of a tie on points, compare the goal difference
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Clear the table
        DefaultTableModel model = (DefaultTableModel) tblCONCACAF.getModel();
        model.getDataVector().removeAllElements();

        // Fill the table with the sorted data
        Object rowData[] = new Object[10];
        for (int i = 0; i < equipos.size(); i++) {
            rowData[0] = i + 1;
            rowData[1] = equipos.get(i).getNombre();
            rowData[2] = equipos.get(i).getPTS();
            rowData[3] = equipos.get(i).getPJ();
            rowData[4] = equipos.get(i).getPG();
            rowData[5] = equipos.get(i).getPE();
            rowData[6] = equipos.get(i).getPP();
            rowData[7] = equipos.get(i).getGF();
            rowData[8] = equipos.get(i).getGC();
            rowData[9] = equipos.get(i).getDF();
            model.addRow(rowData);
        }
    }

    private void actualizarTablaCONMEBOL(List<Equipo> equipos) {
        // Ordenar la lista de equipos según los puntos y la diferencia de goles
        equipos.sort((equipo1, equipo2) -> {
            // Comparar los puntos
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // En caso de empate en puntos, comparar la diferencia de goles
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tblCONMEBOL.getModel();
        model.getDataVector().removeAllElements();

        // Llenar la tabla con los datos ordenados
        Object rowData[] = new Object[10];
        for (int i = 0; i < equipos.size(); i++) {
            rowData[0] = i + 1;
            rowData[1] = equipos.get(i).getNombre();
            rowData[2] = equipos.get(i).getPTS();
            rowData[3] = equipos.get(i).getPJ();
            rowData[4] = equipos.get(i).getPG();
            rowData[5] = equipos.get(i).getPE();
            rowData[6] = equipos.get(i).getPP();
            rowData[7] = equipos.get(i).getGF();
            rowData[8] = equipos.get(i).getGC();
            rowData[9] = equipos.get(i).getDF();
            model.addRow(rowData);
        }
    }

    private void actualizarTablaOFC(List<Equipo> equipos) {
        // Ordenar la lista de equipos según los puntos y la diferencia de goles
        equipos.sort((equipo1, equipo2) -> {
            // Comparar los puntos
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // En caso de empate en puntos, comparar la diferencia de goles
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tblOFC.getModel();
        model.getDataVector().removeAllElements();

        // Llenar la tabla con los datos ordenados
        Object rowData[] = new Object[10];
        for (int i = 0; i < equipos.size(); i++) {
            rowData[0] = i + 1;
            rowData[1] = equipos.get(i).getNombre();
            rowData[2] = equipos.get(i).getPTS();
            rowData[3] = equipos.get(i).getPJ();
            rowData[4] = equipos.get(i).getPG();
            rowData[5] = equipos.get(i).getPE();
            rowData[6] = equipos.get(i).getPP();
            rowData[7] = equipos.get(i).getGF();
            rowData[8] = equipos.get(i).getGC();
            rowData[9] = equipos.get(i).getDF();
            model.addRow(rowData);
        }
    }

    private void actualizarTablaUEFA(List<Equipo> equipos) {
        // Ordenar la lista de equipos según los puntos y la diferencia de goles
        equipos.sort((equipo1, equipo2) -> {
            // Comparar los puntos
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // En caso de empate en puntos, comparar la diferencia de goles
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tblUEFA.getModel();
        model.getDataVector().removeAllElements();

        // Llenar la tabla con los datos ordenados
        Object rowData[] = new Object[10];
        for (int i = 0; i < equipos.size(); i++) {
            rowData[0] = i + 1;
            rowData[1] = equipos.get(i).getNombre();
            rowData[2] = equipos.get(i).getPTS();
            rowData[3] = equipos.get(i).getPJ();
            rowData[4] = equipos.get(i).getPG();
            rowData[5] = equipos.get(i).getPE();
            rowData[6] = equipos.get(i).getPP();
            rowData[7] = equipos.get(i).getGF();
            rowData[8] = equipos.get(i).getGC();
            rowData[9] = equipos.get(i).getDF();
            model.addRow(rowData);
        }
    }

    private void actualizarTablaAFC(List<Equipo> equipos) {
        // Ordenar la lista de equipos según los puntos y la diferencia de goles
        equipos.sort((equipo1, equipo2) -> {
            // Comparar los puntos
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // En caso de empate en puntos, comparar la diferencia de goles
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tblAFC.getModel();
        model.getDataVector().removeAllElements();

        // Llenar la tabla con los datos ordenados
        Object rowData[] = new Object[10];
        for (int i = 0; i < equipos.size(); i++) {
            rowData[0] = i + 1;
            rowData[1] = equipos.get(i).getNombre();
            rowData[2] = equipos.get(i).getPTS();
            rowData[3] = equipos.get(i).getPJ();
            rowData[4] = equipos.get(i).getPG();
            rowData[5] = equipos.get(i).getPE();
            rowData[6] = equipos.get(i).getPP();
            rowData[7] = equipos.get(i).getGF();
            rowData[8] = equipos.get(i).getGC();
            rowData[9] = equipos.get(i).getDF();
            model.addRow(rowData);
        }
    }

    //Method to update the statistics of each team
    private void actualizarEstadisticasEquipo(Equipo equipo, int golesAFavor, int golesEnContra) {
        equipo.aumentarPartidosJugados(); // Incrementar los partidos jugados

        if (golesAFavor > golesEnContra) {
            equipo.actualizarPuntos(3); // Increase games played
            equipo.aumentarPartidosGanados(); // Increase matches won
        } else if (golesAFavor < golesEnContra) {
            equipo.aumentarPartidosPerdidos(); // Increase games lost
        } else {
            equipo.actualizarPuntos(1); // Increase points (for tie)
            equipo.aumentarPartidosEmpatados(); // Increase tied games
        }

        equipo.calcularDiferenciaGoles();// Calculate goal difference
    }

    // Method to initialize matches appropriately for CAF
    private void inicializarEnfrentamientosAleatoriosCAF() {
        equiposCAF = new ArrayList<>(africa);
        int numEquipos = equiposCAF.size();
        equiposYaJugaronCAF = new boolean[numEquipos][numEquipos];
        enfrentamientosCAF = generarEnfrentamientosCAF(equiposCAF);
        enfrentamientoActualCAF = 0;
        btnSimularUnoCAF.setEnabled(true);
    }

    // Method to initialize matches appropriately for CONCACAF
    private void inicializarEnfrentamientosAleatoriosCONCACAF() {
        equiposCONCACAF = new ArrayList<>(america);
        int numEquipos = equiposCONCACAF.size();
        equiposYaJugaronCONCACAF = new boolean[numEquipos][numEquipos];
        enfrentamientosCONCACAF = generarEnfrentamientosCONCACAF(equiposCONCACAF);
        enfrentamientoActualCONCACAF = 0;
        btnSimularUnoCONCACAF.setEnabled(true);
    }

    // Method to initialize matches appropriately for CONMEBOL
    private void inicializarEnfrentamientosAleatoriosCONMEBOL() {
        equiposCONMEBOL = new ArrayList<>(surAmerica);
        int numEquipos = equiposCONMEBOL.size();
        equiposYaJugaronCONMEBOL = new boolean[numEquipos][numEquipos];
        enfrentamientosCONMEBOL = generarEnfrentamientosCONMEBOL(equiposCONMEBOL);
        enfrentamientoActualCONMEBOL = 0;
        btnSimularUnoCONMEBOL.setEnabled(true);
    }

    // Method to initialize matches appropriately for OFC
    private void inicializarEnfrentamientosAleatoriosOFC() {
        equiposOFC = new ArrayList<>(oceania);
        int numEquipos = equiposOFC.size();
        equiposYaJugaronOFC = new boolean[numEquipos][numEquipos];
        enfrentamientosOFC = generarEnfrentamientosOFC(equiposOFC);
        enfrentamientoActualOFC = 0;
        btnSimularUnoOFC.setEnabled(true);
    }

    // Method to initialize matches appropriately for UEFA
    private void inicializarEnfrentamientosAleatoriosUEFA() {
        equiposUEFA = new ArrayList<>(europa);
        int numEquipos = equiposUEFA.size();
        equiposYaJugaronUEFA = new boolean[numEquipos][numEquipos];
        enfrentamientosUEFA = generarEnfrentamientosUEFA(equiposUEFA);
        enfrentamientoActualUEFA = 0;
        btnSimularUnoUEFA.setEnabled(true);
    }
// Method to initialize matches appropriately for AFC

    private void inicializarEnfrentamientosAleatoriosAFC() {
        equiposAFC = new ArrayList<>(asia);
        int numEquipos = equiposAFC.size();
        equiposYaJugaronAFC = new boolean[numEquipos][numEquipos];
        enfrentamientosAFC = generarEnfrentamientosAFC(equiposAFC);
        enfrentamientoActualAFC = 0;
        btnSimularUnoAFC.setEnabled(true);
    }

// Method to initialize matches appropriately for CAF
    private List<Partido> generarEnfrentamientosCAF(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                // Check if the match has already been played by the 2 teams
                if (!equiposYaJugaronCAF[i][j] && !equiposYaJugaronCAF[j][i]) {
                    Partido partido = new Partido(equiposCAF);
                    partido.setEquipo1(equipoLocal);
                    partido.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partido);

                    // Update the array of teams already played
                    equiposYaJugaronCAF[i][j] = true;
                    equiposYaJugaronCAF[j][i] = true;

                    Partido partidoVuelta = new Partido(equiposCAF);
                    partidoVuelta.setEquipo1(equipoVisitante);
                    partidoVuelta.setEquipo2(equipoLocal);
                    enfrentamientos.add(partidoVuelta);
                }
            }
        }

        Collections.shuffle(enfrentamientos);
        return enfrentamientos;
    }

// Method to generate the matches without replays for CONCACAF
    private List<Partido> generarEnfrentamientosCONCACAF(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                // Check if the match has already been played by the 2 teams
                if (!equiposYaJugaronCONCACAF[i][j] && !equiposYaJugaronCONCACAF[j][i]) {
                    Partido partido = new Partido(equiposCONCACAF);
                    partido.setEquipo1(equipoLocal);
                    partido.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partido);

                    // Update the array of teams already played
                    equiposYaJugaronCONCACAF[i][j] = true;
                    equiposYaJugaronCONCACAF[j][i] = true;

                    Partido partidoVuelta = new Partido(equiposCONCACAF);
                    partidoVuelta.setEquipo1(equipoVisitante);
                    partidoVuelta.setEquipo2(equipoLocal);
                    enfrentamientos.add(partidoVuelta);
                }
            }
        }

        Collections.shuffle(enfrentamientos);
        return enfrentamientos;
    }

// Method to generate matchups without replays for CONMEBOL
    private List<Partido> generarEnfrentamientosCONMEBOL(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        // Check if the match has already been played by the 2 teams
        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                // Check if the match has already been played by the 2 teams
                if (!equiposYaJugaronCONMEBOL[i][j] && !equiposYaJugaronCONMEBOL[j][i]) {
                    Partido partidoIda = new Partido(equiposCONMEBOL);
                    partidoIda.setEquipo1(equipoLocal);
                    partidoIda.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partidoIda);
                    equiposYaJugaronCONMEBOL[i][j] = true;
                    equiposYaJugaronCONMEBOL[j][i] = true;

                    // Update the array of teams already played
                    Partido partidoVuelta = new Partido(equiposCONMEBOL);
                    partidoVuelta.setEquipo1(equipoVisitante);
                    partidoVuelta.setEquipo2(equipoLocal);
                    enfrentamientos.add(partidoVuelta);
                }
            }
        }

        Collections.shuffle(enfrentamientos);
        return enfrentamientos;
    }

// Método para generar los enfrentamientos sin repeticiones para OFC
    private List<Partido> generarEnfrentamientosOFC(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                // Verificar si el enfrentamiento ya ha sido jugado por ambos equipos
                if (!equiposYaJugaronOFC[i][j] && !equiposYaJugaronOFC[j][i]) {
                    Partido partido = new Partido(equiposOFC);
                    partido.setEquipo1(equipoLocal);
                    partido.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partido);

                    // Actualizar la matriz de equipos ya jugaron
                    equiposYaJugaronOFC[i][j] = true;
                    equiposYaJugaronOFC[j][i] = true;

                    Partido partidoVuelta = new Partido(equiposOFC);
                    partidoVuelta.setEquipo1(equipoVisitante);
                    partidoVuelta.setEquipo2(equipoLocal);
                    enfrentamientos.add(partidoVuelta);
                }
            }
        }

        Collections.shuffle(enfrentamientos);
        return enfrentamientos;
    }

    private List<Partido> generarEnfrentamientosUEFA(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                // Verificar si el enfrentamiento ya ha sido jugado por ambos equipos
                if (!equiposYaJugaronUEFA[i][j] && !equiposYaJugaronUEFA[j][i]) {
                    Partido partido = new Partido(equiposUEFA);
                    partido.setEquipo1(equipoLocal);
                    partido.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partido);

                    // Actualizar la matriz de equipos ya jugaron
                    equiposYaJugaronUEFA[i][j] = true;
                    equiposYaJugaronUEFA[j][i] = true;

                    Partido partidoVuelta = new Partido(equiposUEFA);
                    partidoVuelta.setEquipo1(equipoVisitante);
                    partidoVuelta.setEquipo2(equipoLocal);
                    enfrentamientos.add(partidoVuelta);
                }
            }
        }

        Collections.shuffle(enfrentamientos);
        return enfrentamientos;
    }

    private List<Partido> generarEnfrentamientosAFC(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                // Verificar si el enfrentamiento ya ha sido jugado por ambos equipos
                if (!equiposYaJugaronAFC[i][j] && !equiposYaJugaronAFC[j][i]) {
                    Partido partido = new Partido(equiposAFC);
                    partido.setEquipo1(equipoLocal);
                    partido.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partido);

                    // Actualizar la matriz de equipos ya jugaron
                    equiposYaJugaronAFC[i][j] = true;
                    equiposYaJugaronAFC[j][i] = true;

                    Partido partidoVuelta = new Partido(equiposAFC);
                    partidoVuelta.setEquipo1(equipoVisitante);
                    partidoVuelta.setEquipo2(equipoLocal);
                    enfrentamientos.add(partidoVuelta);
                }
            }
        }

        Collections.shuffle(enfrentamientos);
        return enfrentamientos;
    }
    
// Método para obtener una sede aleatoria de la lista de sedes
    private Sede obtenerSedeAleatoria() {
        if (listaSedes.isEmpty()) {
        throw new IllegalStateException("La lista de sedes está vacía, asegúrate de agregar sedes antes de llamar a este método.");
    }
        Random random = new Random();
        int index = random.nextInt(listaSedes.size());
        return listaSedes.get(index);
    }

    // Método para obtener el país de una sede específica
    private String obtenerPaisDeSede(String paisSede) {
    for (Sede s : listaSedes) {
        if (s.getSede().equals(paisSede)) {
            return s.getPaisSede();
        }
    }
    return "País no encontrado";
    }
   
    public void obtenerMarcadorCAF(String equipo1, int golequipo1, String equipo2, int golequipo2) {
        String informe = "Informe del partido:\n";
        informe += "Equipos: " + equipo1 + " vs " + equipo2 + "\n";
        informe += equipo1 + ": " + golequipo1 + " goles\n";
        informe += equipo2 + ": " + golequipo2 + " goles\n";
        
        // Obtener sede aleatoria de la lista de sedes
        Sede sedeAleatoria = obtenerSedeAleatoria();
        // Agregar información de la sede aleatoria y el país de la sede
        System.out.println("Sede aleatoria: " + sedeAleatoria.getSede());
        System.out.println("País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()));
        
        informe += "El partido se jugó en la sede de " + sedeAleatoria.getSede() + "\n";
        informe += "País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()) + "\n";

        // Almacenar la información en la variable global
        informeMarcadoresCAF += informe + "\n";
    }
    
    public void obtenerMarcadorCONCACAF(String equipo1, int golequipo1, String equipo2, int golequipo2) {
    String informe = "Informe del partido:\n";
    informe += "Equipos: " + equipo1 + " vs " + equipo2 + "\n";
    informe += equipo1 + ": " + golequipo1 + " goles\n";
    informe += equipo2 + ": " + golequipo2 + " goles\n";

    // Obtener sede aleatoria de la lista de sedes
    Sede sedeAleatoria = obtenerSedeAleatoria();

    // Agregar información de la sede aleatoria y el país de la sede
    System.out.println("Sede aleatoria: " + sedeAleatoria.getSede());
    System.out.println("País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()));

    informe += "El partido se jugó en la sede de " + sedeAleatoria.getSede() + "\n";
    informe += "País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()) + "\n";

    // Almacenar la información en la variable global
    informeMarcadoresCONCACAF += informe + "\n";
    }
    
    public void obtenerMarcadorCONMEBOL(String equipo1, int golequipo1, String equipo2, int golequipo2) {
    String informe = "Informe del partido:\n";
    informe += "Equipos: " + equipo1 + " vs " + equipo2 + "\n";
    informe += equipo1 + ": " + golequipo1 + " goles\n";
    informe += equipo2 + ": " + golequipo2 + " goles\n";
    // Obtener sede aleatoria de la lista de sedes
    Sede sedeAleatoria = obtenerSedeAleatoria();

    // Agregar información de la sede aleatoria y el país de la sede
    System.out.println("Sede aleatoria: " + sedeAleatoria.getSede());
    System.out.println("País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()));

    informe += "El partido se jugó en la sede de " + sedeAleatoria.getSede() + "\n";
    informe += "País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()) + "\n";
    // Almacenar la información en la variable global
    informeMarcadoresCONMEBOL += informe + "\n";
    }
    
    public void obtenerMarcadorOFC(String equipo1, int golequipo1, String equipo2, int golequipo2) {
    String informe = "Informe del partido:\n";
    informe += "Equipos: " + equipo1 + " vs " + equipo2 + "\n";
    informe += equipo1 + ": " + golequipo1 + " goles\n";
    informe += equipo2 + ": " + golequipo2 + " goles\n";
    // Obtener sede aleatoria de la lista de sedes
    Sede sedeAleatoria = obtenerSedeAleatoria();

    // Agregar información de la sede aleatoria y el país de la sede
    System.out.println("Sede aleatoria: " + sedeAleatoria.getSede());
    System.out.println("País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()));

    informe += "El partido se jugó en la sede de " + sedeAleatoria.getSede() + "\n";
    informe += "País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()) + "\n";
    // Almacenar la información en la variable global
    informeMarcadoresOFC += informe + "\n";
    }
     
    public void obtenerMarcadorUEFA(String equipo1, int golequipo1, String equipo2, int golequipo2) {
    String informe = "Informe del partido:\n";
    informe += "Equipos: " + equipo1 + " vs " + equipo2 + "\n";
    informe += equipo1 + ": " + golequipo1 + " goles\n";
    informe += equipo2 + ": " + golequipo2 + " goles\n";
    // Obtener sede aleatoria de la lista de sedes
    Sede sedeAleatoria = obtenerSedeAleatoria();

    // Agregar información de la sede aleatoria y el país de la sede
    System.out.println("Sede aleatoria: " + sedeAleatoria.getSede());
    System.out.println("País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()));

    informe += "El partido se jugó en la sede de " + sedeAleatoria.getSede() + "\n";
    informe += "País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()) + "\n";
    // Almacenar la información en la variable global
    informeMarcadoresUEFA += informe + "\n";
    }
     
    public void obtenerMarcadorAFC(String equipo1, int golequipo1, String equipo2, int golequipo2) {
    String informe = "Informe del partido:\n";
    informe += "Equipos: " + equipo1 + " vs " + equipo2 + "\n";
    informe += equipo1 + ": " + golequipo1 + " goles\n";
    informe += equipo2 + ": " + golequipo2 + " goles\n";
    
    // Obtener sede aleatoria de la lista de sedes
    Sede sedeAleatoria = obtenerSedeAleatoria();

    // Agregar información de la sede aleatoria y el país de la sede
    System.out.println("Sede aleatoria: " + sedeAleatoria.getSede());
    System.out.println("País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()));

    informe += "El partido se jugó en la sede de " + sedeAleatoria.getSede() + "\n";
    informe += "País de la sede: " + obtenerPaisDeSede(sedeAleatoria.getSede()) + "\n";
    // Almacenar la información en la variable global
    informeMarcadoresAFC += informe + "\n";
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
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCAF = new javax.swing.JTable();
        btnSimularUnoCAF = new javax.swing.JButton();
        btnSimularTodosCAF = new javax.swing.JButton();
        btnVerSedesCAF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCAF = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnSimularUnoCONCACAF = new javax.swing.JButton();
        btnSimularTodosCONCACAF = new javax.swing.JButton();
        btnVerSedesCONCACAF = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCONCACAF = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtCONCACAF = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCONMEBOL = new javax.swing.JTable();
        btnSimularUnoCONMEBOL = new javax.swing.JButton();
        btnSimularTodosCONMEBOL = new javax.swing.JButton();
        btnVerSedesCONMEBOL = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtCONMEBOL = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOFC = new javax.swing.JTable();
        btnSimularUnoOFC = new javax.swing.JButton();
        btnSimularTodosOFC = new javax.swing.JButton();
        btnVerSedesOFC = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtOFC = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblUEFA = new javax.swing.JTable();
        btnSimularUnoUEFA = new javax.swing.JButton();
        btnSimularTodosUEFA = new javax.swing.JButton();
        btnVerSedesUEFA = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtUEFA = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAFC = new javax.swing.JTable();
        btnSimularUnoAFC = new javax.swing.JButton();
        btnSimularTodosAFC = new javax.swing.JButton();
        btnVerSedesAFC = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAFC = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane12.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 153));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Confederaciónes"));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCAF.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
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
        tblCAF.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblCAF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCAF.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tblCAF);
        if (tblCAF.getColumnModel().getColumnCount() > 0) {
            tblCAF.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCAF.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCAF.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblCAF.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 850, 510));

        btnSimularUnoCAF.setText("Simular Partido");
        btnSimularUnoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCAFActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularUnoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        btnSimularTodosCAF.setText("Simular Todos Los Partidos");
        btnSimularTodosCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosCAFActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularTodosCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        btnVerSedesCAF.setText("Ver Sedes y Paises");
        btnVerSedesCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCAFActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerSedesCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));

        txtCAF.setColumns(20);
        txtCAF.setRows(5);
        jScrollPane2.setViewportView(txtCAF);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 390, 420));

        jTabbedPane1.addTab("CAF", jPanel1);

        btnSimularUnoCONCACAF.setText("Simular Partido");
        btnSimularUnoCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCONCACAFActionPerformed(evt);
            }
        });

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

        tblCONCACAF.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
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
        tblCONCACAF.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(tblCONCACAF);
        if (tblCONCACAF.getColumnModel().getColumnCount() > 0) {
            tblCONCACAF.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCONCACAF.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCONCACAF.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblCONCACAF.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

        txtCONCACAF.setColumns(20);
        txtCONCACAF.setRows(5);
        jScrollPane8.setViewportView(txtCONCACAF);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularTodosCONCACAF)
                    .addComponent(btnSimularUnoCONCACAF)
                    .addComponent(btnVerSedesCONCACAF)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSimularUnoCONCACAF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimularTodosCONCACAF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerSedesCONCACAF)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONCACAF", jPanel2);

        tblCONMEBOL.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
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
        tblCONMEBOL.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(tblCONMEBOL);
        if (tblCONMEBOL.getColumnModel().getColumnCount() > 0) {
            tblCONMEBOL.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCONMEBOL.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCONMEBOL.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblCONMEBOL.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

        btnSimularUnoCONMEBOL.setText("Simular Partido");
        btnSimularUnoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCONMEBOLActionPerformed(evt);
            }
        });

        btnSimularTodosCONMEBOL.setText("Simular Todos Los Partidos");
        btnSimularTodosCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosCONMEBOLActionPerformed(evt);
            }
        });

        btnVerSedesCONMEBOL.setText("Ver Sedes y Paises");
        btnVerSedesCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCONMEBOLActionPerformed(evt);
            }
        });

        txtCONMEBOL.setColumns(20);
        txtCONMEBOL.setRows(5);
        jScrollPane9.setViewportView(txtCONMEBOL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularUnoCONMEBOL)
                    .addComponent(btnVerSedesCONMEBOL)
                    .addComponent(btnSimularTodosCONMEBOL)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSimularUnoCONMEBOL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimularTodosCONMEBOL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerSedesCONMEBOL)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONMEBOL", jPanel4);

        tblOFC.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
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
        tblOFC.setGridColor(new java.awt.Color(51, 51, 51));
        tblOFC.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tblOFC.setSelectionForeground(new java.awt.Color(51, 51, 255));
        jScrollPane5.setViewportView(tblOFC);
        if (tblOFC.getColumnModel().getColumnCount() > 0) {
            tblOFC.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblOFC.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblOFC.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblOFC.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

        btnSimularUnoOFC.setText("Simular Partido");
        btnSimularUnoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoOFCActionPerformed(evt);
            }
        });

        btnSimularTodosOFC.setText("Simular Todos Los Partidos");
        btnSimularTodosOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosOFCActionPerformed(evt);
            }
        });

        btnVerSedesOFC.setText("Ver Sedes y Paises");
        btnVerSedesOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesOFCActionPerformed(evt);
            }
        });

        txtOFC.setColumns(20);
        txtOFC.setRows(5);
        jScrollPane10.setViewportView(txtOFC);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularTodosOFC)
                    .addComponent(btnSimularUnoOFC)
                    .addComponent(btnVerSedesOFC)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSimularUnoOFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimularTodosOFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerSedesOFC)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OFC", jPanel5);

        tblUEFA.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
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
        tblUEFA.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(tblUEFA);
        if (tblUEFA.getColumnModel().getColumnCount() > 0) {
            tblUEFA.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblUEFA.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblUEFA.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblUEFA.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

        btnSimularUnoUEFA.setText("Simular Partido");
        btnSimularUnoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoUEFAActionPerformed(evt);
            }
        });

        btnSimularTodosUEFA.setText("Simular Todos Los Partidos");
        btnSimularTodosUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosUEFAActionPerformed(evt);
            }
        });

        btnVerSedesUEFA.setText("Ver Sedes y Paises");
        btnVerSedesUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesUEFAActionPerformed(evt);
            }
        });

        txtUEFA.setColumns(20);
        txtUEFA.setRows(5);
        jScrollPane11.setViewportView(txtUEFA);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularTodosUEFA)
                    .addComponent(btnSimularUnoUEFA)
                    .addComponent(btnVerSedesUEFA)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnSimularUnoUEFA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimularTodosUEFA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerSedesUEFA)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UEFA", jPanel6);

        tblAFC.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
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
        tblAFC.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane7.setViewportView(tblAFC);
        if (tblAFC.getColumnModel().getColumnCount() > 0) {
            tblAFC.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblAFC.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblAFC.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblAFC.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

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

        txtAFC.setColumns(20);
        txtAFC.setRows(5);
        jScrollPane13.setViewportView(txtAFC);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimularTodosAFC)
                    .addComponent(btnSimularUnoAFC)
                    .addComponent(btnVerSedesAFC)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnSimularUnoAFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimularTodosAFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerSedesAFC)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AFC", jPanel7);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Clasificación al Mundial 2026");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerSedesCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesCAFActionPerformed
        txtCAF.setText(informeMarcadoresCAF);

    }//GEN-LAST:event_btnVerSedesCAFActionPerformed

    private void btnVerSedesCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesCONCACAFActionPerformed
        txtCONCACAF.setText(informeMarcadoresCONCACAF);
    }//GEN-LAST:event_btnVerSedesCONCACAFActionPerformed

    private void btnVerSedesCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesCONMEBOLActionPerformed
        txtCONMEBOL.setText(informeMarcadoresCONMEBOL);
    }//GEN-LAST:event_btnVerSedesCONMEBOLActionPerformed

    private void btnVerSedesOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesOFCActionPerformed
        txtOFC.setText(informeMarcadoresOFC);
    }//GEN-LAST:event_btnVerSedesOFCActionPerformed

    private void btnVerSedesUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesUEFAActionPerformed
        txtUEFA.setText(informeMarcadoresUEFA);
    }//GEN-LAST:event_btnVerSedesUEFAActionPerformed

    private void btnVerSedesAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSedesAFCActionPerformed
        txtAFC.setText(informeMarcadoresAFC);
    }//GEN-LAST:event_btnVerSedesAFCActionPerformed

    private void btnSimularTodosCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosCONCACAFActionPerformed
        // Colors for the table
        ColoresTablas renderer2 = new ColoresTablas(6, 6, 7);
        tblCONCACAF.setDefaultRenderer(Object.class, renderer2);
        // Check if the matches have already been played
        if (!partidoJugadoCONCACAF) {
            btnSimularTodosCONCACAF.setEnabled(false);
            btnSimularUnoCONCACAF.setEnabled(false);
            // Obtain the list of teams from the CAF confederation
            List<Equipo> equiposCONCACAF = america;

            // Simulate the matches between all the teams of the CAF confederation
            while (enfrentamientoActualCONCACAF < enfrentamientosCONCACAF.size()) {
                Partido partido = enfrentamientosCONCACAF.get(enfrentamientoActualCONCACAF);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                // Simulate the match
                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorCONCACAF(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                // Update team points and stats
                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                // Increase the rate of the current matchup
                enfrentamientoActualCONCACAF++;
            }

            // Update the flag indicating that the matches have already been played
            partidoJugadoCONCACAF = true;

            // Update the CAF confederation table
            llenarTablaCONCACAF(equiposCONCACAF);
            // Update the CAF confederation table
            actualizarTablaCONCACAF(equiposCONCACAF);
        }

    }//GEN-LAST:event_btnSimularTodosCONCACAFActionPerformed

    private void btnSimularTodosAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosAFCActionPerformed
        ColoresTablas renderer6 = new ColoresTablas(8, 8, 0);
        tblAFC.setDefaultRenderer(Object.class, renderer6);

        // Check if the matches have already been played
        if (!partidoJugadoAFC) {
            btnSimularTodosAFC.setEnabled(false);
            btnSimularUnoAFC.setEnabled(false);
            // Obtain the list of teams from the CAF confederation
            List<Equipo> equiposAFC = asia;

            // Simulate the matches between all the teams of the CAF confederation
            while (enfrentamientoActualAFC < enfrentamientosAFC.size()) {
                Partido partido = enfrentamientosAFC.get(enfrentamientoActualAFC);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                // Simulate the match
                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorAFC(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                // Update team points and stats
                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                // Increase the rate of the current matchup
                enfrentamientoActualAFC++;

            }

            // Update the flag indicating that the matches have already been played
            partidoJugadoAFC = true;

            // Update the CAF confederation table
            llenarTablaAFC(equiposAFC);
            actualizarTablaAFC(equiposAFC);

    }//GEN-LAST:event_btnSimularTodosAFCActionPerformed
    }
    private void btnSimularUnoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoAFCActionPerformed

        ColoresTablas renderer6 = new ColoresTablas(8, 8, 0);
        tblAFC.setDefaultRenderer(Object.class, renderer6);

        if (enfrentamientoActualAFC >= enfrentamientosAFC.size()) {
            // Disable button when all matches are done
            btnSimularUnoAFC.setEnabled(false);
            btnSimularTodosAFC.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosAFC.get(enfrentamientoActualAFC);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simular el partido
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorAFC(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Actualizar los puntos y estadísticas de los equipos
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Incrementar el índice del enfrentamiento actual
        enfrentamientoActualAFC++;

        // Actualizar la tabla de la confederación CAF
        llenarTablaAFC(equiposAFC);
        // Actualizar la tabla de la confederación CAF
        actualizarTablaAFC(equiposAFC);

    }//GEN-LAST:event_btnSimularUnoAFCActionPerformed

    private void btnSimularUnoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCAFActionPerformed
        ColoresTablas renderer1 = new ColoresTablas(9, 9, 0);
        tblCAF.setDefaultRenderer(Object.class, renderer1);
        if (enfrentamientoActualCAF >= enfrentamientosCAF.size()) {
            // Desactivar el botón cuando todos los enfrentamientos se han realizado
            btnSimularUnoCAF.setEnabled(false);
            btnSimularTodosCAF.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosCAF.get(enfrentamientoActualCAF);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simular el partido
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorCAF(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Actualizar los puntos y estadísticas de los equipos
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Incrementar el índice del enfrentamiento actual
        enfrentamientoActualCAF++;

        // Actualizar la tabla de la confederación CAF
        llenarTablaCAF(equiposCAF);
        // Actualizar la tabla de la confederación CAF
        actualizarTablaCAF(equiposCAF);

    }//GEN-LAST:event_btnSimularUnoCAFActionPerformed


    private void btnSimularTodosCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosCONMEBOLActionPerformed

        ColoresTablas renderer3 = new ColoresTablas(6, 6, 0);
        tblCONMEBOL.setDefaultRenderer(Object.class, renderer3);
        // Verificar si los partidos ya se han jugado
        if (!partidoJugadoCONMEBOL) {
            btnSimularTodosCONMEBOL.setEnabled(false);
            btnSimularUnoCONMEBOL.setEnabled(false);
            // Obtener la lista de equipos de la confederación CONMEBOL
            List<Equipo> equiposCONMEBOL = surAmerica;

            // Simular los partidos entre todos los equipos de la confederación CONMEBOL
            while (enfrentamientoActualCONMEBOL < enfrentamientosCONMEBOL.size()) {
                Partido partido = enfrentamientosCONMEBOL.get(enfrentamientoActualCONMEBOL);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                // Simular el partido
                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorCONMEBOL(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                // Actualizar los puntos y estadísticas de los equipos
                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                // Incrementar el índice del enfrentamiento actual
                enfrentamientoActualCONMEBOL++;
            }

            // Actualizar la bandera indicando que los partidos ya se han jugado
            partidoJugadoCONMEBOL = true;

            // Actualizar la tabla de la confederación CONMEBOL
            llenarTablaCONMEBOL(equiposCONMEBOL);
            // Actualizar la tabla de la confederación CONMEBOL
            actualizarTablaCONMEBOL(equiposCONMEBOL);

    }//GEN-LAST:event_btnSimularTodosCONMEBOLActionPerformed
    }
    private void btnSimularTodosCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosCAFActionPerformed
        ColoresTablas renderer1 = new ColoresTablas(9, 9, 0);
        tblCAF.setDefaultRenderer(Object.class, renderer1);
        // Verificar si los partidos ya se han jugado
        if (!partidoJugadoCAF) {
            btnSimularTodosCAF.setEnabled(false);
            btnSimularUnoCAF.setEnabled(false);
            // Obtener la lista de equipos de la confederación CAF
            List<Equipo> equiposCAF = africa;

            // Simular los partidos entre todos los equipos de la confederación CAF
            while (enfrentamientoActualCAF < enfrentamientosCAF.size()) {
                Partido partido = enfrentamientosCAF.get(enfrentamientoActualCAF);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                // Simular el partido
                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorCAF(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                // Actualizar los puntos y estadísticas de los equipos
                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                // Incrementar el índice del enfrentamiento actual
                enfrentamientoActualCAF++;
            }

            // Actualizar la bandera indicando que los partidos ya se han jugado
            partidoJugadoCAF = true;

            // Actualizar la tabla de la confederación CAF
            llenarTablaCAF(equiposCAF);
            // Actualizar la tabla de la confederación CAF
            actualizarTablaCAF(equiposCAF);
        }
    }//GEN-LAST:event_btnSimularTodosCAFActionPerformed

    private void btnSimularTodosOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosOFCActionPerformed
        //se lleno la tabla 4 
        ColoresTablas renderer4 = new ColoresTablas(1, 1, 0);
        tblOFC.setDefaultRenderer(Object.class, renderer4);
        // Verificar si los partidos ya se han jugado
        if (!partidoJugadoOFC) {
            btnSimularTodosOFC.setEnabled(false);
            btnSimularUnoOFC.setEnabled(false);
            // Obtener la lista de equipos de la confederación CAF
            List<Equipo> equiposOFC = oceania;

            // Simular los partidos entre todos los equipos de la confederación CAF
            while (enfrentamientoActualOFC < enfrentamientosOFC.size()) {
                Partido partido = enfrentamientosOFC.get(enfrentamientoActualOFC);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                // Simular el partido
                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorOFC(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                // Actualizar los puntos y estadísticas de los equipos
                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                // Incrementar el índice del enfrentamiento actual
                enfrentamientoActualOFC++;
            }

            // Actualizar la bandera indicando que los partidos ya se han jugado
            partidoJugadoOFC = true;

            // Actualizar la tabla de la confederación OFC
            llenarTablaOFC(equiposOFC);
            // Actualizar la tabla de la confederación OFC
            actualizarTablaOFC(equiposOFC);

    }//GEN-LAST:event_btnSimularTodosOFCActionPerformed
    }
    private void btnSimularTodosUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosUEFAActionPerformed

        ColoresTablas renderer5 = new ColoresTablas(16, 0, 0);
        tblUEFA.setDefaultRenderer(Object.class, renderer5);

// Verificar si los partidos ya se han jugado
        if (!partidoJugadoUEFA) {
            btnSimularTodosUEFA.setEnabled(false);
            btnSimularUnoUEFA.setEnabled(false);
            // Obtener la lista de equipos de la confederación CAF
            List<Equipo> equiposUEFA = europa;

            // Simular los partidos entre todos los equipos de la confederación CAF
            while (enfrentamientoActualUEFA < enfrentamientosUEFA.size()) {
                Partido partido = enfrentamientosUEFA.get(enfrentamientoActualUEFA);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                // Simular el partido
                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorUEFA(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                // Actualizar los puntos y estadísticas de los equipos
                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                // Incrementar el índice del enfrentamiento actual
                enfrentamientoActualUEFA++;
            }

            // Actualizar la bandera indicando que los partidos ya se han jugado
            partidoJugadoUEFA = true;

            // Actualizar la tabla de la confederación OFC
            llenarTablaUEFA(equiposUEFA);
            // Actualizar la tabla de la confederación OFC
            actualizarTablaUEFA(equiposUEFA);
    }//GEN-LAST:event_btnSimularTodosUEFAActionPerformed
    }
    private void btnSimularUnoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoOFCActionPerformed
        //Colorear tabla OFC
        ColoresTablas renderer4 = new ColoresTablas(1, 1, 0);
        tblOFC.setDefaultRenderer(Object.class, renderer4);

        if (enfrentamientoActualOFC >= enfrentamientosOFC.size()) {
            // Desactivar el botón cuando todos los enfrentamientos se han realizado
            btnSimularUnoOFC.setEnabled(false);
            btnSimularTodosOFC.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosOFC.get(enfrentamientoActualOFC);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simular el partido
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorOFC(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Actualizar los puntos y estadísticas de los equipos
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Incrementar el índice del enfrentamiento actual
        enfrentamientoActualOFC++;

        // Actualizar la tabla de la confederación OFC
        llenarTablaOFC(equiposOFC);
        // Actualizar la tabla de la confederación OFC
        actualizarTablaOFC(equiposOFC);
    }//GEN-LAST:event_btnSimularUnoOFCActionPerformed

    private void btnSimularUnoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoUEFAActionPerformed

        ColoresTablas renderer5 = new ColoresTablas(16, 0, 0);
        tblUEFA.setDefaultRenderer(Object.class, renderer5);

        if (enfrentamientoActualUEFA >= enfrentamientosUEFA.size()) {
            // Desactivar el botón cuando todos los enfrentamientos se han realizado
            btnSimularUnoUEFA.setEnabled(false);
            btnSimularTodosUEFA.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosUEFA.get(enfrentamientoActualUEFA);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simular el partido
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorUEFA(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Actualizar los puntos y estadísticas de los equipos
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Incrementar el índice del enfrentamiento actual
        enfrentamientoActualUEFA++;

        // Actualizar la tabla de la confederación OFC
        llenarTablaUEFA(equiposUEFA);
        // Actualizar la tabla de la confederación OFC
        actualizarTablaUEFA(equiposUEFA);
    }//GEN-LAST:event_btnSimularUnoUEFAActionPerformed

    private void btnSimularUnoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCONMEBOLActionPerformed

        ColoresTablas renderer3 = new ColoresTablas(6, 6, 0);
        tblCONMEBOL.setDefaultRenderer(Object.class, renderer3);

        // Verificar si se han jugado todos los enfrentamientos
        if (enfrentamientoActualCONMEBOL >= enfrentamientosCONMEBOL.size()) {
            // Desactivar el botón cuando todos los enfrentamientos se han realizado
            btnSimularUnoCONMEBOL.setEnabled(false);
            btnSimularTodosCONMEBOL.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosCONMEBOL.get(enfrentamientoActualCONMEBOL);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simular el partido
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorCONMEBOL(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Actualizar los puntos y estadísticas de los equipos
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Incrementar el índice del enfrentamiento actual
        enfrentamientoActualCONMEBOL++;

        // Actualizar la tabla de la confederación CONMEBOL
        llenarTablaCONMEBOL(equiposCONMEBOL);
        // Actualizar la tabla de la confederación CONMEBOL
        actualizarTablaCONMEBOL(equiposCONMEBOL);

    }//GEN-LAST:event_btnSimularUnoCONMEBOLActionPerformed

    private void btnSimularUnoCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCONCACAFActionPerformed
        // Colors for the table
        ColoresTablas renderer2 = new ColoresTablas(6, 6, 7);
        tblCONCACAF.setDefaultRenderer(Object.class, renderer2);
        if (enfrentamientoActualCONCACAF >= enfrentamientosCONCACAF.size()) {
            // Desactivar el botón cuando todos los enfrentamientos se han realizado
            btnSimularUnoCONCACAF.setEnabled(false);
            btnSimularTodosCONCACAF.setEnabled(false);
            // Disable the button when all matches are complete
            return;
        }

        Partido partidoActual = enfrentamientosCONCACAF.get(enfrentamientoActualCONCACAF);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simulate the match
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorCONCACAF(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Update team points and stats
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Increase the rate of the current matchup
        enfrentamientoActualCONCACAF++;

        // Update the CAF confederation table
        llenarTablaCONCACAF(equiposCONCACAF);
        actualizarTablaCONCACAF(equiposCONCACAF);

    }//GEN-LAST:event_btnSimularUnoCONCACAFActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblAFC;
    private javax.swing.JTable tblCAF;
    private javax.swing.JTable tblCONCACAF;
    private javax.swing.JTable tblCONMEBOL;
    private javax.swing.JTable tblOFC;
    private javax.swing.JTable tblUEFA;
    private javax.swing.JTextArea txtAFC;
    private javax.swing.JTextArea txtCAF;
    private javax.swing.JTextArea txtCONCACAF;
    private javax.swing.JTextArea txtCONMEBOL;
    private javax.swing.JTextArea txtOFC;
    private javax.swing.JTextArea txtUEFA;
    // End of variables declaration//GEN-END:variables

}
