package POO.Ejercicio4;

public class Prueba {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(40, 40);
        f1.dividir(2,3);
        System.out.println(+f1.getNumerador()+"/"+f1.getDenominador());
    }
}
