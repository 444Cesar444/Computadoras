package mundoPc;
import java.util.*;


public class Monitor {

    private String marca;
    private double size;

    //Atributo que no puede ser cambiado (final)
    private final int idMonitor;
    private static int contadorMonitoress;


    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitoress;
    }

    public Monitor(String marca, double size) {
        this(); //Llamamos al constructor vacio
        this.marca = marca;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor { " +
                "marca ='" + marca + '\'' +
                ", size =" + size + '\'' +
                ", idMonitor =" + idMonitor +
                '}';
    }

    /*GETTERS AND SETTERS*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }
}
