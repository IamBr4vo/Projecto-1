package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eithel
 */
//Constructor method and a list is created where all the teams that will play and their respective confederations will go
public class Confederacion {

    private List<Equipo> listaEquipos;
    private int plazasDirectas;
    private int plazasRepechaje;

    public Confederacion() {
        listaEquipos = new ArrayList<>(); // Initialize the equipment list
    }

    public Confederacion(int plazasDirectas, int plazasRepechaje) {
        this.plazasDirectas = plazasDirectas;
        this.plazasRepechaje = plazasRepechaje;
        listaEquipos = new ArrayList<>(); // Initialize the equipment list
    }

    public void agregarEquipo(Equipo equipo) {
        listaEquipos.add(equipo);
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
     * @return the plazasDirectas
     */
    public int getPlazasDirectas() {
        return plazasDirectas;
    }

    /**
     * @param plazasDirectas the plazasDirectas to set
     */
    public void setPlazasDirectas(int plazasDirectas) {
        this.plazasDirectas = plazasDirectas;
    }

    /**
     * @return the plazasRepechaje
     */
    public int getPlazasRepechaje() {
        return plazasRepechaje;
    }

    /**
     * @param plazasRepechaje the plazasRepechaje to set
     */
    public void setPlazasRepechaje(int plazasRepechaje) {
        this.plazasRepechaje = plazasRepechaje;
    }

}
