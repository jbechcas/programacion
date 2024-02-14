package POO.Ejercicio16;

public class Linea  {
    private Punto a;
    private Punto b;
    public Linea(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return String.format("Linea formada por los puntos (%1.2f %1.2f) y (%1.2f %1.2f)",a.getX(),a.getY(),b.getX(),b.getY());
    }
}
