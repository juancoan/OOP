package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//importo librerias para manejo de archivos
import java.io.FileWriter;
import java.io.IOException;


//implemento la clase repository que es una interface.
//Utilizo los metodos genericos que se crearon en repository

public class FileRepository implements Repository {
    private List<String> ArrayList;

    @Override
    public void save(Persona persona, String marca, Date fecha) {

        try {
            FileWriter myWriter = new FileWriter("C:/Users/DELL/Desktop/Bitacora.txt");
            myWriter.write(String.valueOf(persona));
            myWriter.write(marca);
            myWriter.write(String.valueOf(fecha));
            myWriter.close();
            System.out.println("Creo el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear archivo.");
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        return new ArrayList<>();
    }


}
