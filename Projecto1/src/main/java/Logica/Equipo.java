/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
/**
 *
 * @author Bravo
 */
public class Equipo {
    private String nombre;
    private int PTS;
    private int PJ;
    private int PG;
    private int PE;
    private int PP;
    private int GF;
    private int GC;
    private int DF;
  
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.PTS = 0;
        this.PJ = 0;
        this.PG = 0;
        this.PE = 0;
        this.PP = 0;
        this.GF = 0;
        this.GC = 0;
        this.DF = 0;
    }
    // Metodos para actualizar la información del equipo

    public void aumentarPartidosJugados() {
        this.setPTS(this.getPTS() + 1);
    }

    public void aumentarPartidosGanados() {
        this.setPG(this.getPG() + 1);
    }
    
    public void aumentarPartidosEmpatados() {
        this.setPE(this.getPE() + 1);
    }

    public void aumentarPartidosPerdidos() {
        this.setPP(this.getPP() + 1);
    }

    public void aumentarGolesFavor(int goles) {
        this.setGF(this.getGF() + goles);
    }

    public void aumentarGolesContra(int goles) {
        this.setGC(this.getGC() + goles);
    }

    public void calcularDiferenciaGoles() {
        this.setDF(getGF() - getGC());
    }

    public void actualizarPuntos(int puntos) {
        this.setPTS(this.getPTS() + getPTS());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the PTS
     */
    public int getPTS() {
        return PTS;
    }

    /**
     * @param PTS the PTS to set
     */
    public void setPTS(int PTS) {
        this.PTS = PTS;
    }

    /**
     * @return the PJ
     */
    public int getPJ() {
        return PJ;
    }

    /**
     * @param PJ the PJ to set
     */
    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    /**
     * @return the PG
     */
    public int getPG() {
        return PG;
    }

    /**
     * @param PG the PG to set
     */
    public void setPG(int PG) {
        this.PG = PG;
    }

    /**
     * @return the PE
     */
    public int getPE() {
        return PE;
    }

    /**
     * @param PE the PE to set
     */
    public void setPE(int PE) {
        this.PE = PE;
    }

    /**
     * @return the PP
     */
    public int getPP() {
        return PP;
    }

    /**
     * @param PP the PP to set
     */
    public void setPP(int PP) {
        this.PP = PP;
    }

    /**
     * @return the GF
     */
    public int getGF() {
        return GF;
    }

    /**
     * @param GF the GF to set
     */
    public void setGF(int GF) {
        this.GF = GF;
    }

    /**
     * @return the GC
     */
    public int getGC() {
        return GC;
    }

    /**
     * @param GC the GC to set
     */
    public void setGC(int GC) {
        this.GC = GC;
    }

    /**
     * @return the DF
     */
    public int getDF() {
        return DF;
    }

    /**
     * @param DF the DF to set
     */
    public void setDF(int DF) {
        this.DF = DF;
    }
}