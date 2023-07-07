package Logica;
import GUI.*;
/**
 *
 * @author Bravo
 */
public class Projecto1 {
    
    public static void man (String [] args){
        // Crear confederaciones
        Confederaciones CAF = new Confederaciones(9,1);
        Confederaciones CONCACAF = new Confederaciones(6,2);
        Confederaciones CONMEBOL = new Confederaciones(6,1);
        Confederaciones OFC = new Confederaciones(1,1);
        Confederaciones UEFA = new Confederaciones(16,0);
        Confederaciones AFC = new Confederaciones(8,1);
    }
    public static void main(String[] args) {
        // Crear equipos para Concacaf
        Equipo Concacaf = new Equipo();
        Equipo concacaf1 = new Equipo("Costa Rica", "Concacaf");
        Equipo concacaf2 = new Equipo("Panama", "Concacaf");
        Equipo concacaf3 = new Equipo("Honduras", "Concacaf");
        // Agregar equipos de Concacaf a la lista
        Concacaf.agregarEquipo(concacaf1);
        Concacaf.agregarEquipo(concacaf2);
        Concacaf.agregarEquipo(concacaf3);
        
        // Crear equipos para Conmebol
        Equipo Conmebol = new Equipo();
        Equipo conmebol1 = new Equipo("Brazil", "Conmebol");
        Equipo conmebol2 = new Equipo("Colombia", "Conmebol");
        Equipo conmebol3 = new Equipo("Venezuela", "Conmebol");
        // Agregar equipos de Conmebol a la lista
        Conmebol.agregarEquipo(conmebol1);
        Conmebol.agregarEquipo(conmebol2);
        Conmebol.agregarEquipo(conmebol3);
        
        //Metodo principal para ejecutar la interfaz
        Diseño v = new Diseño();
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
}
