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

        // Create locations for the United States
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

        // Add US locations to the list
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

        // Create locations for Mexico
        Sede MEX1 = new Sede("Guadalajara", "México");
        Sede MEX2 = new Sede("Ciudad de México", "México");
        Sede MEX3 = new Sede("Monterrey", "México");

        // Add offices in Mexico to the list
        listaSedes.add(MEX1);
        listaSedes.add(MEX2);
        listaSedes.add(MEX3);

        // Create sites for Canada
        Sede CAN1 = new Sede("Vancouver", "Canadá");
        Sede CAN2 = new Sede("Toronto", "Canadá");

        // Add Canadian locations to the list
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

        // Clean the table
        DefaultTableModel model = (DefaultTableModel) tblCONMEBOL.getModel();
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

    private void actualizarTablaOFC(List<Equipo> equipos) {
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

        // Clean the table
        DefaultTableModel model = (DefaultTableModel) tblOFC.getModel();
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

    private void actualizarTablaUEFA(List<Equipo> equipos) {
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

        // Clean the table
        DefaultTableModel model = (DefaultTableModel) tblUEFA.getModel();
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

    private void actualizarTablaAFC(List<Equipo> equipos) {
        // Sort the list of teams based on points and goal difference
        equipos.sort((equipo1, equipo2) -> {
            /// Compare the points
            int comparacionPuntos = Integer.compare(equipo2.getPTS(), equipo1.getPTS());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            } else {
                // In case of a tie on points, compare the goal difference
                return Integer.compare(equipo2.getDF(), equipo1.getDF());
            }
        });

        // Clean the table
        DefaultTableModel model = (DefaultTableModel) tblAFC.getModel();
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

/// Method to generate matchups without replays for OFC
    private List<Partido> generarEnfrentamientosOFC(List<Equipo> equipos) {
        List<Partido> enfrentamientos = new ArrayList<>();
        int numEquipos = equipos.size();

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                /// Check if the match has already been played by the 2 teams
                if (!equiposYaJugaronOFC[i][j] && !equiposYaJugaronOFC[j][i]) {
                    Partido partido = new Partido(equiposOFC);
                    partido.setEquipo1(equipoLocal);
                    partido.setEquipo2(equipoVisitante);
                    enfrentamientos.add(partido);

                    // Update the array of teams already played
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
// Method to generate matchups without replays for UEFA

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

// Method to get a random site from the list of sites
    private Sede obtenerSedeAleatoria() {
        if (listaSedes.isEmpty()) {
            throw new IllegalStateException("La lista de sedes está vacía, asegúrate de agregar sedes antes de llamar a este método.");
        }
        Random random = new Random();
        int index = random.nextInt(listaSedes.size());
        return listaSedes.get(index);
    }

    // Method to get the country of a specific headquarters
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

        // Get random venue from list of venues
        Sede sedeAleatoria = obtenerSedeAleatoria();
        // Add random venue information and the country of venue
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
        ltlcaf = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCONMEBOL = new javax.swing.JTable();
        btnSimularUnoCONMEBOL = new javax.swing.JButton();
        btnSimularTodosCONMEBOL = new javax.swing.JButton();
        btnVerSedesCONMEBOL = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtCONMEBOL = new javax.swing.JTextArea();
        ltlconmebol = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOFC = new javax.swing.JTable();
        btnSimularUnoOFC = new javax.swing.JButton();
        btnSimularTodosOFC = new javax.swing.JButton();
        btnVerSedesOFC = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtOFC = new javax.swing.JTextArea();
        ltlOFC = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAFC = new javax.swing.JTable();
        btnSimularUnoAFC = new javax.swing.JButton();
        btnSimularTodosAFC = new javax.swing.JButton();
        btnVerSedesAFC = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAFC = new javax.swing.JTextArea();
        ltlAFC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSimularUnoCONCACAF = new javax.swing.JButton();
        btnSimularTodosCONCACAF = new javax.swing.JButton();
        btnVerSedesCONCACAF = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCONCACAF = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtCONCACAF = new javax.swing.JTextArea();
        ltlCONCACAF = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblUEFA = new javax.swing.JTable();
        btnSimularUnoUEFA = new javax.swing.JButton();
        btnSimularTodosUEFA = new javax.swing.JButton();
        btnVerSedesUEFA = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtUEFA = new javax.swing.JTextArea();
        ltlUEFA = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 290));

        btnSimularUnoCAF.setText("Simular Partido");
        btnSimularUnoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCAFActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularUnoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        btnSimularTodosCAF.setText("Simular Todos Los Partidos");
        btnSimularTodosCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosCAFActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularTodosCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnVerSedesCAF.setText("Resultados");
        btnVerSedesCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCAFActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerSedesCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        txtCAF.setEditable(false);
        txtCAF.setColumns(20);
        txtCAF.setRows(5);
        jScrollPane2.setViewportView(txtCAF);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 390, 320));

        ltlcaf.setIcon(new javax.swing.ImageIcon("C:\\Users\\50684\\Documents\\Projecto-1\\Projecto1\\Fondos\\CAF.jpg")); // NOI18N
        jPanel1.add(ltlcaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -170, 1390, 820));

        jTabbedPane1.addTab("CAF", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 290));

        btnSimularUnoCONMEBOL.setText("Simular Partido");
        btnSimularUnoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnSimularUnoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 295, -1, -1));

        btnSimularTodosCONMEBOL.setText("Simular Todos Los Partidos");
        btnSimularTodosCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnSimularTodosCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 295, -1, -1));

        btnVerSedesCONMEBOL.setText("Resultados");
        btnVerSedesCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnVerSedesCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 295, -1, -1));

        txtCONMEBOL.setEditable(false);
        txtCONMEBOL.setColumns(20);
        txtCONMEBOL.setRows(5);
        jScrollPane9.setViewportView(txtCONMEBOL);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 390, 318));

        ltlconmebol.setIcon(new javax.swing.ImageIcon("C:\\Users\\50684\\Documents\\Projecto-1\\Projecto1\\Fondos\\Comebol.jpg")); // NOI18N
        jPanel4.add(ltlconmebol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 660));

        jTabbedPane1.addTab("CONMEBOL", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 290));

        btnSimularUnoOFC.setText("Simular Partido");
        btnSimularUnoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoOFCActionPerformed(evt);
            }
        });
        jPanel5.add(btnSimularUnoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        btnSimularTodosOFC.setText("Simular Todos Los Partidos");
        btnSimularTodosOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosOFCActionPerformed(evt);
            }
        });
        jPanel5.add(btnSimularTodosOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnVerSedesOFC.setText("Resultados");
        btnVerSedesOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesOFCActionPerformed(evt);
            }
        });
        jPanel5.add(btnVerSedesOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        txtOFC.setEditable(false);
        txtOFC.setColumns(20);
        txtOFC.setRows(5);
        jScrollPane10.setViewportView(txtOFC);

        jPanel5.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 390, 330));

        ltlOFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\50684\\Documents\\Projecto-1\\Projecto1\\Fondos\\OFC.jpg")); // NOI18N
        jPanel5.add(ltlOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -70, 1350, 710));

        jTabbedPane1.addTab("OFC", jPanel5);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 320));

        btnSimularUnoAFC.setText("Simular Partido");
        btnSimularUnoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoAFCActionPerformed(evt);
            }
        });
        jPanel7.add(btnSimularUnoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        btnSimularTodosAFC.setText("Simular Todos Los Partidos");
        btnSimularTodosAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosAFCActionPerformed(evt);
            }
        });
        jPanel7.add(btnSimularTodosAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnVerSedesAFC.setText("Ver Sedes y Paises");
        btnVerSedesAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesAFCActionPerformed(evt);
            }
        });
        jPanel7.add(btnVerSedesAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        txtAFC.setEditable(false);
        txtAFC.setColumns(20);
        txtAFC.setRows(5);
        jScrollPane13.setViewportView(txtAFC);

        jPanel7.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 390, 370));

        ltlAFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\50684\\Documents\\Projecto-1\\Projecto1\\Fondos\\AFC.jpg")); // NOI18N
        jPanel7.add(ltlAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -114, 1320, 760));

        jTabbedPane1.addTab("AFC", jPanel7);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSimularUnoCONCACAF.setText("Simular Partido");
        btnSimularUnoCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoCONCACAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimularUnoCONCACAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        btnSimularTodosCONCACAF.setText("Simular Todos Los Partidos");
        btnSimularTodosCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosCONCACAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimularTodosCONCACAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        btnVerSedesCONCACAF.setText("Resultados");
        btnVerSedesCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesCONCACAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerSedesCONCACAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

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

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 280));

        txtCONCACAF.setEditable(false);
        txtCONCACAF.setColumns(20);
        txtCONCACAF.setRows(5);
        jScrollPane8.setViewportView(txtCONCACAF);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 380, 340));

        ltlCONCACAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\50684\\Documents\\Projecto-1\\Projecto1\\Fondos\\Concacaf.jpg")); // NOI18N
        jPanel2.add(ltlCONCACAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1310, 730));

        jTabbedPane1.addTab("CONCACAF", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 270));

        btnSimularUnoUEFA.setText("Simular Partido");
        btnSimularUnoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularUnoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnSimularUnoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        btnSimularTodosUEFA.setText("Simular Todos Los Partidos");
        btnSimularTodosUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodosUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnSimularTodosUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btnVerSedesUEFA.setText("Resultados");
        btnVerSedesUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSedesUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnVerSedesUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        txtUEFA.setEditable(false);
        txtUEFA.setColumns(20);
        txtUEFA.setRows(5);
        jScrollPane11.setViewportView(txtUEFA);

        jPanel6.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 390, 330));

        ltlUEFA.setIcon(new javax.swing.ImageIcon("C:\\Users\\50684\\Documents\\Projecto-1\\Projecto1\\Fondos\\UEFA.jpg")); // NOI18N
        jPanel6.add(ltlUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1400, 670));

        jTabbedPane1.addTab("UEFA", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1400, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Clasificación al Mundial 2026");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

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
        ColoresTablas renderer2 = new ColoresTablas(3, 3, 4);
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
        // Check if the matches have already been played

        if (enfrentamientoActualAFC >= enfrentamientosAFC.size()) {
            // Disable button when all matches are done
            btnSimularUnoAFC.setEnabled(false);
            btnSimularTodosAFC.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosAFC.get(enfrentamientoActualAFC);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        // Simulate the match
        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorAFC(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        // Update team points and stats
        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        // Increase the rate of the current matchup
        enfrentamientoActualAFC++;

        llenarTablaAFC(equiposAFC);
        actualizarTablaAFC(equiposAFC);

    }//GEN-LAST:event_btnSimularUnoAFCActionPerformed

    private void btnSimularUnoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCAFActionPerformed
        ColoresTablas renderer1 = new ColoresTablas(9, 9, 0);
        tblCAF.setDefaultRenderer(Object.class, renderer1);
        if (enfrentamientoActualCAF >= enfrentamientosCAF.size()) {
            btnSimularUnoCAF.setEnabled(false);
            btnSimularTodosCAF.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosCAF.get(enfrentamientoActualCAF);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorCAF(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        enfrentamientoActualCAF++;

        llenarTablaCAF(equiposCAF);
        actualizarTablaCAF(equiposCAF);

    }//GEN-LAST:event_btnSimularUnoCAFActionPerformed


    private void btnSimularTodosCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosCONMEBOLActionPerformed

        ColoresTablas renderer3 = new ColoresTablas(6, 6, 0);
        tblCONMEBOL.setDefaultRenderer(Object.class, renderer3);
        if (!partidoJugadoCONMEBOL) {
            btnSimularTodosCONMEBOL.setEnabled(false);
            btnSimularUnoCONMEBOL.setEnabled(false);
            List<Equipo> equiposCONMEBOL = surAmerica;

            while (enfrentamientoActualCONMEBOL < enfrentamientosCONMEBOL.size()) {
                Partido partido = enfrentamientosCONMEBOL.get(enfrentamientoActualCONMEBOL);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorCONMEBOL(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                enfrentamientoActualCONMEBOL++;
            }

            partidoJugadoCONMEBOL = true;

            llenarTablaCONMEBOL(equiposCONMEBOL);
            actualizarTablaCONMEBOL(equiposCONMEBOL);

    }//GEN-LAST:event_btnSimularTodosCONMEBOLActionPerformed
    }
    private void btnSimularTodosCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosCAFActionPerformed
        ColoresTablas renderer1 = new ColoresTablas(9, 9, 0);
        tblCAF.setDefaultRenderer(Object.class, renderer1);
        if (!partidoJugadoCAF) {
            btnSimularTodosCAF.setEnabled(false);
            btnSimularUnoCAF.setEnabled(false);
            List<Equipo> equiposCAF = africa;

            while (enfrentamientoActualCAF < enfrentamientosCAF.size()) {
                Partido partido = enfrentamientosCAF.get(enfrentamientoActualCAF);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorCAF(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                enfrentamientoActualCAF++;
            }

            partidoJugadoCAF = true;

            llenarTablaCAF(equiposCAF);
            actualizarTablaCAF(equiposCAF);
        }
    }//GEN-LAST:event_btnSimularTodosCAFActionPerformed

    private void btnSimularTodosOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosOFCActionPerformed
        ColoresTablas renderer4 = new ColoresTablas(1, 1, 0);
        tblOFC.setDefaultRenderer(Object.class, renderer4);
        if (!partidoJugadoOFC) {
            btnSimularTodosOFC.setEnabled(false);
            btnSimularUnoOFC.setEnabled(false);
            List<Equipo> equiposOFC = oceania;

            while (enfrentamientoActualOFC < enfrentamientosOFC.size()) {
                Partido partido = enfrentamientosOFC.get(enfrentamientoActualOFC);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorOFC(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                enfrentamientoActualOFC++;
            }

            partidoJugadoOFC = true;

            llenarTablaOFC(equiposOFC);
            actualizarTablaOFC(equiposOFC);

    }//GEN-LAST:event_btnSimularTodosOFCActionPerformed
    }
    private void btnSimularTodosUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodosUEFAActionPerformed

        ColoresTablas renderer5 = new ColoresTablas(16, 0, 0);
        tblUEFA.setDefaultRenderer(Object.class, renderer5);

        if (!partidoJugadoUEFA) {
            btnSimularTodosUEFA.setEnabled(false);
            btnSimularUnoUEFA.setEnabled(false);
            // Obtener la lista de equipos de la confederación CAF
            List<Equipo> equiposUEFA = europa;

            while (enfrentamientoActualUEFA < enfrentamientosUEFA.size()) {
                Partido partido = enfrentamientosUEFA.get(enfrentamientoActualUEFA);
                Equipo equipoLocal = partido.getEquipo1();
                Equipo equipoVisitante = partido.getEquipo2();

                partido.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
                partido.guardarDatosEquipos();
                obtenerMarcadorUEFA(equipoLocal.getNombre(), partido.getGolequipo1(), equipoVisitante.getNombre(), partido.getGolequipo2());

                actualizarEstadisticasEquipo(partido.getEquipo1(), partido.getGolequipo1(), partido.getGolequipo2());
                actualizarEstadisticasEquipo(partido.getEquipo2(), partido.getGolequipo2(), partido.getGolequipo1());

                enfrentamientoActualUEFA++;
            }

            partidoJugadoUEFA = true;

            llenarTablaUEFA(equiposUEFA);
            actualizarTablaUEFA(equiposUEFA);
    }//GEN-LAST:event_btnSimularTodosUEFAActionPerformed
    }
    private void btnSimularUnoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoOFCActionPerformed

        ColoresTablas renderer4 = new ColoresTablas(1, 1, 0);
        tblOFC.setDefaultRenderer(Object.class, renderer4);

        if (enfrentamientoActualOFC >= enfrentamientosOFC.size()) {
            btnSimularUnoOFC.setEnabled(false);
            btnSimularTodosOFC.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosOFC.get(enfrentamientoActualOFC);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorOFC(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        enfrentamientoActualOFC++;

        llenarTablaOFC(equiposOFC);
        actualizarTablaOFC(equiposOFC);
    }//GEN-LAST:event_btnSimularUnoOFCActionPerformed

    private void btnSimularUnoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoUEFAActionPerformed

        ColoresTablas renderer5 = new ColoresTablas(16, 0, 0);
        tblUEFA.setDefaultRenderer(Object.class, renderer5);

        if (enfrentamientoActualUEFA >= enfrentamientosUEFA.size()) {
            btnSimularUnoUEFA.setEnabled(false);
            btnSimularTodosUEFA.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosUEFA.get(enfrentamientoActualUEFA);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorUEFA(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        enfrentamientoActualUEFA++;

        llenarTablaUEFA(equiposUEFA);
        actualizarTablaUEFA(equiposUEFA);
    }//GEN-LAST:event_btnSimularUnoUEFAActionPerformed

    private void btnSimularUnoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCONMEBOLActionPerformed

        ColoresTablas renderer3 = new ColoresTablas(6, 6, 0);
        tblCONMEBOL.setDefaultRenderer(Object.class, renderer3);

        if (enfrentamientoActualCONMEBOL >= enfrentamientosCONMEBOL.size()) {
            btnSimularUnoCONMEBOL.setEnabled(false);
            btnSimularTodosCONMEBOL.setEnabled(false);
            return;
        }

        Partido partidoActual = enfrentamientosCONMEBOL.get(enfrentamientoActualCONMEBOL);
        Equipo equipoLocal = partidoActual.getEquipo1();
        Equipo equipoVisitante = partidoActual.getEquipo2();

        partidoActual.simularGoles(equipoLocal.getNombre(), equipoVisitante.getNombre());
        partidoActual.guardarDatosEquipos();
        obtenerMarcadorCONMEBOL(equipoLocal.getNombre(), partidoActual.getGolequipo1(), equipoVisitante.getNombre(), partidoActual.getGolequipo2());

        actualizarEstadisticasEquipo(partidoActual.getEquipo1(), partidoActual.getGolequipo1(), partidoActual.getGolequipo2());
        actualizarEstadisticasEquipo(partidoActual.getEquipo2(), partidoActual.getGolequipo2(), partidoActual.getGolequipo1());

        enfrentamientoActualCONMEBOL++;

        llenarTablaCONMEBOL(equiposCONMEBOL);

        actualizarTablaCONMEBOL(equiposCONMEBOL);

    }//GEN-LAST:event_btnSimularUnoCONMEBOLActionPerformed

    private void btnSimularUnoCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularUnoCONCACAFActionPerformed
        // Colors for the table
        ColoresTablas renderer2 = new ColoresTablas(3, 3, 4);
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
    private javax.swing.JLabel ltlAFC;
    private javax.swing.JLabel ltlCONCACAF;
    private javax.swing.JLabel ltlOFC;
    private javax.swing.JLabel ltlUEFA;
    private javax.swing.JLabel ltlcaf;
    private javax.swing.JLabel ltlconmebol;
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
