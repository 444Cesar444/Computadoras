package mundoPc;
import java.util.*;

public class Computadora {

    private String nombre;
    protected Monitor monitor;
    protected Teclado teclado;
    protected Raton raton;

    /*final es un atributo que no puede ser cambiado*/
    private final int idComputadora;
    private static int contadorComputadoras;


    public Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;

    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora {" +
                "nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                "idComputadora=" + idComputadora +
                '}';
    }



    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

}
