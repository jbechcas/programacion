package POO.Ejercicio10;

public class Ameba {
    private int peso;

    public Ameba(){
        this.peso = 3;
    }

    public void come(int microgramos){
        this.peso += microgramos-1;
        microgramos = 0;
    }
    public void come(Ameba ameba){
        this.peso += ameba.peso-1;
        ameba.peso=0;
    }

    @Override
    public String toString() {
        String texto = "Soy una ameba y peso " + this.peso + " microgramos";
        return texto;
    }
}
