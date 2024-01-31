package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        char a = 65;
        char array [] = new char[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(Math.random()*25 + 98);
            System.out.println(array[i]);
        }
    }
}
