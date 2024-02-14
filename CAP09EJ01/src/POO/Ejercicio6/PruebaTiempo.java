package POO.Ejercicio6;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0, 30, 40);
        System.out.println(t1);
        t1.suma(0, 35, 20);
        System.out.println(t1);
    }
}
