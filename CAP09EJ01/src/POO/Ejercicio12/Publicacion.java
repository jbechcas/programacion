package POO.Ejercicio12;

public class Publicacion {
    protected String isbn;
    protected String titulo;
    protected int publicacion;

    Publicacion(String isbn,String titulo,int publicacion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        String texto = "ISBN: " + isbn + ", título: " + titulo + ", año de publicación "+ publicacion;
        return texto;
    }
}
