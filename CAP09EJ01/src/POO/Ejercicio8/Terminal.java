package POO.Ejercicio8;

public class Terminal {
    private String numero;
    private int tiempo = 0;

    public Terminal(String numero){
        this.numero = numero;
    }

    public void llama(Terminal terminal,int tiempo){
        this.tiempo += tiempo;
        terminal.tiempo += tiempo;
    }

    @Override
    public String toString() {
        String texto = "Nº " + this.numero + " - " + tiempo +" de conversación" ;
        return texto;

    }
}

