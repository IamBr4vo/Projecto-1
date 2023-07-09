/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eithel
 */
//Metodo constructor y se crea una lista donde van a ir todos los equipos que jugaran y sus respectivas confederaciones
public class Confederacion {
    private List<Equipo> listaEquipos;
    private int plazasDirectas;
    private int plazasRepechaje;
    
    public Confederacion() {
    listaEquipos = new ArrayList<>();
    }
    
    public Confederacion(int plazasDirectas, int plazasRepechaje){
        this.plazasDirectas = plazasDirectas;
        this.plazasRepechaje = plazasRepechaje;
        listaEquipos = new ArrayList<>();
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
