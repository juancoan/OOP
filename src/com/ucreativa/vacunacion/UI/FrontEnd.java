package com.ucreativa.vacunacion.UI;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraServicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo){
        super(titulo); //llamo al papa, osea JFrame
        //this.build();

    }

    public void build(){
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true); //propiedad para hacerlo visible

    }

    public void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando le doy la X, se cierra
        super.setSize(400,200); //tamaño
        super.setLayout(new GridLayout(5,2)); //distribucion
    }

    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }


    private void crearComponentes(){

        //crear labels
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblcedula = new JLabel("Cedula");
        JLabel lbltxtedad = new JLabel("Edad");
        JLabel lbltxtriesgo = new JLabel("Riesgo");
        JLabel lbltxtisAmigo = new JLabel("Is Amigo?");
        JLabel lblrelacion  = new JLabel("Relacion?");
        JLabel lblfacebook = new JLabel("FB?");
        JLabel lblparentesco  = new JLabel("Parentesco?");
        JLabel lblmarca = new JLabel("Marca?");

        //crear textos
        JTextField txtNombre = new JTextField("Nombre");
        JTextField txtcedula = new JTextField("Cedula");
        JTextField txttxtedad = new JTextField("Edad");
        JTextField txtrelacion  = new JTextField("Relacion?");
        JTextField txtfacebook = new JTextField("FB?");
        JTextField txtparentesco  = new JTextField("Parentesco?");
        JTextField txtmarca = new JTextField("Marca?");


        JCheckBox txttxtriesgo = new JCheckBox("Riesgo");
        JCheckBox txttxtisAmigo = new JCheckBox("Is Amigo?");
        txttxtisAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblparentesco.setVisible(!txttxtisAmigo.isSelected());
                txtparentesco.setVisible(!txttxtisAmigo.isSelected());
                lblrelacion.setVisible(txttxtisAmigo.isSelected());
                txtrelacion.setVisible(txttxtisAmigo.isSelected());
                lblfacebook.setVisible(txttxtisAmigo.isSelected());
                lblfacebook.setVisible(txttxtisAmigo.isSelected());
            }
        });


        //super.getContentPane().add(lblNombre);
        JButton salvar = new JButton("Guardar");
        salvar.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            BitacoraServicio servicio = new BitacoraServicio(new FileRepository());
            servicio.save(txtNombre.getText(), txtcedula.getText(),
                    txttxtedad.getText(),
                    txttxtriesgo.isSelected(),
                    txttxtisAmigo.isSelected(),
                    txtrelacion.getText(),
                    txtfacebook.getText(),
                    txtparentesco.getText(),
                    txtmarca.getText());

                    txtNombre.setText("");
                    txtcedula.setText("");
                    txttxtedad.setText("");
                    txttxtriesgo.isSelected();
                    txttxtisAmigo.isSelected();
                    txtrelacion.setText("");
                    txtfacebook.setText("");
                    txtparentesco.setText("");
                    txtmarca.setText("");

            //lo imprimo en una ventana el reporte.
            String reporte = String.join("\n", servicio.get());
            JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);

        }
    });

        //agregar al ui
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblcedula);
        this.agregarComponente(txtcedula);
        this.agregarComponente(lbltxtedad);
        this.agregarComponente(txttxtedad);
        this.agregarComponente(lbltxtriesgo);
        this.agregarComponente(txttxtriesgo);
        this.agregarComponente(lbltxtisAmigo);
        this.agregarComponente(txttxtisAmigo);
        this.agregarComponente(lblrelacion);
        this.agregarComponente(txtrelacion);
        this.agregarComponente(lblfacebook);
        this.agregarComponente(txtfacebook);
        this.agregarComponente(lblparentesco);
        this.agregarComponente(txtparentesco);
        this.agregarComponente(lblmarca);
        this.agregarComponente(txtmarca);
        this.agregarComponente(salvar);



    }

}
