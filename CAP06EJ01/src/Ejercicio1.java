public class Ejercicio1 {
    public static void main(String[] args) {
        //Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
        int suma = 0;
        for(int i = 1;i<=3;i++){
            int dado = (int)(Math.random()*6+1);
            System.out.println("Tirada " + i + ":" + dado);
            suma += dado;
        }
        System.out.print("Puntos totales: " + suma);
    }
}   
