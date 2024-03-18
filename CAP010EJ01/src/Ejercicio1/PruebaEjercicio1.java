package Ejercicio1;

import java.util.ArrayList;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Jorge");
        myArrayList.add("Miguel");
        myArrayList.add("Victor");
        myArrayList.add("Javi");
        myArrayList.add("Eladio");
        myArrayList.add("Lalo");

        for (String string : myArrayList) {
            System.out.println(string);
        }
    }
}
