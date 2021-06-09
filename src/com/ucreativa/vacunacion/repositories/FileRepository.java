package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.util.Date;
import java.util.List;

//implemento la clase repository que es una interface.
//Utilizo los metodos genericos que se crearon en repository

public class FileRepository implements Repository {
    @Override
    public void save(Persona persona, String marca, Date fecha) {

    }

    @Override
    public List<String> get() {
        return null;
    }
/*
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
    public class CrearArchivo {
        public static void main(String ars[]){
            try {
                String ruta = "/ruta/filename.txt";
                String contenido = "Contenido de ejemplo";
                File file = new File(ruta);
                // Si el archivo no existe es creado
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

*/







}
