//Juan Antonio Cordoba
package Proyecto;


import Proyecto.Entidades.Paciente;
import Proyecto.Repo.Agenda;
import Proyecto.Repo.RepoLocal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String continuar = "Si";
        while (continuar.equals("Si")){
            Paciente patient = new Paciente();
            patient.setEbais();
            Agenda myAgenda = new Agenda();
            myAgenda.MostrarFecha();
            RepoLocal archivo = new RepoLocal();
            archivo.save(patient);
        continuar = JOptionPane.showInputDialog("Desea agregar/revisar otro dato: Si/No");
    }
   }

}

