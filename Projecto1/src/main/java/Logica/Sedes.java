/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.UUID;


class Sedes extends Partido {
    
    private String paisSede;
    private String sede;
    private String identificador;
    private int gollocal;
    private int golvisitante;

    public Sedes(String paisSede, String sede, String identificador, int gollocal, int golvisitantee) {
        this.paisSede = paisSede;
        this.sede = sede;
        this.identificador = generarIdentificador();
         this.gollocal = gollocal;
        this.golvisitante = golvisitante;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public String getSede() {
        return sede;
    }

    public String getIdentificador() {
        return identificador;
    }
    
     public int getGolLocal() {
        return gollocal;
    }

    public int getGolVisitante() {
        return golvisitante;
    }
    
    //se utiliza el método getIdentificador() para obtener el identificador del partido
     private String generarIdentificador() {
        return UUID.randomUUID().toString();
    }
    
    //método calcularPuntos() que calcula los puntos del partido 
    
    public int calcularPuntos() {
    if (gollocal == golvisitante) {
        return 1; // Empate, suma 1 punto
    } else if (gollocal > golvisitante) {
        return 3; // Victoria del equipo local, suma 3 puntos
    } else {
        return 0; // Derrota, no suma puntos
        
        }
    }

}
