package Logica;
import GUI.*;
import java.util.List; 
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
        Equipo concacaf4 = new Equipo("Anguila");
        Equipo concacaf5 = new Equipo("Antigua y Barbuda");
        Equipo concacaf6 = new Equipo("Aruba");
        Equipo concacaf7 = new Equipo("Bahamas");
        Equipo concacaf8 = new Equipo("Barbados");
        Equipo concacaf9 = new Equipo("Belice");
        Equipo concacaf10 = new Equipo("Bermudas");
        Equipo concacaf11 = new Equipo("Bonaire");
        Equipo concacaf12 = new Equipo("Canada");
        Equipo concacaf13 = new Equipo("Cuba");
        Equipo concacaf14 = new Equipo("Curazao");
        Equipo concacaf15 = new Equipo("Dominica");
        Equipo concacaf16 = new Equipo("El Salvador");
        Equipo concacaf17 = new Equipo("Granada");
        Equipo concacaf18 = new Equipo("Guadalupe");
        Equipo concacaf19 = new Equipo("Guatemala");
        Equipo concacaf20 = new Equipo("Guayana Francesa");
        Equipo concacaf21 = new Equipo("Guyana");
        Equipo concacaf22 = new Equipo("Haiti");
        Equipo concacaf23 = new Equipo("Islas Caiman");
        Equipo concacaf24 = new Equipo("Islas Turcas Y caicos");
        Equipo concacaf25 = new Equipo("Islas Virgenes Britanicas");
        Equipo concacaf26 = new Equipo("Islas Virgenes de los Estados Unidos");
        Equipo concacaf27 = new Equipo("Jamaica");
        Equipo concacaf28 = new Equipo("Martinica");
        Equipo concacaf29 = new Equipo("Mexico");
        Equipo concacaf30 = new Equipo("Montserrat");
        Equipo concacaf31 = new Equipo("Nicaragua");
        Equipo concacaf32 = new Equipo("Puerto Rico");
        Equipo concacaf33 = new Equipo("Repulica Dominicana");
        Equipo concacaf34 = new Equipo("San Critobal y Nieves");
        Equipo concacaf35 = new Equipo("San Vicente y las Granadinas");
        Equipo concacaf36 = new Equipo("Saint-Martin");
        Equipo concacaf37 = new Equipo("San Lucia");
        Equipo concacaf38 = new Equipo("Sint Maarten");
        Equipo concacaf39 = new Equipo("Surinam");
        Equipo concacaf40 = new Equipo("Trinidad Y tobago");
        Equipo concacaf41 = new Equipo("Estados Unidos");
        
        // Agregar equipos de Concacaf a la lista
        CONCACAF.agregarEquipo(concacaf1);
        CONCACAF.agregarEquipo(concacaf2);
        CONCACAF.agregarEquipo(concacaf3);
        CONCACAF.agregarEquipo(concacaf4);
        CONCACAF.agregarEquipo(concacaf5);
        CONCACAF.agregarEquipo(concacaf6);
        CONCACAF.agregarEquipo(concacaf7);
        CONCACAF.agregarEquipo(concacaf8);
        CONCACAF.agregarEquipo(concacaf9);
        CONCACAF.agregarEquipo(concacaf10);
        CONCACAF.agregarEquipo(concacaf11);
        CONCACAF.agregarEquipo(concacaf12);
        CONCACAF.agregarEquipo(concacaf13);
        CONCACAF.agregarEquipo(concacaf14);
        CONCACAF.agregarEquipo(concacaf15);
        CONCACAF.agregarEquipo(concacaf16);
        CONCACAF.agregarEquipo(concacaf17);
        CONCACAF.agregarEquipo(concacaf18);
        CONCACAF.agregarEquipo(concacaf19);
        CONCACAF.agregarEquipo(concacaf20);
        CONCACAF.agregarEquipo(concacaf21);
        CONCACAF.agregarEquipo(concacaf22);
        CONCACAF.agregarEquipo(concacaf23);
        CONCACAF.agregarEquipo(concacaf24);
        CONCACAF.agregarEquipo(concacaf25);
        CONCACAF.agregarEquipo(concacaf26);
        CONCACAF.agregarEquipo(concacaf27);
        CONCACAF.agregarEquipo(concacaf28);
        CONCACAF.agregarEquipo(concacaf29);
        CONCACAF.agregarEquipo(concacaf30);
        CONCACAF.agregarEquipo(concacaf31);
        CONCACAF.agregarEquipo(concacaf32);
        CONCACAF.agregarEquipo(concacaf33);
        CONCACAF.agregarEquipo(concacaf34);
        CONCACAF.agregarEquipo(concacaf35);
        CONCACAF.agregarEquipo(concacaf36);
        CONCACAF.agregarEquipo(concacaf37);
        CONCACAF.agregarEquipo(concacaf38);
        CONCACAF.agregarEquipo(concacaf39);
        CONCACAF.agregarEquipo(concacaf40);
        CONCACAF.agregarEquipo(concacaf41);
       
        // Crear equipos para Conmebol
        Confederacion CONMEBOL = new Confederacion(6,1);
        Equipo conmebol1 = new Equipo("Brazil");
        Equipo conmebol2 = new Equipo("Colombia");
        Equipo conmebol3 = new Equipo("Venezuela");
        Equipo conmebol4 = new Equipo("Argentina");
        Equipo conmebol5 = new Equipo("Bolivia");
        Equipo conmebol6 = new Equipo("Chile");
        Equipo conmebol7 = new Equipo("Ecuador");
        Equipo conmebol8 = new Equipo("Paraguay");
        Equipo conmebol9 = new Equipo("Peru");
        Equipo conmebol10 = new Equipo("Uruguay");
        
        // Agregar equipos de Conmebol a la lista
        CONMEBOL.agregarEquipo(conmebol1);
        CONMEBOL.agregarEquipo(conmebol2);
        CONMEBOL.agregarEquipo(conmebol3);
        CONMEBOL.agregarEquipo(conmebol4);
        CONMEBOL.agregarEquipo(conmebol5);
        CONMEBOL.agregarEquipo(conmebol6);
        CONMEBOL.agregarEquipo(conmebol7);
        CONMEBOL.agregarEquipo(conmebol8);
        CONMEBOL.agregarEquipo(conmebol9);
        CONMEBOL.agregarEquipo(conmebol10);
        
        // Crear equipos para CAF
        Confederacion CAF = new Confederacion(9,1);
        Equipo Caf1 = new Equipo("Camerún");
        Equipo Caf2 = new Equipo("Tunez");
        Equipo Caf3 = new Equipo("Marruecos");
        Equipo Caf4 = new Equipo("Argelia");
        Equipo Caf5 = new Equipo("Angola");
        Equipo Caf6 = new Equipo("Benin");
        Equipo Caf7 = new Equipo("Botsuana");
        Equipo Caf8 = new Equipo("Burkina Faso");
        Equipo Caf9 = new Equipo("Burundi");
        Equipo Caf10 = new Equipo("Cabo Verde");
        Equipo Caf11 = new Equipo("Chad");
        Equipo Caf12 = new Equipo("Comoras");
        Equipo Caf13 = new Equipo("Congo");
        Equipo Caf14 = new Equipo("Costa de Marfil");
        Equipo Caf15 = new Equipo("Egipto");
        Equipo Caf16 = new Equipo("Guinea Ecuatorial");
        Equipo Caf17 = new Equipo("Eritrea");
        Equipo Caf18 = new Equipo("Eswatini");
        Equipo Caf19 = new Equipo("Etiopia");
        Equipo Caf20 = new Equipo("Gabon");
        Equipo Caf21 = new Equipo("Gambia");
        Equipo Caf22 = new Equipo("Ghana");
        Equipo Caf23 = new Equipo("Guinea");
        Equipo Caf24 = new Equipo("Guinea-Bisau");
        Equipo Caf25 = new Equipo("Kenia");
        Equipo Caf26 = new Equipo("Lesoto");
        Equipo Caf27 = new Equipo("Liberia");
        Equipo Caf28 = new Equipo("Libia");
        Equipo Caf29 = new Equipo("Madagascar");
        Equipo Caf30 = new Equipo("Malaui");
        Equipo Caf31 = new Equipo("Mali");
        Equipo Caf32 = new Equipo("Mauricio");
        Equipo Caf33 = new Equipo("Mauritania");
        Equipo Caf34 = new Equipo("Mozambique");
        Equipo Caf35 = new Equipo("Namibia");
        Equipo Caf36 = new Equipo("Niger");
        Equipo Caf37 = new Equipo("Nigeria");
        Equipo Caf38 = new Equipo("Republica Centroafricana");
        Equipo Caf39 = new Equipo("Republica Democratica del Congo");
        Equipo Caf40 = new Equipo("Reunion");
        Equipo Caf41 = new Equipo("Ruanda");
        Equipo Caf42 = new Equipo("Senegal");
        Equipo Caf43 = new Equipo("Santo Tome y Principe");
        Equipo Caf44 = new Equipo("Seychelles");
        Equipo Caf45 = new Equipo("Sierra Leona");
        Equipo Caf46 = new Equipo("Somalia");
        Equipo Caf47 = new Equipo("Sudan");
        Equipo Caf48 = new Equipo("Sudan del Sur");
        Equipo Caf49 = new Equipo("Tanzania");
        Equipo Caf50 = new Equipo("Togo");
        Equipo Caf51 = new Equipo("Sudafrica");
        Equipo Caf52 = new Equipo("Uganda");
        Equipo Caf53 = new Equipo("Yibuti");
        Equipo Caf54 = new Equipo("Zambia");
        Equipo Caf55 = new Equipo("Zamzibar");
        Equipo Caf56 = new Equipo("Zimbabue");
        
        // Agregar equipos de CAF a la lista
        CAF.agregarEquipo(Caf1);
        CAF.agregarEquipo(Caf2);
        CAF.agregarEquipo(Caf3);
        CAF.agregarEquipo(Caf4);
        CAF.agregarEquipo(Caf5);
        CAF.agregarEquipo(Caf6);
        CAF.agregarEquipo(Caf7);
        CAF.agregarEquipo(Caf8);
        CAF.agregarEquipo(Caf9);
        CAF.agregarEquipo(Caf10);
        CAF.agregarEquipo(Caf11);
        CAF.agregarEquipo(Caf12);
        CAF.agregarEquipo(Caf13);
        CAF.agregarEquipo(Caf14);
        CAF.agregarEquipo(Caf15);
        CAF.agregarEquipo(Caf16);
        CAF.agregarEquipo(Caf17);
        CAF.agregarEquipo(Caf18);
        CAF.agregarEquipo(Caf19);
        CAF.agregarEquipo(Caf20);
        CAF.agregarEquipo(Caf21);
        CAF.agregarEquipo(Caf22);
        CAF.agregarEquipo(Caf23);
        CAF.agregarEquipo(Caf24);
        CAF.agregarEquipo(Caf25);
        CAF.agregarEquipo(Caf26);
        CAF.agregarEquipo(Caf27);
        CAF.agregarEquipo(Caf28);
        CAF.agregarEquipo(Caf29);
        CAF.agregarEquipo(Caf30);
        CAF.agregarEquipo(Caf31);
        CAF.agregarEquipo(Caf32);
        CAF.agregarEquipo(Caf33);
        CAF.agregarEquipo(Caf34);
        CAF.agregarEquipo(Caf35);
        CAF.agregarEquipo(Caf36);
        CAF.agregarEquipo(Caf37);
        CAF.agregarEquipo(Caf38);
        CAF.agregarEquipo(Caf39);
        CAF.agregarEquipo(Caf40);
        CAF.agregarEquipo(Caf41);
        CAF.agregarEquipo(Caf42);
        CAF.agregarEquipo(Caf43);
        CAF.agregarEquipo(Caf44);
        CAF.agregarEquipo(Caf45);
        CAF.agregarEquipo(Caf46);
        CAF.agregarEquipo(Caf47);
        CAF.agregarEquipo(Caf48);
        CAF.agregarEquipo(Caf49);
        CAF.agregarEquipo(Caf50);
        CAF.agregarEquipo(Caf51);
        CAF.agregarEquipo(Caf52);
        CAF.agregarEquipo(Caf53);
        CAF.agregarEquipo(Caf54);
        CAF.agregarEquipo(Caf55);
        CAF.agregarEquipo(Caf56);
        
        // Crear equipos para OFC
        Confederacion OFC = new Confederacion(1,1);
        Equipo Ofc1 = new Equipo("Nueva Zelanda");
        Equipo Ofc2 = new Equipo("Samoa");
        Equipo Ofc3 = new Equipo("Tonga");
        Equipo Ofc4 = new Equipo("Fiyi");
        Equipo Ofc5 = new Equipo("Islas Cook");
        Equipo Ofc6 = new Equipo("Islas Salomon");
        Equipo Ofc7 = new Equipo("Kiribati");
        Equipo Ofc8 = new Equipo("Nueva Caledonia");
        Equipo Ofc9 = new Equipo("Papua Nueva Guinea");
        Equipo Ofc10 = new Equipo("Vanuatu");
        Equipo Ofc11 = new Equipo("Samoa Americana");
        Equipo Ofc12 = new Equipo("Tahiti");
        Equipo Ofc13 = new Equipo("Tuvalu");
        
        // Agregar equipos de OFC a la lista
        OFC.agregarEquipo(Ofc1);
        OFC.agregarEquipo(Ofc2);
        OFC.agregarEquipo(Ofc3);
        OFC.agregarEquipo(Ofc4);
        OFC.agregarEquipo(Ofc5);
        OFC.agregarEquipo(Ofc6);
        OFC.agregarEquipo(Ofc7);
        OFC.agregarEquipo(Ofc8);
        OFC.agregarEquipo(Ofc9);
        OFC.agregarEquipo(Ofc10);
        OFC.agregarEquipo(Ofc11);
        OFC.agregarEquipo(Ofc12);
        OFC.agregarEquipo(Ofc13);
        
        // Crear equipos para UEFA
        Confederacion UEFA = new Confederacion(16,0);
        Equipo Uefa1 = new Equipo("Alemania");
        Equipo Uefa2 = new Equipo("España");
        Equipo Uefa3 = new Equipo("Portugal");
        Equipo Uefa4 = new Equipo("Albania");
        Equipo Uefa5 = new Equipo("Andorra");
        Equipo Uefa6 = new Equipo("Armenia");
        Equipo Uefa7 = new Equipo("Austria");
        Equipo Uefa8 = new Equipo("Azerbaiyan");
        Equipo Uefa9 = new Equipo("Belgica");
        Equipo Uefa10 = new Equipo("Bielorrusia");
        Equipo Uefa11 = new Equipo("Bosnia y Herzegovina");
        Equipo Uefa12 = new Equipo("Bulgaria");
        Equipo Uefa13 = new Equipo("Croacia");
        Equipo Uefa14 = new Equipo("Chipre");
        Equipo Uefa15 = new Equipo("Dinamarca");
        Equipo Uefa16 = new Equipo("Eslovaquia");
        Equipo Uefa17 = new Equipo("Eslovenia");
        Equipo Uefa18 = new Equipo("Escocia");
        Equipo Uefa19 = new Equipo("Estonia");
        Equipo Uefa20 = new Equipo("Finlandia");
        Equipo Uefa21 = new Equipo("Francia");
        Equipo Uefa22 = new Equipo("Gales");
        Equipo Uefa23 = new Equipo("Georgia");
        Equipo Uefa24 = new Equipo("Gibraltar");
        Equipo Uefa25 = new Equipo("Grecia");
        Equipo Uefa26 = new Equipo("Hungria");
        Equipo Uefa27 = new Equipo("Inglaterra");
        Equipo Uefa28 = new Equipo("Irlanda");
        Equipo Uefa29 = new Equipo("Irlanda del Norte");
        Equipo Uefa30 = new Equipo("Islandia");
        Equipo Uefa31 = new Equipo("Islas Feroe");
        Equipo Uefa32 = new Equipo("Israel");
        Equipo Uefa33 = new Equipo("Italia");
        Equipo Uefa34 = new Equipo("Kazajistan");
        Equipo Uefa35 = new Equipo("Kosovo");
        Equipo Uefa36 = new Equipo("Letonia");
        Equipo Uefa37 = new Equipo("Liechtenstein");
        Equipo Uefa38 = new Equipo("Lituania");
        Equipo Uefa39 = new Equipo("Luxemburgo");
        Equipo Uefa40 = new Equipo("Macedonia del Norte");
        Equipo Uefa41 = new Equipo("Malta");
        Equipo Uefa42 = new Equipo("Moldavia");
        Equipo Uefa43 = new Equipo("Montenegro");
        Equipo Uefa44 = new Equipo("Noruega");
        Equipo Uefa45 = new Equipo("Paises Bajos");
        Equipo Uefa46 = new Equipo("Polonia");
        Equipo Uefa47 = new Equipo("Republica Checa");
        Equipo Uefa48 = new Equipo("Rumania");
        Equipo Uefa49 = new Equipo("Rusia");
        Equipo Uefa50 = new Equipo("San Marino");
        Equipo Uefa51 = new Equipo("Serbia");
        Equipo Uefa52 = new Equipo("Suecia");
        Equipo Uefa53 = new Equipo("Suiza");
        Equipo Uefa54 = new Equipo("Turquia");
        Equipo Uefa55 = new Equipo("Ucrania");
        
        // Agregar equipos de UEFA a la lista
        UEFA.agregarEquipo(Uefa1);
        UEFA.agregarEquipo(Uefa2);
        UEFA.agregarEquipo(Uefa3);
        UEFA.agregarEquipo(Uefa4);
        UEFA.agregarEquipo(Uefa5);
        UEFA.agregarEquipo(Uefa6);
        UEFA.agregarEquipo(Uefa7);
        UEFA.agregarEquipo(Uefa8);
        UEFA.agregarEquipo(Uefa9);
        UEFA.agregarEquipo(Uefa10);
        UEFA.agregarEquipo(Uefa11);
        UEFA.agregarEquipo(Uefa12);
        UEFA.agregarEquipo(Uefa13);
        UEFA.agregarEquipo(Uefa14);
        UEFA.agregarEquipo(Uefa15);
        UEFA.agregarEquipo(Uefa16);
        UEFA.agregarEquipo(Uefa17);
        UEFA.agregarEquipo(Uefa18);
        UEFA.agregarEquipo(Uefa19);
        UEFA.agregarEquipo(Uefa20);
        UEFA.agregarEquipo(Uefa21);
        UEFA.agregarEquipo(Uefa22);
        UEFA.agregarEquipo(Uefa23);
        UEFA.agregarEquipo(Uefa24);
        UEFA.agregarEquipo(Uefa25);
        UEFA.agregarEquipo(Uefa26);
        UEFA.agregarEquipo(Uefa27);
        UEFA.agregarEquipo(Uefa28);
        UEFA.agregarEquipo(Uefa29);
        UEFA.agregarEquipo(Uefa30);
        UEFA.agregarEquipo(Uefa31);
        UEFA.agregarEquipo(Uefa32);
        UEFA.agregarEquipo(Uefa33);
        UEFA.agregarEquipo(Uefa34);
        UEFA.agregarEquipo(Uefa35);
        UEFA.agregarEquipo(Uefa36);
        UEFA.agregarEquipo(Uefa37);
        UEFA.agregarEquipo(Uefa38);
        UEFA.agregarEquipo(Uefa39);
        UEFA.agregarEquipo(Uefa40);
        UEFA.agregarEquipo(Uefa41);
        UEFA.agregarEquipo(Uefa42);
        UEFA.agregarEquipo(Uefa43);
        UEFA.agregarEquipo(Uefa44);
        UEFA.agregarEquipo(Uefa45);
        UEFA.agregarEquipo(Uefa46);
        UEFA.agregarEquipo(Uefa47);
        UEFA.agregarEquipo(Uefa48);
        UEFA.agregarEquipo(Uefa49);
        UEFA.agregarEquipo(Uefa50);
        UEFA.agregarEquipo(Uefa51);
        UEFA.agregarEquipo(Uefa52);
        UEFA.agregarEquipo(Uefa53);
        UEFA.agregarEquipo(Uefa54);
        UEFA.agregarEquipo(Uefa55);
        
        // Crear equipos para AFC
        Confederacion AFC = new Confederacion(8,1);
        Equipo Afc1 = new Equipo("Australia");
        Equipo Afc2 = new Equipo("China");
        Equipo Afc3 = new Equipo("Indonesia");
        Equipo Afc4 = new Equipo("Afganistan");
        Equipo Afc5 = new Equipo("Arabia Saudita");
        Equipo Afc6 = new Equipo("Banglades");
        Equipo Afc7 = new Equipo("Barein");
        Equipo Afc8 = new Equipo("Birmania");
        Equipo Afc9 = new Equipo("Brunei");
        Equipo Afc10 = new Equipo("Butan");
        Equipo Afc11 = new Equipo("Camboya");
        Equipo Afc12 = new Equipo("China Taipei");
        Equipo Afc13 = new Equipo("Corea del Norte");
        Equipo Afc14 = new Equipo("Corea del Sur");
        Equipo Afc15 = new Equipo("Emirates Arabes Unidos");
        Equipo Afc16 = new Equipo("Filipinas");
        Equipo Afc17 = new Equipo("Guam");
        Equipo Afc18 = new Equipo("Hong Kong");
        Equipo Afc19 = new Equipo("India");
        Equipo Afc20 = new Equipo("Irak");
        Equipo Afc21 = new Equipo("Iran");
        Equipo Afc22 = new Equipo("Islas Marianas del Norte");
        Equipo Afc23 = new Equipo("Japon");
        Equipo Afc24 = new Equipo("Jordania");
        Equipo Afc25 = new Equipo("Kirguistan");
        Equipo Afc26 = new Equipo("Kuwait");
        Equipo Afc27 = new Equipo("Laos");
        Equipo Afc28 = new Equipo("Libano");
        Equipo Afc29 = new Equipo("Macao");
        Equipo Afc30 = new Equipo("Malasia");
        Equipo Afc31 = new Equipo("Maldivas");
        Equipo Afc32 = new Equipo("Mongolia");
        Equipo Afc33 = new Equipo("Nepal");
        Equipo Afc34 = new Equipo("Oman");
        Equipo Afc35 = new Equipo("Pakistan");
        Equipo Afc36 = new Equipo("Palestina");
        Equipo Afc37 = new Equipo("Qatar");
        Equipo Afc38 = new Equipo("Singapur");
        Equipo Afc39 = new Equipo("Siria");
        Equipo Afc40 = new Equipo("Sri Lanka");
        Equipo Afc41 = new Equipo("Tailandia");
        Equipo Afc42 = new Equipo("Tayikistan");
        Equipo Afc43 = new Equipo("Timor Oriental");
        Equipo Afc44 = new Equipo("Turkmenistan");
        Equipo Afc45 = new Equipo("Uzbekistan");
        Equipo Afc46 = new Equipo("Vietnam");
        Equipo Afc47 = new Equipo("Yemen");
        
        // Agregar equipos de AFC a la lista
        AFC.agregarEquipo(Afc1);
        AFC.agregarEquipo(Afc2);
        AFC.agregarEquipo(Afc3);
        AFC.agregarEquipo(Afc4);
        AFC.agregarEquipo(Afc5);
        AFC.agregarEquipo(Afc6);
        AFC.agregarEquipo(Afc7);
        AFC.agregarEquipo(Afc8);
        AFC.agregarEquipo(Afc9);
        AFC.agregarEquipo(Afc10);
        AFC.agregarEquipo(Afc11);
        AFC.agregarEquipo(Afc12);
        AFC.agregarEquipo(Afc13);
        AFC.agregarEquipo(Afc14);
        AFC.agregarEquipo(Afc15);
        AFC.agregarEquipo(Afc16);
        AFC.agregarEquipo(Afc17);
        AFC.agregarEquipo(Afc18);
        AFC.agregarEquipo(Afc19);
        AFC.agregarEquipo(Afc20);
        AFC.agregarEquipo(Afc21);
        AFC.agregarEquipo(Afc22);
        AFC.agregarEquipo(Afc23);
        AFC.agregarEquipo(Afc24);
        AFC.agregarEquipo(Afc25);
        AFC.agregarEquipo(Afc26);
        AFC.agregarEquipo(Afc27);
        AFC.agregarEquipo(Afc28);
        AFC.agregarEquipo(Afc29);
        AFC.agregarEquipo(Afc30);
        AFC.agregarEquipo(Afc31);
        AFC.agregarEquipo(Afc32);
        AFC.agregarEquipo(Afc33);
        AFC.agregarEquipo(Afc34);
        AFC.agregarEquipo(Afc35);
        AFC.agregarEquipo(Afc36);
        AFC.agregarEquipo(Afc37);
        AFC.agregarEquipo(Afc38);
        AFC.agregarEquipo(Afc39);
        AFC.agregarEquipo(Afc40);
        AFC.agregarEquipo(Afc41);
        AFC.agregarEquipo(Afc42);
        AFC.agregarEquipo(Afc43);
        AFC.agregarEquipo(Afc44);
        AFC.agregarEquipo(Afc45);
        AFC.agregarEquipo(Afc46);
        AFC.agregarEquipo(Afc47);
        
        // Crear sedes para Estados Unidos
        Sede sedesEstadosUnidos = new Sede(1,"Estados Unidos");
        Sede USA1 = new Sede("Atlanta");
        Sede USA2 = new Sede("Boston");
        Sede USA3 = new Sede("Dallas");
        Sede USA4 = new Sede("Houston");
        Sede USA5 = new Sede("Kansas City");
        Sede USA6 = new Sede("Los Ángeles");
        Sede USA7 = new Sede("Miami");
        Sede USA8 = new Sede("Nueva York/Nueva Jersey");
        Sede USA9 = new Sede("Filadelfia");
        Sede USA10 = new Sede("San Francisco");
        Sede USA11 = new Sede("Seattle");
        
        //Agregar sedes de Estados Unidos a la lista
        sedesEstadosUnidos.agregarSedes(USA1);
        sedesEstadosUnidos.agregarSedes(USA2);
        sedesEstadosUnidos.agregarSedes(USA3);
        sedesEstadosUnidos.agregarSedes(USA4);
        sedesEstadosUnidos.agregarSedes(USA5);
        sedesEstadosUnidos.agregarSedes(USA6);
        sedesEstadosUnidos.agregarSedes(USA7);
        sedesEstadosUnidos.agregarSedes(USA8);
        sedesEstadosUnidos.agregarSedes(USA9);
        sedesEstadosUnidos.agregarSedes(USA10);
        sedesEstadosUnidos.agregarSedes(USA11);
        
        // Crear sedes para Mexico
        Sede sedesMexico = new Sede(2,"Mexico");
        Sede MEX1 = new Sede("Guadalajara");
        Sede MEX2 = new Sede("Ciudad de México");
        Sede MEX3 = new Sede("Monterrey");
        
        //Agregar sedes de Mexico a la lista
        sedesMexico.agregarSedes(MEX1);
        sedesMexico.agregarSedes(MEX2);
        sedesMexico.agregarSedes(MEX3);
       
        // Crear sedes para Canada
        Sede sedesCanada = new Sede(3, "Canada");
        Sede CAN1 = new Sede("Vancouver");
        Sede CAN2 = new Sede("Toronto");
        
        //Agregar sedes de Canada a la lista
        sedesCanada.agregarSedes(CAN1);
        sedesCanada.agregarSedes(CAN2);
        
        Confederacion conf = new Confederacion();
        //Metodo principal para ejecutar la interfaz
        Diseño v = new Diseño(CAF,CONCACAF,CONMEBOL,OFC,UEFA,AFC);
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
}
