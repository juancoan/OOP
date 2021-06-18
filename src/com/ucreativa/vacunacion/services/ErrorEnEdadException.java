package com.ucreativa.vacunacion.services;

public class ErrorEnEdadException extends Exception{

    public ErrorEnEdadException(String edad){
        super("La edad esta incorrecta: " + edad);

    }

}
