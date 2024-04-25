package mundoPc;

public class Raton extends Dispositivos {

    private int idRaton,
                contador;

    private static int contadorRatones;

    public Raton(int idRaton, String marca, String tipoEntrada) {
        super(tipoEntrada, marca);
        this.idRaton = idRaton;
        this.contador = ++Raton.contadorRatones;

    }

    @Override
    public String toString() {
        return super.toString() + "\'" +
                ", idRaton =" + idRaton + "\'" + "}";
    }
}
