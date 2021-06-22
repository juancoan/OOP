package com.ucreativa.vacunacion.services;

public class ContadorRiesgo {

    private int cantidadRiesgo;
    private static  ContadorRiesgo instancia;

    //metodo estatido se asocia a la clase.
    public static ContadorRiesgo getInstance(){ // verificar si la instancia es nulla, si ya esta, se llama la creada, no se crea desde 0
        if (instancia == null){
            instancia = new ContadorRiesgo();
        }
        return instancia;

    }

    public int getCantidadRiesgo() {
        return this.cantidadRiesgo;
    }

    public void SumarRiesgo(){
        this.cantidadRiesgo++;
    }


}
