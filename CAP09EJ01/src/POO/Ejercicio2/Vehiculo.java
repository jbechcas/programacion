package POO.Ejercicio2;

public class Vehiculo {
    private int kilometrosTotales = 0;
    protected int kilometrosRecorridos;
    protected String nombre;
    protected String matricula;

    public void andar(){
        System.out.println("Andas");
        this.kilometrosRecorridos += 15;
        kilometrosTotales += this.kilometrosRecorridos;
        setKilometrosTotales(this.kilometrosRecorridos);
    }

    Vehiculo(int kilometrosRecorridos,String nombre,String matricula){
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.nombre = nombre;
        this.matricula = matricula;
    }

    Vehiculo(){

    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosTotales(int kilometrosTotales) {
        this.kilometrosTotales += kilometrosTotales;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }
}
