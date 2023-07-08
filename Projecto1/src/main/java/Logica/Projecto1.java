package Logica;
import GUI.*;
/**
 *
 * @author Bravo
 */
public class Projecto1 {
    public static void main(String[] args) {
        // Crear equipos para Concacaf
        Confederacion CONCACAF = new Confederacion(9,1);
        Equipo concacaf1 = new Equipo("Costa Rica");
        Equipo concacaf2 = new Equipo("Panama");
        Equipo concacaf3 = new Equipo("Honduras");
        // Agregar equipos de Concacaf a la lista
        CONCACAF.agregarEquipo(concacaf1);
        CONCACAF.agregarEquipo(concacaf2);
        CONCACAF.agregarEquipo(concacaf3);
        
        // Crear equipos para Conmebol
        Confederacion CONMEBOL = new Confederacion(6,1);
        Equipo conmebol1 = new Equipo("Brazil");
        Equipo conmebol2 = new Equipo("Colombia");
        Equipo conmebol3 = new Equipo("Venezuela");
        // Agregar equipos de Conmebol a la lista
        CONMEBOL.agregarEquipo(conmebol1);
        CONMEBOL.agregarEquipo(conmebol2);
        CONMEBOL.agregarEquipo(conmebol3);
        
        // Crear equipos para CAF
        Confederacion CAF = new Confederacion(9,1);
        Equipo Caf1 = new Equipo("Camerún");
        Equipo Caf2 = new Equipo("Tunez");
        Equipo Caf3 = new Equipo("Marruecos");
        // Agregar equipos de CAF a la lista
        CAF.agregarEquipo(Caf1);
        CAF.agregarEquipo(Caf2);
        CAF.agregarEquipo(Caf3);
        
        // Crear equipos para OFC
        Confederacion OFC = new Confederacion(1,1);
        Equipo Ofc1 = new Equipo("Nueva Zelanda");
        Equipo Ofc2 = new Equipo("Samoa");
        Equipo Ofc3 = new Equipo("Tonga");
        // Agregar equipos de OFC a la lista
        OFC.agregarEquipo(Ofc1);
        OFC.agregarEquipo(Ofc2);
        OFC.agregarEquipo(Ofc3);
        
        // Crear equipos para UEFA
        Confederacion UEFA = new Confederacion(16,0);
        Equipo Uefa1 = new Equipo("Alemania");
        Equipo Uefa2 = new Equipo("España");
        Equipo Uefa3 = new Equipo("Portugal (cr7 SIUUU)");
        // Agregar equipos de UEFA a la lista
        UEFA.agregarEquipo(Uefa1);
        UEFA.agregarEquipo(Uefa2);
        UEFA.agregarEquipo(Uefa3);
        
        // Crear equipos para AFC
        Confederacion AFC = new Confederacion(8,1);
        Equipo Afc1 = new Equipo("Australia");
        Equipo Afc2 = new Equipo("China");
        Equipo Afc3 = new Equipo("Corea del Norte");
        // Agregar equipos de AFC a la lista
        AFC.agregarEquipo(Afc1);
        AFC.agregarEquipo(Afc2);
        AFC.agregarEquipo(Afc3);
        
        //Metodo principal para ejecutar la interfaz
        Diseño v = new Diseño();
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
}
