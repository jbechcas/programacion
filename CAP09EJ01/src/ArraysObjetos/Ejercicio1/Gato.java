package ArraysObjetos.Ejercicio1;

public class Gato {
    private String nombre;
    private String genero;
    private int edad;

    public Gato(String nombre, String genero, int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public Gato(){

    }

    @Override
    public String toString() {
        return String.format("%s %n %s %s %n %s %s %n %s %d","*********************",
        "Nombre:",edad,
        "Genero:",genero,
        "Edad:",edad);
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    
}
