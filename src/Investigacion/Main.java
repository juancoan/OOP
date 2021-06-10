package Investigacion;

public class Main {

    public static void main(String[] args) {

        SoyUnico juan = SoyUnico.getSingletonInstance("Juan Cordoba");
        SoyUnico juansito = SoyUnico.getSingletonInstance("Alguien Mas");

        //juan y juansito son referencias a un único objeto de la clase SoyUnico
        System.out.println(juan.getNombre());
        System.out.println(juansito.getNombre());

        try{
            SoyUnico JuanClon = juan.clone();
            System.out.println(JuanClon.getNombre());
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }


    }
}