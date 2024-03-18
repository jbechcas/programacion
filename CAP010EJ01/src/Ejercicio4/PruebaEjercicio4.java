package Ejercicio4;

import java.sql.Array;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PruebaEjercicio4 {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<String>();
        numeros.add("hola");
        numeros.add("adios");
        numeros.add("basd");
        numeros.add("Azul");
        numeros.add("Rojo");
        numeros.add("Verde");
        numeros.add("Lu");
        numeros.add("Os");
        numeros.add("Da");
        numeros.add("Pa");
        numeros.sort(null);
        for (String integer : numeros) {
            System.out.println(integer);
        }
    }
}