//Juan Antonio Cordoba
package com.ucreativa;

import com.ucreativa.familia.Heredado;
import com.ucreativa.familia.Juan;
import com.ucreativa.familia.Papas;

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


    }
}
