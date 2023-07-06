/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Bravo
 */
//Metodo constructor y se crea una lista donde van a ir todos los equipos que jugaran y sus respectivas confederaciones
public class Equipo {
    private List<Equipo> listaEquipos;
    private String nombre;
    private String confederacion;
    private int PTS;
    private int PJ;
    private int PG;
    private int PE;
    private int PP;
    private int GF;
    private int GC;
    private int DF;
    
    public Equipo() {
    listaEquipos = new ArrayList<>();
    }
  
    public Equipo(String nombre, String confederacion) {
        this.nombre = nombre;
        this.confederacion = confederacion;
        this.PTS = 0;
        this.PJ = 0;
        this.PG = 0;
        this.PE = 0;
        this.PP = 0;
        this.GF = 0;
        this.GC = 0;
        this.DF = 0;
    }
    public void agregarEquipo(Equipo equipo) {
        listaEquipos.add(equipo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public int getPuntos() {
        return PTS;
    }

    public void setPuntos(int PTS) {
        this.PTS = PTS;
    }

    public int getPartidosJugados() {
        return PJ;
    }

    public void setPartidosJugados(int PJ) {
        this.PJ = PJ;
    }

    public int getPartidosGanados() {
        return PG;
    }

    public void setPartidosGanados(int PG) {
        this.PG = PG;
    }

    public int getPartidosEmpatados() {
        return PE;
    }

    public void setPartidosEmpatados(int PE) {
        this.PE = PE;
    }

    public int getPartidosPerdidos() {
        return PP;
    }

    public void setPartidosPerdidos(int PP) {
        this.PP = PP;
    }

    public int getGolesFavor() {
        return GF;
    }

    public void setGolesFavor(int GF) {
        this.GF = GF;
    }

    public int getGolesContra() {
        return GC;
    }

    public void setGolesContra(int GC) {
        this.GC = GC;
    }

    public int getDiferenciaGoles() {
        return DF;
    }

    public void setDiferenciaGoles(int DF) {
        this.DF = DF;
    }

    // Metodos para actualizar la información del equipo

    public void aumentarPartidosJugados() {
        this.PTS++;
    }

    public void aumentarPartidosGanados() {
        this.PG++;
    }
    
    public void aumentarPartidosEmpatados() {
        this.PE++;
    }

    public void aumentarPartidosPerdidos() {
        this.PP++;
    }

    public void aumentarGolesFavor(int goles) {
        this.GF += goles;
    }

    public void aumentarGolesContra(int goles) {
        this.GC += goles;
    }

    public void calcularDiferenciaGoles() {
        this.DF = GF - GC;
    }

    public void actualizarPuntos(int puntos) {
        this.PTS += PTS;
    }
}