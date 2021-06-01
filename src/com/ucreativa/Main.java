//Juan Antonio Cordoba
package com.ucreativa;

import com.ucreativa.familia.Heredado;
import com.ucreativa.familia.Juan;
import com.ucreativa.familia.Papas;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Juan Hola = new Juan(); //instancio la clase
        Papas Padres = new Papas("Hola Hijo.");
        int Edad = Padres.getAge(); //asigno variable al getter para ver valor
        String Pasatiempo = Padres.getHobby();

        Heredado Alguien = new Heredado("Soy tu heredero.");
        int MiEdad = Alguien.getAge();
        String MiHobby = Alguien.getHobby();


        System.out.println("Edad: " + MiEdad);//imprimo la edad del getter
        System.out.println("Hobby : " + MiHobby);

        System.out.println("Edad: " + Edad);//imprimo la edad del getter
        System.out.println("Hobby : " + Pasatiempo);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Instanciando las clases
        Familiar fran = new Familiar("Fran", "321", 11, true, "Hijo");
        Amigo marchi = new Amigo("Marchi", "333", 38,false, "Compa", "Ninguno");
        Familiar jime = new Familiar("Jime", "123", 8, false, "Hija");

        //Lista List <Tipo de dato> Nombre = new ArrayList();
        List<Persona> familia = new ArrayList<>(); // lista de personas
        familia.add(fran); //agrego instancia de familia dentro de la lista
        familia.add(jime); //agrego instancia de familia dentro de la lista
        familia.add(marchi); //agrego instancia de amigo dentro de la lista

    }
}
