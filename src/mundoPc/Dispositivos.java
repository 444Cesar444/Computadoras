package mundoPc;
import java.util.*;

public class Dispositivos {

    private String tipoEntrada,
                   marca;
    private int contador;

    /*Atributo statico (comparte la informacion)*/
    private static int contadorDispositivos;


    public Dispositivos(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        this.contador = ++Dispositivos.contadorDispositivos;
    }

    @java.lang.Override
    public String toString() {
        return "Dispositivos: {" +
                "tipoEntrada ='" + tipoEntrada + '\'' +
                ", marca ='" + marca + '\'';
    }

    /*Getters y Setters*/
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
