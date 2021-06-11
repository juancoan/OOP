package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
//importo librerias para manejo de archivos


//implemento la clase repository que es una interface.
//Utilizo los metodos genericos que se crearon en repository

public class FileRepository implements Repository {
    private final String FILE_PATH = "db.txt";

    @Override
    public void save(Persona persona, String marca, Date fecha) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
        String text = persona.getNombre()+ " " + marca + " " + format.format(fecha) + "\n"; // se pone lo mismo que guardo en InMemory
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH,true));
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override //muesta la lista salvada
    public List<String> get() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            reader.lines().collect(Collectors.toList());//leo lo del archivo y lo salvo a una lista
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
