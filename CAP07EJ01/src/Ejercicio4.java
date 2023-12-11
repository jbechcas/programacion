public class Ejercicio4 {
    public static void main(String[] args) {
        long numero [] = new long[20];
        long cuadrado [] = new long[20];
        long cubo [] = new long[20];
        for(int i = 0;i<=19;i++){
            System.out.printf("%-5d%-7d%-8d",numero[i] = (long)(Math.random()*101),cuadrado[i]=numero[i]*numero[i],cubo[i]=cuadrado[i]*cuadrado[i]*cuadrado[i]);
            System.out.println(" ");
        }
    }
}
