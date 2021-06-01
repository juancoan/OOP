package com.ucreativa.vacunacion.entities;

public class Persona {

    private String nombre;
    private String cedula;



    public Persona(String nombre, String cedula, int edad, Boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
    }

    public void setEdad(int edad) {
        this.edad = edad + 1;
    }

    public void setRiesgo(Boolean riesgo) {
        this.riesgo = riesgo;
    }

    private int edad;
    private Boolean riesgo;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public Boolean getRiesgo() {
        return riesgo;
    }


}
