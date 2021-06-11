package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraServicio {

    private Repository repository;

    public BitacoraServicio(Repository repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String txtedad,
                     String txtriesgo, String txtisAmigo, String relacion,
                     String facebook, String parentesco, String marca) {

        int edad = Integer.parseInt(txtedad);
        boolean isAmigo = txtisAmigo.equals("A");
        boolean riesgo = txtriesgo.equals("S");
        Persona persona;

        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }

    public List<String> get() {
        return this.repository.get();
    }


}
