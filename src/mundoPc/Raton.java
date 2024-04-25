package mundoPc;

public class Raton extends Dispositivos {

    /*final es un atributo que no puede cambiar (constante)*/
    private final int idRaton;

    private static int contadorRatones;

    public Raton(String marca, String tipoEntrada) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones; //Asignamos el valor del atributo statico


    }

    @Override
    public String toString() {
        return super.toString() + "\'" +
                ", idRaton =" + idRaton + "\'" + "}";
    }
}
