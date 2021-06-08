package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class InMemoryRepo {

    private List<BitacoraVacunas> db; //creo una lista bitacora

    public InMemoryRepo() {
        this.db  = new ArrayList<>();
    }

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