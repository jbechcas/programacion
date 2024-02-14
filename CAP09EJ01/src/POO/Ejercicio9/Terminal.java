package POO.Ejercicio9;

public class Terminal {
    protected String numero;
    protected int tiempo = 0;

    public Terminal(String numero){
        this.numero = numero;
    }

    public void llama(Terminal terminal,int tiempo){
        this.tiempo += tiempo;
        terminal.tiempo += tiempo;
    }

    @Override
    public String toString() {
        String texto = "Nº " + this.numero + " - " + tiempo +"s de conversación" ;
        return texto;

    }
}

