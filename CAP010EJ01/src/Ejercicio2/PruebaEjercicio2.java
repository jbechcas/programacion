package Ejercicio2;

import java.util.ArrayList;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int lista = (int)(Math.random()*11+10);
        int suma = 0;
        double media = 0;
        int maximo = 0;
        int minimo = 100;
        for(int i = 0;i<lista;i++){
            numeros.add((int)(Math.random()*101));
            suma += numeros.get(i);
            if(numeros.get(i)<minimo){
                minimo = numeros.get(i);
            }
            if(numeros.get(i)>maximo){
                maximo = numeros.get(i);
            }
        }
        media = (double)suma/lista;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
    
}
