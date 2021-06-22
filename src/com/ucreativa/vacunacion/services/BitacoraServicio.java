package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraServicio {

    private ContadorRiesgo contador;
    private Repository repository;

    public BitacoraServicio(Repository repository) {
        this.repository = repository;
        this.contador = ContadorRiesgo.getInstance(); // llamo a la instancia que secreo o si es nula (Patron singleton)
    }

    public void save(String nombre, String cedula, String txtedad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca) throws ErrorEnEdadException {

        int edad;
        try{
            edad = Integer.parseInt(txtedad);
        }catch (NumberFormatException x) {
            throw new ErrorEnEdadException(txtedad);
        }
        if (riesgo){
            this.contador.SumarRiesgo();
        }

        Persona persona;

        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }

    public List<String> get() {
        System.out.println("La cantidad de personas con riesgo es: " + this.contador.getCantidadRiesgo());
        return this.repository.get();
    }


}
