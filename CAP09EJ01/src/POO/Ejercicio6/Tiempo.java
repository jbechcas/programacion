package POO.Ejercicio6;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas,int minutos,int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public void suma(int horas,int minutos, int segundos){
        int segudos1 = (this.horas*60*60)+(this.minutos*60)+ this.segundos;
        int segudos2 = (horas*60*60)+(minutos*60)+ segundos;
        int suma = segudos1+segudos2;
        this.horas = suma/3600;
        this.minutos = (suma%3600)/60;
        this.segundos =suma%60;
    }

    public void resta(int horas,int minutos, int segundos){
        int segudos1 = (this.horas*60*60)+(this.minutos*60)+ this.segundos;
        int segudos2 = (horas*60*60)+(minutos*60)+ segundos;
        int resta = segudos1-segudos2;
        this.horas = resta/3600;
        this.minutos = (resta%3600)/60;
        this.segundos =resta%60;
    }

    @Override
    public String toString() {
        String texto = this.horas + "h " + this.minutos + "m " + this.segundos + "s ";
        return texto;
    }
}
