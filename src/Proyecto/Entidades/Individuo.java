package Proyecto.Entidades;

public class Individuo {

    private String direccion;
    private String nombre;
    private String cedula;
    private String ebais;

    public Individuo(String direccion, String nombre, String cedula, String ebais) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cedula = cedula;
        this.ebais = ebais;
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

    public String getEbais() {
        return ebais;
    }


}


