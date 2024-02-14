package POO.Ejercicio11;

public class TarjetaRegalo {
    private double saldo;
    private String digitos = "";

    public TarjetaRegalo(double saldo){
        for (int i = 1;i<=5;i++){
            this.digitos += (int)(Math.random()*10);
            this.saldo = saldo;
        }   
    }

    public void gasta(double cantidad){
        if(this.saldo-cantidad<=0){
            System.out.println("No tiene suficiente saldo para gastar " + cantidad);
        }else{
            this.saldo -= cantidad;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo a){
        double nuevoSaldo = this.saldo + a.saldo;
        this.saldo = 0;
        a.saldo = 0;
        return new TarjetaRegalo(nuevoSaldo);
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %1.2f", "Tarjeta nº",this.digitos,"- Saldo",saldo);
    }
}
