package Logica;
import java.util.Random;

/**
 *
 * @author deivi
 */
public class Partido {

    private String equipolocal;
    private String equipovisitante;
    private int gollocal;
    private int golvisitante;
    private int resultado;

    //Metodo constructor 
    public Partido(String equipolocal, String equipovisitante, int gollocal, int golvisitante, int resultado) {
        this.equipolocal = equipolocal;
        this.equipovisitante = equipovisitante;
        this.gollocal = gollocal;
        this.golvisitante = golvisitante;
        this.resultado = resultado;

    }

    //Metodos get y set
    /**
     * @return the gollocal
     */
    public int getGollocal() {
        return gollocal;
    }

    /**
     * @param gollocal the gollocal to set
     */
    public void setGollocal(int gollocal) {
        this.gollocal = gollocal;
    }

    /**
     * @return the golvisitante
     */
    public int getGolvisitante() {
        return golvisitante;
    }

    /**
     * @param golvisitante the golvisitante to set
     */
    public void setGolvisitante(int golvisitante) {
        this.golvisitante = golvisitante;
    }

    //Metodo de simulacion ramdom
    public void simularpartido() {
        Random gol = new Random();
        setGollocal(gol.nextInt(10));
        setGolvisitante(gol.nextInt(10));
    }

    /**
     * @return the equipolocal
     */
    public String getEquipolocal() {
        return equipolocal;
    }

    /**
     * @param equipolocal the equipolocal to set
     */
    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    /**
     * @return the equipovisitante
     */
    public String getEquipovisitante() {
        return equipovisitante;
    }

    /**
     * @param equipovisitante the equipovisitante to set
     */
    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    // Método para obtener el resultado del partido
    public String obtenerresultado() {
        return getEquipolocal() + " " + getGollocal() + "-" + getGolvisitante() + " " + getGolvisitante();
    }
}
