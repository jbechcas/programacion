package POO.Ejercicio9;
public class Movil extends Terminal {

    private String tarifa;
    private double tarificado;

    public Movil(String numero,String tarifa) {
        super(numero);
        //TODO Auto-generated constructor stub
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal terminal, int tiempo) {
        super.llama(terminal, tiempo);
        double coste = 0;
        switch (this.tarifa) {
            case "rata":
                coste = 0.06;
                break;
            case "mono":
                coste = 0.12;
                break;
            case "bisonte":
                coste = 0.30;
                break;
            default:
                break;
        }
        this.tarificado += ((double)tiempo/60) * coste;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format("%s %1.2f %s","- tarificados",this.tarificado,"euros");
    }
    
}
