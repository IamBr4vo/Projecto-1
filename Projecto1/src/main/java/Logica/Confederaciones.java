/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Eithel
 */
public class Confederaciones {
    private int plazasDirectas;
    private int plazasRepechaje;
    
    
    public Confederaciones(int plazasDirectas, int plazasRepechaje){
        this.plazasDirectas = plazasDirectas;
        this.plazasRepechaje = plazasRepechaje;
    }
    
    public int plazasDirectas(){
        return plazasDirectas;
    }

    public int plazasRepechaje(){
        return plazasRepechaje;
    }
}
