package Ejercicio3;

import java.sql.Array;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PruebaEjercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(23);
        numeros.add(64);
        numeros.add(243);
        numeros.add(245);
        numeros.add(15);
        numeros.add(33);
        numeros.add(83);
        numeros.add(3);
        numeros.add(1);
        numeros.add(10);
        numeros.sort(null);
        for (Integer integer : numeros) {
            System.out.println(integer);
        }
    }
}
