package Ejercicio1;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Jorge");
        a.add("Victor");
        a.add("Miguel");
        a.add("Jose");
        a.add("Eloy");
        a.add("Antonio");
    for(String nombre: a){
        System.out.println(nombre);
    }
    }
}
