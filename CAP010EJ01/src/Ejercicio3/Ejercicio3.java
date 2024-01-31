package Ejercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 10;i ++){
            System.out.print("Introduce un número: ");
            a.add(Integer.parseInt(System.console().readLine()));
            
        }
        Collections.sort(a);
        for(int numero : a){
            System.out.println(numero);
        }
    }
}
