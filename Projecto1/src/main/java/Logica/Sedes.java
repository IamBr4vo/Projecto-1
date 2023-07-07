/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
/**
 *
 * @author fabri
 */
public class Sedes {
    
 
    private ArrayList<String> ubicaciones;

    public Sedes() {
        ubicaciones = new ArrayList<>();
        // Agregar ubicaciones de Estados Unidos
        ubicaciones.add("Atlanta");
        ubicaciones.add("Boston");
        ubicaciones.add("Dallas");
        ubicaciones.add("Houston");
        ubicaciones.add("Kansas City");
        ubicaciones.add("Los Angeles");
        ubicaciones.add("Miami");
        ubicaciones.add("Nueva York/Nueva Jersey");
        ubicaciones.add("Filadelfia");
        ubicaciones.add("San Francisco");
        ubicaciones.add("Seattle");

        // Agregar ubicaciones de México
        ubicaciones.add("Guadalajara");
        ubicaciones.add("Ciudad de México");
        ubicaciones.add("Monterrey");

        // Agregar ubicaciones de Canadá
        ubicaciones.add("Vancouver");
        ubicaciones.add("Toronto");
    }   
}
