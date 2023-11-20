public class Ejercicio9 {
    public static void main(String[] args) {
        boolean salida = false;
        int contador = 0;
        while (!salida) {
        int numale = (int)(Math.random()*100)+1;
        System.out.print(numale + " ");
        contador = contador + 1;
        if(numale == 24){
            salida = true;
        }  
        }
        System.out.println(" ");
        System.out.print("Se han generado " + contador + " números");
    }
}
