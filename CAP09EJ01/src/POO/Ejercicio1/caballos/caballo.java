package POO.Ejercicio1.caballos;

public class caballo {
    private String nombre;
    private String color;
    private String raza;
    private String sexo;
    private String edad;
    private String altura;

    public caballo(String nombre,String color, String raza,String sexo,String altura, int edad){
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.altura = altura;
        this.edad = altura;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public String getAltura() {
        return altura;
    }

    public static void comer(){
        System.out.println("ñam ñam ñam ñam ñam ñam");
    }

    public static void andar(){
        System.out.println("toc toc toc toc toc");
    }
}
