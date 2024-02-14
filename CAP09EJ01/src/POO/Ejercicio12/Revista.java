package POO.Ejercicio12;

public class Revista extends Publicacion {

    @SuppressWarnings("unused")
    private int numero;

    Revista(String isbn, String titulo, int publicacion,int numero) {
        super(isbn, titulo, publicacion);
        //TODO Auto-generated constructor stub
        this.numero = numero;
    }

    

}
