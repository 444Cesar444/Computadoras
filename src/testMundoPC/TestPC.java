package testMundoPC;

import mundoPc.Dispositivos;
import mundoPc.Raton;
import mundoPc.Teclado;

public class TestPC {
    public static void main(String[] args) {

        Teclado teclado = new Teclado("Logitech", "USB");
        System.out.println(teclado);
        System.out.println();

        Teclado teclado2 = new Teclado("HP", "USB");
        System.out.println(teclado2);


    }
}
