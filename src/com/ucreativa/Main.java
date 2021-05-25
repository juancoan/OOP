//Juan Antonio Cordoba
package com.ucreativa;

import com.ucreativa.familia.Juan;
import com.ucreativa.familia.Papas;

public class Main {

    public static void main(String[] args) {
        Juan Hola = new Juan(); //instancio la clase
        Papas Padres = new Papas("Hola Hijo.");
        int Edad = Padres.getAge();
        String Pasatiempo = Padres.getHobby();

        System.out.println("Edad: " + Edad);
        System.out.println("Hobby : " + Pasatiempo);


    }
}
