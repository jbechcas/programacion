package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        int sizeArray = (int)(Math.random()*(10)+11);
        ArrayList<Integer> a = new ArrayList<>(sizeArray);
        for(int i = 1;i<=sizeArray;i++){
            a.add((int)(Math.random()*(101)));
        }
        //suma
        int suma = 0;
        int max = -1;
        int min = 101;
        for(int num : a){
            suma += num;
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }

        System.out.println("Suma Total: " + suma);
        System.out.println("Media Total: " + (double)suma/sizeArray);
        System.out.println("Número minimo: " + min);
        System.out.println("Número máximo: " + max);

        

        
    }
}
