package Logica;

/**
 *
 * @author deivis
 */
import java.util.List;
import java.util.Random;

public class Partido {

    private List<Equipo> listaEquipos;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golequipo1;
    private int golequipo2;

    public Partido(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    /**
     * @return the golequipo1
     */
    public int getGolequipo1() {
        return golequipo1;
    }

    /**
     * @param golequipo1 the gollocal to set
     */
    public void setGolequipo1(int golequipo1) {
        this.golequipo1 = golequipo1;
    }

    /**
     * @return the golequipo2
     */
    public int getGolequipo2() {
        return golequipo2;
    }

    /**
     * @param golequipo2 the golvisitante to set
     */
    public void setGolequipo2(int golequipo2) {
        this.golequipo2 = golequipo2;
    }

    /**
     * @return the listaEquipos
     */
    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    /**
     * @param listaEquipos the listaEquipos to set
     */
    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    /**
     * @return the equipo1
     */
    public Equipo getEquipo1() {
        return equipo1;
    }

    /**
     * @param equipo1 the equipo1 to set
     */
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    /**
     * @return the equipo2
     */
    public Equipo getEquipo2() {
        return equipo2;
    }

    /**
     * @param equipo2 the equipo2 to set
     */
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void generarPartidoAleatorio() {
        Random random = new Random();
        setEquipo1(getListaEquipos().get(random.nextInt(getListaEquipos().size())));
        setEquipo2(getListaEquipos().get(random.nextInt(getListaEquipos().size())));

        // Check that the teams are different
        while (getEquipo1().equals(getEquipo2())) {
            setEquipo2(getListaEquipos().get(random.nextInt(getListaEquipos().size())));
        }
    }

//Random goals simulation method
    public void simularGoles(String equipo1, String equipo2) {
        Random gol = new Random();
        setGolequipo1(gol.nextInt(11));
        setGolequipo2(gol.nextInt(11));
    }

///Method of increasing goals against, goals for and goal difference
    public void guardarDatosEquipos() {
//Goal against
        getEquipo1().aumentarGolesContra(golequipo2);
        getEquipo2().aumentarGolesContra(golequipo1);
        // Goal team
        getEquipo1().aumentarGolesFavor(golequipo1);
        getEquipo2().aumentarGolesFavor(golequipo2);
//Goal difference
        getEquipo1().calcularDiferenciaGoles();
        getEquipo2().calcularDiferenciaGoles();
    }

}
