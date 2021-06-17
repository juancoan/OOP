package Proyecto.Entidades;

import javax.swing.*;

public class Individuo {

    protected String direccion;
    protected String nombre;
    protected String cedula;

    public Individuo(String direccion, String nombre, String cedula) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Individuo() {

    }


    public void setDireccion() {
        direccion = JOptionPane.showInputDialog("Ingrese su direccion porfavor. ");
        System.out.println("Direccion: " + direccion);
    }

    public void setNombre() {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre porfavor. ");
        System.out.println("Nombre: " + nombre);
    }

    public void setCedula() {
        cedula = JOptionPane.showInputDialog("Ingrese su cedula porfavor. ");
        System.out.println("Cédula: " + cedula);
    }


    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }


}


