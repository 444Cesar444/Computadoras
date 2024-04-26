package mundoPc;

import java.util.*;

public class Orden {

    /*Constante que define el maximo de computadoras*/
    private static final int MAX_COMPUTADORAS = 10;

    private Computadora computadora[]; //Array de Computadoras

    private final int idOrden;
    private static int contadorOrdenes;
    private static int contadorComputadoras;


    public Orden() {
        //Inicializamos el Array y el ID
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {

        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
            this.computadora[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se supero el limite de computadoras"
                    + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden#: " + this.idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadora[i]);
        }
    }


}
