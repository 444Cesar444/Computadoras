package mundoPc;

public class Teclado extends Dispositivos {
    private int idTeclado,
                contador;

    private static int contadorTeclados;

    public Teclado(int idTeclado, String marca, String tipoEntrada) {
        super(tipoEntrada, marca);
        this.idTeclado = idTeclado;
        ++Teclado.contadorTeclados; //incremento el atributo statico

    }

    @Override
    public String toString() {
        return super.toString() +
                ", idTeclado =" + idTeclado +
                '}';
    }
}
