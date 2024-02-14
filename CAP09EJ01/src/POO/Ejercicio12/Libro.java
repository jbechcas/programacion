package POO.Ejercicio12;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    Libro(String isbn, String titulo, int publicacion) {
        super(isbn, titulo, publicacion);
        this.prestado = false;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void presta() {
        if (prestado) {
            System.out.println("Lo siento, ese libro ya está prestado");
        }else{
            this.prestado = true;
        }
        
    }
    @Override
    public void devuelve() {
        this.prestado = false;
    }
    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
    @Override
    public String toString() {
        String texto = "";
        if (prestado) {
            texto = "(prestado)";
        }else{
            texto = "(no prestado)";
        }
        return super.toString() + " " + texto;
    }
    
}
