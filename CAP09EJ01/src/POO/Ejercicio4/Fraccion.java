package POO.Ejercicio4;

public class Fraccion {
    private int numerador;
    private int denominador;

    Fraccion(int numerador,int denominador){
        this.numerador = numerador;
        this. denominador = denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void Invierte(){
        int aux = numerador;
        this.numerador = this.denominador;
        this.denominador = aux;
    }

    public void simplifica(){
        boolean salida = false;
        int mayor = 0;
        if(this.numerador>this.denominador){
            mayor = this.numerador;
        }else{
            mayor = this.denominador;
        }
        while (!salida) {
            salida = true;
            for(int i = 2; i<= mayor;i++){
                if(numerador%i==0 && denominador%i==0){
                    salida = false;
                    this.numerador = this.numerador/2;
                    this.denominador = this.denominador/2;
                }
            }
            
        }
    }

    public void dividir(int numerador, int denominador){
        this.numerador = this.numerador * denominador;
        this.denominador = this.denominador * numerador;
    }


}
