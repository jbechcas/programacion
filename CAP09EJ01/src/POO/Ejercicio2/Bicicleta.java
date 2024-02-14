package POO.Ejercicio2;

public class Bicicleta extends Vehiculo {

    Bicicleta(int kilometrosRecorridos, String nombre, String matricula) {
        super(kilometrosRecorridos, nombre, matricula);
    }
    public void caballito(){
        System.out.println("Haces un caballito con la bicileta");
        this.kilometrosRecorridos += 15;
        setKilometrosTotales(this.kilometrosRecorridos);
    }
    
}
