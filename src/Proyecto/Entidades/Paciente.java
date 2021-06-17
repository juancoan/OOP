package Proyecto.Entidades;

import javax.swing.*;

public class Paciente extends Individuo{

    public String ebais;

    public Paciente() {
        super.setNombre();
        super.setCedula();
        super.setDireccion();

    }


    public String setEbais() {
        ebais = JOptionPane.showInputDialog("Ingrese el Ebais que lo atiende, porfavor. ");
        System.out.println("Ebais: "+ ebais);
        return ebais;

    }

    public String getEbais() {
        return ebais;
    }

}
