package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Logica de almacenamiento en a db de bitocora

public class InMemoryRepo {

    private List<BitacoraVacunas> db; //creo una lista bitacora

    public InMemoryRepo() { //creo la lista
        this.db  = new ArrayList<>();
    }
    //metodo de guardar los datos en la lista
    public void save (Persona persona, String marca, Date fecha){
        this.db.add(new BitacoraVacunas(persona, marca, fecha));
    }

    public List<String> get(){
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
        for (BitacoraVacunas item: db){
            lines.add(item.getPersona(). getNombre() + " - " + item.getMarca() + " - " + item.getFecha());
        }
    return lines;
    }
}
