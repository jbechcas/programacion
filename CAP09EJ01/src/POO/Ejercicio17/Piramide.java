package POO.Ejercicio17;

public class Piramide {
    private int altura;
    private static int piramidesCreadas;

    public Piramide(int altura){
        this.altura = altura;
        piramidesCreadas += 1;
    }
    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        for(int i = 1;i<=this.altura;i++){
            for(int j = i; j<=this.altura;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return texto.toString();
    }
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
}
