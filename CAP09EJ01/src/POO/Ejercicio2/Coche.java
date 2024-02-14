package POO.Ejercicio2;

public class Coche extends Vehiculo{

    Coche(int kilometrosRecorridos, String nombre, String matricula) {
        super(kilometrosRecorridos, nombre, matricula);
        //TODO Auto-generated constructor stub
    }
    public void quemarRueda(){
        System.out.println("Quemas rueda con la bici");
        this.kilometrosRecorridos += 15;
        setKilometrosTotales(this.kilometrosRecorridos);
    }
    
}
