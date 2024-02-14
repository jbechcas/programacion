package POO.Ejercicio1;

import POO.Ejercicio1.caballos.caballo;

public class Ejercicio1 {
    public static void main(String[] args) {
        caballo caballo =  new caballo("pepe", "rojo", "pegaso", "macho","1m", 10);
        System.out.println(caballo.getAltura());
    }
}
