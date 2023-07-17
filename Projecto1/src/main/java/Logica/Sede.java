package Logica;

/**
 *
 * @author Fabri
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sede {

    private List<Sede> listaSedes;
    private int identificador;
    private String paisSede;
    private String sede;

    public Sede(String sede) {
        this.sede = sede;
        listaSedes = new ArrayList<>(); // Initialize the list of where to play
    }

    public Sede(int identificador, String paisSede) {
        this.identificador = identificador;
        this.paisSede = paisSede;
        listaSedes = new ArrayList<>(); // Initialize the list of where to play
    }

    public void agregarSedes(Sede sede) {
        getListaSedes().add(sede);
    }

    /**
     * @return the listaSedes
     */
    public List<Sede> getListaSedes() {
        return listaSedes;
    }

    /**
     * @param listaSedes the listaSedes to set
     */
    public void setListaSedes(List<Sede> listaSedes) {
        this.listaSedes = listaSedes;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the paisSede
     */
    public String getPaisSede() {
        return paisSede;
    }

    /**
     * @param paisSede the paisSede to set
     */
    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    public Sede obtenerSedeAleatoria() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaSedes.size());
        return listaSedes.get(indiceAleatorio);
    }
}
