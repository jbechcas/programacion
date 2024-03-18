package Ejercicio5;

public class Disco {
    private String codigo = "";
    private String tema;
    private int duracion;

    public Disco(String tema, int duracion){
        for(int i = 1; i<=8;i++){
            this.codigo += (char)((int)(Math.random()*26 +97));
        }
        this.tema = tema;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return String.format("%s %n Codigo: %s %n Tema: %s %n Duración %d",
        "***************************",this.codigo,this.tema,this.duracion);
    }
}

