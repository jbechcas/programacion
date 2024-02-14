package POO.Ejercicio13;

public class CuentaCorriente {
    private String digitos;
    private int saldo;

    CuentaCorriente(int saldo){
        digitos = "";
        for(int i = 1; i<=10;i++){
            digitos += (int)(Math.random()*10);
        }
        this. saldo = saldo;
    }

    CuentaCorriente(){
        for(int i = 1; i<=10;i++){
            digitos += (int)(Math.random()*10);
        }
        this. saldo = 0;
    }

    public void ingreso(int cantidad){
        this.saldo += cantidad;
    }

    public void cargo(int cantidad){
        this.saldo-=cantidad;
    }

    public void transferencia(CuentaCorriente a,int cantidad){
        a.saldo += cantidad;
        this.saldo -= cantidad;
    }

    @Override
    public String toString() {
        String texto = "Número de cta: " + digitos + " Saldo: " + saldo;
        return texto;
    }
}
