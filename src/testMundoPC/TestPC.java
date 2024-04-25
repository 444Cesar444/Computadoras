package testMundoPC;

import mundoPc.Dispositivos;
import mundoPc.Raton;
import mundoPc.Teclado;

public class TestPC {
    public static void main(String[] args) {

        Teclado teclado = new Teclado(1, "Logitech", "USB");
        System.out.println(teclado);
        System.out.println();

        Teclado teclado2 = new Teclado(2, "HP", "USB");
        System.out.println(teclado2);


    }
}
