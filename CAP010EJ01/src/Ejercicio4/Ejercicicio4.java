package Ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicicio4 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Juan");
        a.add("Jorge");
        a.add("Boris");
        a.add("Miguel");
        a.add("Antonio");
        Collections.sort(a);

        for(String nombre : a){
            System.out.println(nombre);
        }
    }
}
