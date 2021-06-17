package Proyecto.Repo;

import Proyecto.Entidades.Paciente;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RepoLocal {

        private final String FILE_PATH = "Pacientes_Atendidos.txt";


        public void save(Paciente patient) {
            JOptionPane.showMessageDialog(null,"Guardando datos...");
            String encabezado = String.join("\n","La informacion de pacientes recibidos fue guardada con exito en: " ,FILE_PATH);
            JOptionPane.showMessageDialog(null,encabezado);
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            String text =
                    "\nEbais: " + patient.getEbais() + "\n"
                    + "Paciente: " +  patient.getNombre() + "\n"
                    + "Direccion: " +  patient.getDireccion() + "\n"
                    + "Cédula: " + patient.getCedula() + "\n"
                    + "Atendido(a) a las: " + formato.format(fecha) + "\n"
                    + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*";
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH,true));
                writer.append(text);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
