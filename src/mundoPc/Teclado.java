package mundoPc;

public class Teclado extends Dispositivos {
    private int idTeclado,
            contador;

    private static int contadorTeclados;

    public Teclado(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        this.idTeclado = ++Teclado.contadorTeclados;
        //incremento el atributo statico y asignamos el valor

    }

    @Override
    public String toString() {
        return super.toString() +
                ", idTeclado =" + idTeclado +
                '}';
    }
}
