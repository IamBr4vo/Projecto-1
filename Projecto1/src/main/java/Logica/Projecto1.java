package Logica;
import GUI.*;
/**
 *
 * @author Bravo
 */
public class Projecto1 {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        // Crear equipos para Concacaf
        Equipo equipo1 = new Equipo("Costa Rica", "Concacaf");
        Equipo equipo2 = new Equipo("Panama", "Concacaf");
        Equipo equipo3 = new Equipo("Honduras", "Concacaf");
        // Agregar equipos de Concacaf a la lista
        equipo.agregarEquipo(equipo1);
        equipo.agregarEquipo(equipo2);
        equipo.agregarEquipo(equipo3);
        
        //Metodo principal para ejecutar la interfaz
        Diseño v = new Diseño();
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
}
