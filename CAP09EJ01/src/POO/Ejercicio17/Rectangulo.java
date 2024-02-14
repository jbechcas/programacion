package POO.Ejercicio17;

public class Rectangulo {
    private int altura;
    private int base;
    private static int rectangulosCreados;

    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
        rectangulosCreados += 1;
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        for(int i = 1; i<=this.altura;i++){
            for(int j = 1; j<= base;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return texto.toString();
    }
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

}
