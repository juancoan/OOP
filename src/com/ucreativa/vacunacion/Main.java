//Juan Antonio Cordoba
package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.UI.FrontEnd;
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

        //leyendo de la consola.
    FrontEnd fe = new FrontEnd("Sistema de Vacunacion");
    fe.build();

// NO NECESITO ESTO PORQUE LO PASE AL FRONTEND.JAVA
//    Scanner sc = new Scanner(System.in);
//    BitacoraServicio servicio = new BitacoraServicio(new FileRepository());//llamo a la clase del almacenamiento en un archivo
//    //Repository repo = new InMemoryRepo();//llamo a la clase del almacenamiento en memoria
//    String nombre, cedula, edad, riesgo, isAmigo, relacion = "", facebook = "", parentesco = "", marca, print;
//    while (true) {
//
//            //pido datos
//            System.out.println("Digite nombre: ");
//            nombre = sc.nextLine(); //siguiente linea
//
//            System.out.println("Digite cedula: ");
//            cedula = sc.nextLine(); //siguiente linea
//
//            System.out.println("Digite edad: ");
//            edad = sc.nextLine(); //siguiente linea
//
//            System.out.println("Digite riesgo (S/N): ");
//            riesgo = sc.nextLine(); //siguiente linea
//
//            System.out.println("Amigo(A)/Familiar(F)");
//            isAmigo = sc.nextLine();
//            if (isAmigo.equals("A")) { //verifica si es amigo o no
//
//                System.out.println("Digite relacion: ");
//                relacion = sc.nextLine(); //siguiente linea
//
//                System.out.println("Digite facebook id: ");
//                facebook = sc.nextLine(); //siguiente linea
//                //edad lo convierto y el riesgo lo convierto a booleano, poniendolo como condicion
//
//            } else {
//
//                System.out.println("Digite parentesco: ");
//                parentesco = sc.nextLine(); //siguiente linea
//            }
//            System.out.println("Digite marca:");
//            marca = sc.nextLine();
//
//            servicio.save(nombre, cedula,edad,riesgo,isAmigo,relacion,facebook,parentesco, marca);
//
//            System.out.println("Quiere imprimir lista(S)");
//            print = sc.nextLine(); //siguiente linea
//            if (print.equals("S")) {
//                for (String item : servicio.get())//recorro
//                    System.out.println(item);
//            }
//        }
    }
}
