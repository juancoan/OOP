//Juan Antonio Cordoba
package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Instanciando las clases
        Familiar fran = new Familiar("Fran", "321", 11, true, "Hijo");
        Amigo marchi = new Amigo("Marchi", "333", 38,false, "Compa", "Ninguno");
        Familiar jime = new Familiar("Jime", "123", 8, false, "Hija");

        //Lista List <Tipo de dato> Nombre = new ArrayList();
        List<Persona> familia = new ArrayList<>(); // lista de personas
        familia.add(fran); //agrego instancia de familia dentro de la lista
        familia.add(jime); //agrego instancia de familia dentro de la lista
        familia.add(marchi); //agrego instancia de amigo dentro de la lista

        List<BitacoraVacunas> bitacora = new ArrayList<>(); // lista de bitacoras
        bitacora.add(new BitacoraVacunas(fran, "Pfizer", new Date())); //agrego instancia de BitacoraVacunas dentro de la lista
        bitacora.add(new BitacoraVacunas(jime, "J&J", new Date())); //agrego instancia de BitacoraVacunas dentro de la lista
        bitacora.add(new BitacoraVacunas(marchi, "J&J", new Date())); //agrego instancia de BitacoraVacunas dentro de la lista


    }
}
