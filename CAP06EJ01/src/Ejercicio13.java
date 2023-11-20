public class Ejercicio13 {
    public static void main(String[] args) {
        boolean salida = false;
        while (!salida) {
            int dado1 = (int)(Math.random()*6)+1;
            int dado2 = (int)(Math.random()*6)+1;
            System.out.println("Dado1: " + dado1 + " Dado2: " + dado2);
            if(dado1 == dado2){
                salida = true;
            }         
        }
    }
}
