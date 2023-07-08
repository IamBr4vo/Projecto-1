package GUI;

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
        gollocal = gol.nextInt(10);
        golvisitante = gol.nextInt(10);
    }

    // Método para obtener el resultado del partido
    public String obtenerresultado() {
        return equipolocal + " " + gollocal + "  " + equipovisitante + " " + golvisitante;
        System.out.println("Goles locales: " + gollocal()); 
        System.out.println("Goles visitantes: " + golvisitante());
    }
    

}
